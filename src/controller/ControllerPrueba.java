package controller;

import Extra.ARFFFile;
import Extra.MyRecord;
import Extra.MyTable;
import Extra.MyWekaTools;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.MyEnsemble;
import model.MyClassifier;
import model.MyFile;
import model.MyPreprocess;
import view.ViewPrueba;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.gui.beans.ModelPerformanceChart;
import weka.gui.beans.VisualizableErrorEvent;
import weka.gui.visualize.Plot2D;
import weka.gui.visualize.PlotData2D;

public class ControllerPrueba implements ActionListener{
    private ViewPrueba view;
    private final MyEnsemble model;
    private ArrayList<MyFile> filesAvailable;
    private Instances testFile;
    private Instances predictions;
    
    public ControllerPrueba(ViewPrueba view,MyEnsemble model,ArrayList<MyFile> filesAvailable){
        this.view = view;
        this.model = model;
        this.filesAvailable = filesAvailable;
        this.testFile = null;
        this.predictions = null;
        resetIndividualTab();
        resetConjuntoTab();
        
        view.btnPruebaReiniciar.addActionListener(this);
        view.btnPruebaEvaluar.addActionListener(this);
        view.btnArchivoFile.addActionListener(this);
        view.btnArchivoCargar.addActionListener(this);
        view.btnArchivoReiniciar.addActionListener(this);
        view.btnEvaluarConjunto.addActionListener(this);
        view.btnVisualizarConjunto.addActionListener(this);
        view.btnRecargar.addActionListener(this);
    }

    private void resetIndividualTab(){
        view.jTextPaneInstancia.setText(null);
        view.lblClassPredicted.setText(null);
        initIndividualEvaluationTable();
    }
    
    private void conjuntoTabBlocked(boolean b){
        view.btnArchivoFile.setEnabled(b);
        view.btnArchivoCargar.setEnabled(b);
        view.btnArchivoReiniciar.setEnabled(!b);
        view.btnEvaluarConjunto.setEnabled(!b);
        view.btnVisualizarConjunto.setEnabled(!b);
        view.tblPrediccionesConjunto.setEnabled(!b);
        view.cmbArchivos.setEnabled(b);
        view.chkSubir.setEnabled(b);
        view.lblArchivo.setEnabled(b);
        view.btnRecargar.setEnabled(b);
    }
    
    private void resetConjuntoTab(){
        view.inputArchivoRuta.setText(null);
        conjuntoTabBlocked(true);
        view.txtNumInstancias.setText(null);
        view.txtClasificadasCorrectamente.setText(null);
        view.txtClasificadasIncorrectamente.setText(null);
        DefaultTableModel tableModel = (DefaultTableModel)view.tblPrediccionesConjunto.getModel();
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);
        view.cmbArchivos.removeAllItems();
        loadFilesAvailable();
        testFile = null;
        predictions = null;
    }
    
    private void selectFile(){
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter ff = new FileNameExtensionFilter("Txt pre-formateado","txt");
        chooser.setFileFilter(ff);
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String fileName=f.getAbsolutePath();
        view.inputArchivoRuta.setText(fileName);
    }
    
    private void loadFile(){
        if(view.chkSubir.isSelected()){
            String filePath = view.inputArchivoRuta.getText();
            MyRecord r1;
        
            if(filePath.equals("")){return;}

            //READCSV NEEDS TO THROW EXCEPTION WHEN FILE IS NOT COMPATIBLE
            try{
                r1 = ARFFFile.readCsv(filePath);
            }catch(Exception e){
                JOptionPane.showMessageDialog(view, "El archivo seleccionado no es un formato váido.","Error.",JOptionPane.ERROR_MESSAGE);
                return;
            }

            //PREPARING TEST FILE
            Instances originalSchema = ARFFFile.readArffFile(filesAvailable.get(0).getFilePath());
            originalSchema = MyWekaTools.numericToNominal(originalSchema, originalSchema.numAttributes()-1);
            originalSchema.delete();

            testFile = new Instances(originalSchema);

            for(Instance instance : ARFFFile.transformCSVToARFF(r1)){
                testFile.add(instance);
            }
        }
        else{
            MyFile file = MyFile.getMyFileFromList(filesAvailable, (String)view.cmbArchivos.getItemAt(view.cmbArchivos.getSelectedIndex()));
            testFile = ARFFFile.readArffFile(file.getFilePath());
        }
        
        conjuntoTabBlocked(false);
        view.txtNumInstancias.setText(Integer.toString(testFile.numInstances()));
    }
    
    //ORIGINAL
