package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import model.MyEnsemble;
import model.MyClassifier;
import model.MyFile;
import view.FormKnn;
import view.FormMultilayerPerceptron;
import view.FormNaiveBayes;
import view.ViewClasificadores;
import view.ViewClassifierInfo;

public class ControllerClasificadores implements ActionListener{
    private ViewClasificadores view;
    private MyEnsemble model;
    private ArrayList<MyFile> filesAvailable;
    
    public ControllerClasificadores(ViewClasificadores view,MyEnsemble model,ArrayList<MyFile> filesAvailable){
        this.view = view;
        this.model = model;
        this.filesAvailable = filesAvailable;
        reset();
        view.btnClasificadoresAgregar.addActionListener(this);
        view.btnClasificadoresReiniciar.addActionListener(this);
    }
    
    public ViewClasificadores getView(){
        return this.view;
    }
    
    private void reset(){
        resetFields();
        resetEnsemble();
        loadClassifiersAvailable();
        repaintClassifiers();
    }
    
    private void resetFields(){
        view.lblNumClasificadores.setText(null);
        view.lblPrcExactitud.setText(null);
        view.cmbClasificadoresClasificadores.removeAllItems();
        
        //REMOVING ALL CLASSIFIERS
        view.jPanelListaClasificadores.removeAll();
    }
    
    private void resetEnsemble(){
        model.resetEnsemble();
    }
    
