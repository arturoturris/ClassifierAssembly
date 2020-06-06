package controller;

import Extra.ARFFFile;
import Extra.MyTable;
import Extra.MyWekaTools;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import model.MyFile;
import view.FormMultilayerPerceptron;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.Attribute;
import weka.core.Instances;

public class ControllerFormMultilayerPerceptron implements ActionListener{
    ArrayList<MyFile> filesAvailable;
    FormMultilayerPerceptron view;
    Instances data;
    Classifier classifier;
    Classifier buffer;
    
    public ControllerFormMultilayerPerceptron(FormMultilayerPerceptron view,ArrayList<MyFile> filesAvailable){
        this.view = view;
        this.filesAvailable = filesAvailable;
        this.data = null;
        this.classifier = null;
        this.buffer = null;
        
        view.btnComprobar.addActionListener(this);
        view.btnEntrenarClasificador.addActionListener(this);
        view.btnModificarClasificador.addActionListener(this);
    }
    
    public void loadListOfFiles(){
        view.cmbArchivoUitilizar.removeAllItems();
        
        for(MyFile file: filesAvailable){
            view.cmbArchivoUitilizar.addItem(file.getFileName());
        }
    }
    
    private void setData(){
        try {
            String filePath = MyFile.getFilePath(filesAvailable, view.cmbArchivoUitilizar.getItemAt(view.cmbArchivoUitilizar.getSelectedIndex()));
            data = ARFFFile.readArffFile(filePath);
            data.setClassIndex(data.numAttributes()-1);
        } catch (Exception ex) {
            Logger.getLogger(ControllerFormMultilayerPerceptron.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void establishClassifier(){
        classifier = buffer;
    }
    
    public void evaluateModel(){
        try {
            //READING FILE SELECTED
            setData();
            
            //SETTING CLASSIFIER
            buffer = new MultilayerPerceptron();
            MultilayerPerceptron buff = (MultilayerPerceptron)buffer;
            buff.setLearningRate((double)view.spnLearningRate.getValue());
            buff.setMomentum((double)view.spnMomentum.getValue());
            buff.setTrainingTime((int)view.spnNumEpochs.getValue());
            buff.setSeed((int)view.spnSeed.getValue());
            buff.setHiddenLayers(view.txtNodes.getText());
            
            //EVALUATING
            int folds = view.cmbPrcValidation.isSelected()? 100/(int)view.validacionPrc.getValue() : (int)view.numberFolds.getValue();
            Evaluation evaluation = new Evaluation(data);
            evaluation.crossValidateModel(buffer,data,folds,new Random(Long.parseLong(view.jEditorPane1.getText())));
            
            //IF CLASS IS NOMINAL DISPLAY CONFUSION MATRIX
            if(data.attribute(data.classIndex()).isNominal()){
                double [][]confusionMatrix = evaluation.confusionMatrix();

                //PRINTING RESULTS
                String []headers = new String[data.numClasses()];
                Attribute classAttribute = data.attribute(data.numAttributes()-1);
                Enumeration classValues = classAttribute.enumerateValues();
                //GETTING HEADERS
                for (int i=0; classValues.hasMoreElements();i++){
                    headers[i] = (String)classValues.nextElement();
                }

                MyTable.displayConfusionMatrix(view.tblMatrizDeConfusion,confusionMatrix, headers);
            }
            
            
            //IF CLASS IS NUMERIC DISPLAY 
            else{
                final JPanel panel = new JPanel();
                String message = "La clase no es nominal. No es posible mostrar la matriz de confusión.";
                JOptionPane.showMessageDialog(panel, message, "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            buffer.buildClassifier(data);
            view.lblCorrectlyClassified.setText(String.format("%.2f",evaluation.pctCorrect()));
            view.lblBadlyClassified.setText(String.format("%.2f",evaluation.pctIncorrect()));
            
            
        } catch (Exception ex) {
            Logger.getLogger(ControllerFormMultilayerPerceptron.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public Classifier getClassifier(){
        return classifier;}
    
    public FormMultilayerPerceptron getView(){
        return view;}
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        
        if(source == view.btnComprobar){
            evaluateModel();
            view.btnEntrenarClasificador.setEnabled(true);
        }
        
        else if(source == view.btnModificarClasificador){
        
        }
        
    }
}