//    private void loadFile(){
//        String filePath = view.inputArchivoRuta.getText();
//        MyRecord r1;
//        
//        if(filePath.equals("")){return;}
//        
//        //READCSV NEEDS TO THROW EXCEPTION WHEN FILE IS NOT COMPATIBLE
//        try{
//            r1 = ARFFFile.readCsv(filePath);
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(view, "El archivo seleccionado no es un formato váido.","Error.",JOptionPane.ERROR_MESSAGE);
//            return;
//        }
//        
//        //PREPARING TEST FILE
//        Instances originalSchema = ARFFFile.readArffFile(filesAvailable.get(0).getFilePath());
//        originalSchema = MyWekaTools.numericToNominal(originalSchema, originalSchema.numAttributes()-1);
//        originalSchema.delete();
//        
//        testFile = new Instances(originalSchema);
//        
//        for(Instance instance : ARFFFile.transformCSVToARFF(r1)){
//            testFile.add(instance);
//        }
//
//        conjuntoTabBlocked(false);
//        view.txtNumInstancias.setText(Integer.toString(testFile.numInstances()));
//    }
    
    private void initIndividualEvaluationTable(){
        MyTable.clearTable(view.tblIndividualEvaluation);
        DefaultTableModel tableModel = (DefaultTableModel) view.tblIndividualEvaluation.getModel();
        
        tableModel.addColumn("ID CLASIFICADOR");
        tableModel.addColumn("Tipo");
        tableModel.addColumn("Clase elegida");   
    }
    
    private void loadFilesAvailable(){
        view.cmbArchivos.removeAllItems();
        for(MyFile file: filesAvailable){
            view.cmbArchivos.addItem(file.getFileName());
        }
    }
    
    private void printPredictedClass(double predictedClass){
        view.lblClassPredicted.setText(Double.toString(predictedClass));
    }
    
    public ViewPrueba getView(){
        return view;
    }
    
    private boolean inputIsValid(String textInput){
        try {
            String filePath = filesAvailable.get(0).getFilePath();
            Instances originalDataStructure = new DataSource(filePath).getStructure();
            originalDataStructure.setClassIndex(-1);
            originalDataStructure.deleteAttributeAt(originalDataStructure.numAttributes()-1);
            
            //CHECK IF VALID INPUT
            if(!MyWekaTools.validTextInputAsInstance(textInput, originalDataStructure.numAttributes())){
                JOptionPane.showMessageDialog(null,
                        "La entrada no es válida.\nEl formato debe contener " + (originalDataStructure.numAttributes()) + " valores, separados por coma.",
                        "Error de entrada",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
            
            return true;
        } catch (Exception ex) {
            Logger.getLogger(ControllerPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private void printPredictionsOnTable(){
        DefaultTableModel tableModel = (DefaultTableModel)view.tblIndividualEvaluation.getModel();
        
        Vector<String> row;
        double []predictions = model.getPredictedClasses();
        
        
        for(int i=0;i<predictions.length;i++){
            row = new Vector<>();
            row.add(Integer.toString(model.getClassifiers().get(i).getId()));
            row.add(model.getClassifiers().get(i).getType());
            row.add(Double.toString(predictions[i]));
            tableModel.addRow(row);
        }
    }
    
    private void evaluateInstance(){
        initIndividualEvaluationTable();
        String textInput = view.jTextPaneInstancia.getText();
        
        if(!inputIsValid(textInput)){
            return;
        }
        
        double predictedClass = model.evaluateInstance(MyWekaTools.textToInstance(textInput));
        
        
        //FINAL RESULTS
        printPredictionsOnTable();
        printPredictedClass(predictedClass);
    }
    
    private void evaluateInstances(){
        //PREPARING TESTFILE
        testFile.setClassIndex(testFile.numAttributes()-1);
        
        //INSTANCES WITH PREDICTIONS
        Instances predictionData = new Instances(testFile);
        Attribute predictedClassAttribute = testFile.attribute(testFile.numAttributes()-1).copy("predictedClass");
        predictionData.insertAttributeAt(predictedClassAttribute, testFile.numAttributes()-1);
        
        //STATISTICS OF EVALUATION
        int correctlyClassified = 0, badlyClassified = 0;
        DefaultTableModel tableModel = (DefaultTableModel)view.tblPrediccionesConjunto.getModel();
        tableModel.addColumn("Instancia");
        tableModel.addColumn("Clase real");
        tableModel.addColumn("Clase Predicha");
        
        for(int i=0;i<model.getSize();i++){
            tableModel.addColumn("<html>"+ "Clasificador " + model.getClassifiers().get(i).getId() + "<br>(" + model.getClassifiers().get(i).getPrcPrecision() + ")</html>");
        }
        
        
        //EVALUATING INSTANCES
        for(int i=0;i<testFile.numInstances();i++){
            //EVALUATE INSTANCE
            double predictedClass = model.evaluateInstance(testFile.instance(i));
            double []results = model.getPredictedClasses();
            double realClass = predictionData.instance(i).value(predictionData.numAttributes()-1);
                    
            //PRINT CLASSIFICATION INFORMATION
            Vector<String> row = new Vector<>();
            row.add(Integer.toString(i+1));
            row.add(Double.toString(realClass));
            row.add(Double.toString(predictedClass));
            
            for(int j=0;j<model.getSize();j++){
                row.add(Double.toString(results[j]));
            }
            
            tableModel.addRow(row);
            
            //SET CORRECT OR BAD CLASSIFICATION
            if(predictedClass == realClass){ correctlyClassified++;}
            else{ badlyClassified++;}
            
            //CREAR NUEVO CONJUNTO, COPIA DE testFile ADICIONANDO ATRIBUTO predictedClass
            predictionData.instance(i).setValue(predictionData.numAttributes()-2, predictedClass);
        }
        
        //PRINT STATISTICS
        double prcCorrect = correctlyClassified * 1.0 / (correctlyClassified+badlyClassified);
        double prcIncorrect = badlyClassified * 1.0 / (correctlyClassified+badlyClassified);
        
        view.txtClasificadasCorrectamente.setText(String.format("%.2f", prcCorrect*100.0) + "%");
        view.txtClasificadasIncorrectamente.setText(String.format("%.2f", prcIncorrect*100.0) + "%");
        
        
        //CREATE PLOT
        predictions = predictionData;
    }
    
    private void displayPlotPredictions() throws Exception{
        //Array of shapes
        int []shapes = new int[predictions.numInstances()];
        double predictedClass,realClass;
        
        for(int i=0;i<predictions.numInstances();i++){
            predictedClass = predictions.instance(i).value(predictions.numAttributes()-2);
            realClass = predictions.instance(i).value(predictions.numAttributes()-1);
            
            shapes[i] = (predictedClass == realClass) ? Plot2D.PLUS_SHAPE : Plot2D.ERROR_SHAPE;
        }
        
        final javax.swing.JFrame jf = new javax.swing.JFrame();
        jf.getContentPane().setLayout(new java.awt.BorderLayout());
        final ModelPerformanceChart as = new ModelPerformanceChart();
        PlotData2D pd2 = new PlotData2D(predictions);
        pd2.setShapeType(shapes);
        
        
        pd2.setPlotName(predictions.relationName());
        //ThresholdDataEvent roc = new ThresholdDataEvent(as, pd);
        VisualizableErrorEvent roc = new VisualizableErrorEvent(as,pd2);
        as.acceptDataSet(roc);

        jf.getContentPane().add(as, java.awt.BorderLayout.CENTER);
        jf.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            jf.dispose();
          }
        });
        jf.setSize(800, 600);
        jf.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source == view.btnPruebaReiniciar){
            resetIndividualTab();
        }
        
        else if(source == view.btnPruebaEvaluar){
            evaluateInstance();
        }
        
        else if(source == view.btnArchivoFile){
            selectFile();
        }
        
        else if(source == view.btnArchivoCargar){
            loadFile();
        }
        
        else if(source == view.btnArchivoReiniciar){
            resetConjuntoTab();
        }
        
        else if(source == view.btnEvaluarConjunto){
            evaluateInstances();
        }
        
        else if(source == view.btnRecargar){
            loadFilesAvailable();
        }
        
        else if(source == view.btnVisualizarConjunto){
            try {
                displayPlotPredictions();
            } catch (Exception ex) {
                Logger.getLogger(ControllerPrueba.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