    private void addClassifierToAssemble(String classifierType){
        int id = MyEnsemble.getNewId();
        ViewClassifierInfo viewInfo = new ViewClassifierInfo();
        viewInfo.lblId.setText(Integer.toString(id));
        viewInfo.lblTipo.setText(classifierType);
        MyClassifier newClassifier = new MyClassifier(id,classifierType);
        
        if(classifierType.equals("KNN")){
            ControllerFormKnn controllerKnn = new ControllerFormKnn(new FormKnn(),filesAvailable);
            
            //CLASSIFIER INFO EDIT BTN
            viewInfo.btnEditar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(view);
                    JDialog dialog = new JDialog(topFrame,("Classifier KNN"),true);
                    
                    controllerKnn.loadListOfFiles();
                    dialog.add(controllerKnn.view);
                    dialog.setSize(controllerKnn.view.getPreferredSize());
                    dialog.setVisible(true);
                    dialog.setLocationRelativeTo(null);
                }
            });
            
            //KNN FORM TRAIN CLASSIFIER BTN
            controllerKnn.view.btnEntrenarClasificador.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    controllerKnn.establishClassifier();
                    newClassifier.setClassifier(controllerKnn.classifier);
                    newClassifier.setPrcPrecision(Float.parseFloat(controllerKnn.view.lblCorrectlyClassified.getText()));
                    newClassifier.setTrainingSet(MyFile.getMyFileFromList(filesAvailable, controllerKnn.view.cmbArchivoUitilizar.getItemAt(controllerKnn.view.cmbArchivoUitilizar.getSelectedIndex())));
                    model.addClassifier(newClassifier);
                    loadAssembleInformation();
                    viewInfo.lblExactitud.setText(String.format("%.2f",newClassifier.getPrcPrecision())+"%");
                    controllerKnn.view.sectionBlocked(true);
                }
            });
            
            //CLASSIFIER INFO DELETE BTN
            viewInfo.btnEliminar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    removeClassifierFromAssamble(newClassifier,viewInfo);
                    loadAssembleInformation();
                }
            });
        }
        
        else if(classifierType.equals("Naive Bayes")){
            ControllerFormNaiveBayes controllerNB = new ControllerFormNaiveBayes(new FormNaiveBayes(),filesAvailable);
            
            //CLASSIFIER INFO EDIT BTN
            viewInfo.btnEditar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(view);
                    JDialog dialog = new JDialog(topFrame,("Classifier KNN"),true);
                    
                    controllerNB.loadListOfFiles();
                    dialog.add(controllerNB.view);
                    dialog.setSize(controllerNB.view.getPreferredSize());
                    dialog.setVisible(true);
                    dialog.setLocationRelativeTo(null);
                }
            });
            
            //NB FROM TRAIN CLASSIFIER BTN
            controllerNB.view.btnEntrenarClasificador.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    controllerNB.establishClassifier();
                    newClassifier.setClassifier(controllerNB.classifier);
                    newClassifier.setPrcPrecision(Float.parseFloat(controllerNB.view.lblCorrectlyClassified.getText()));
                    newClassifier.setTrainingSet(MyFile.getMyFileFromList(filesAvailable, controllerNB.view.cmbArchivoUitilizar.getItemAt(controllerNB.view.cmbArchivoUitilizar.getSelectedIndex())));
                    model.addClassifier(newClassifier);
                    loadAssembleInformation();
                    viewInfo.lblExactitud.setText(String.format("%.2f",newClassifier.getPrcPrecision())+"%");
                    controllerNB.view.sectionBlocked(true);
                }
            });
            
            //CLASSIFIER INFO DELETE BTN
            viewInfo.btnEliminar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    removeClassifierFromAssamble(newClassifier,viewInfo);
                    loadAssembleInformation();
                }
            });
        }
        
        else if(classifierType.equals("Multilayer Perceptron")){
            ControllerFormMultilayerPerceptron controllerMP = new ControllerFormMultilayerPerceptron(new FormMultilayerPerceptron(),filesAvailable);
            
            //CLASSIFIER INFO EDIT BTN
            viewInfo.btnEditar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(view);
                    JDialog dialog = new JDialog(topFrame,("Classifier Multilayer Perceptron"),true);
                    
                    controllerMP.loadListOfFiles();
                    dialog.add(controllerMP.view);
                    dialog.setSize(controllerMP.view.getPreferredSize());
                    dialog.setVisible(true);
                    dialog.setLocationRelativeTo(null);
                }
            });
            
            //MP FROM TRAIN CLASSIFIER BTN
            controllerMP.view.btnEntrenarClasificador.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    controllerMP.establishClassifier();
                    newClassifier.setClassifier(controllerMP.classifier);
                    newClassifier.setPrcPrecision(Float.parseFloat(controllerMP.view.lblCorrectlyClassified.getText()));
                    newClassifier.setTrainingSet(MyFile.getMyFileFromList(filesAvailable, controllerMP.view.cmbArchivoUitilizar.getItemAt(controllerMP.view.cmbArchivoUitilizar.getSelectedIndex())));
                    model.addClassifier(newClassifier);
                    loadAssembleInformation();
                    viewInfo.lblExactitud.setText(String.format("%.2f",newClassifier.getPrcPrecision())+"%");
                    controllerMP.view.sectionBlocked(true);
                }
            });
            
            //CLASSIFIER INFO DELETE BTN
            viewInfo.btnEliminar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    removeClassifierFromAssamble(newClassifier,viewInfo);
                    loadAssembleInformation();
                }
            });
        }
        
        //ADDING TO ATRIBUTOS TAB
        view.jPanelListaClasificadores.add(viewInfo);
        repaintClassifiers();
    }
    
    private void removeClassifierFromAssamble(MyClassifier classifier,ViewClassifierInfo viewToRemove){
        removeClassifierFromAssemble(classifier);
        removeClassifierFromView(viewToRemove);
        repaintClassifiers();
    }
    
    private void loadAssembleInformation(){
        view.lblNumClasificadores.setText(Integer.toString(model.getSize()));
        view.lblPrcExactitud.setText(String.format("%.2f",model.getPrcPrecision()*100) + "%");
    }
    
    private void loadClassifiersAvailable(){
        for(String classifierType : MyEnsemble.getClassifiersAvailable()){
            view.cmbClasificadoresClasificadores.addItem(classifierType);
        }
    }
    
    private void removeClassifierFromAssemble(MyClassifier classifier){
        model.removeClassifier(classifier);
    }
    
    private void removeClassifierFromView(ViewClassifierInfo viewToRemove){
        view.jPanelListaClasificadores.remove(viewToRemove);
    }
    
    private void repaintClassifiers(){
        view.jPanelListaClasificadores.revalidate();
        view.jPanelListaClasificadores.repaint();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        
        if(source == view.btnClasificadoresAgregar){
            addClassifierToAssemble((String)view.cmbClasificadoresClasificadores.getItemAt(view.cmbClasificadoresClasificadores.getSelectedIndex()));
        }
        
        else if(source == view.btnClasificadoresReiniciar){
            reset();
        }
    }
}
