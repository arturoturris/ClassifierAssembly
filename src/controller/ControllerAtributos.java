package controller;

import Extra.ARFFFile;
import Extra.MyTable;
import Extra.MyWekaTools;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import model.MyFile;
import model.MyPreprocess;
import view.MainView;
import view.ViewAtributos;
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;
import weka.filters.Filter;
import weka.filters.supervised.instance.StratifiedRemoveFolds;
import weka.filters.unsupervised.attribute.Normalize;
import weka.filters.unsupervised.attribute.NumericToNominal;

public class ControllerAtributos implements ActionListener{
    private ViewAtributos view;
    private ArrayList<MyFile> model;
    private Instances instancesBeingTransformed;
    private MyPreprocess actualPreprocessOnInstances;
    
    public ControllerAtributos(ViewAtributos view,ArrayList<MyFile> model){
        this.view = view;
        this.model = model;
        initModel();
        initView();
        view.btnAtributosSeleccionar.setEnabled(false);
        
        //ACTION LISTENERS
        view.btnRecargar.addActionListener(this);
        view.btnAtributosSeleccionar.addActionListener(this);
        view.btnAtributosReiniciar.addActionListener(this);
        view.btnAtributosAplicarFiltros.addActionListener(this);
        view.btnAtributosAplicarReducccion.addActionListener(this);
        view.btnAtributosGuardar.addActionListener(this);
        view.btnCrearArchivos.addActionListener(this);
    }

    public ViewAtributos getView() {
        return view;
    }
    
    private void initView(){
        resetFields();
        viewFileLoaded(false);
        loadFilesAvailable();
    }
    
    private void initModel(){
        instancesBeingTransformed = null;
        actualPreprocessOnInstances = new MyPreprocess();
    }
    
    private void resetFields(){
        view.cmbAtributosArchivo.removeAllItems();
        view.cmbAtributosAtributo.removeAllItems();
        view.cmbAtributosTipo.removeAllItems();
        view.chkAtributosNormalizar.setSelected(false);
        view.cmbAtributosMetodoReduccion.removeAllItems();
        view.lblAtributosNumMaxComponentes.setText(null);
        view.spnAtributosReduccionNumComp.setModel(new SpinnerNumberModel(0,0,0,0));
        MyTable.clearTable(view.tblAtributosPrevisualizacion);
        view.spnFold.setValue(0);
        view.spnFolds.setValue(0);
        view.spnSeed.setValue(0);
        view.lblNoInstanciasN.setText(null);
    }
    
    private void viewFileLoaded(boolean b){
        b = !b;
        view.cmbAtributosArchivo.setEnabled(b);
        view.btnRecargar.setEnabled(b);
        view.btnAtributosSeleccionar.setEnabled(b);
        view.btnAtributosReiniciar.setEnabled(!b);
        view.jPanelFiltros.setEnabled(!b);
        view.lblAtributosFiltrosAtributo.setEnabled(!b);
        view.cmbAtributosAtributo.setEnabled(!b);
        view.lblAtributosFiltrosTipo.setEnabled(!b);
        view.cmbAtributosTipo.setEnabled(!b);
        view.chkAtributosNormalizar.setEnabled(!b);
        view.btnAtributosAplicarFiltros.setEnabled(!b);
        view.jPanelDimensionalidad.setEnabled(!b);
        view.lblAtributosReduccionMetodo.setEnabled(!b);
        view.cmbAtributosMetodoReduccion.setEnabled(!b);
        view.lblAtributosReduccionNumComp.setEnabled(!b);
        view.lblAtributosNumMaxComponentes.setEnabled(!b);
        view.radioAtributosNumComponentes.setEnabled(!b);
        view.spnAtributosReduccionNumComp.setEnabled(!b);
        view.radioAtributosPorVariacion.setEnabled(!b);
        view.spnAtributosReduccionPorVar.setEnabled(!b);
        view.btnAtributosAplicarReducccion.setEnabled(!b);
        view.jPanelPrevisualizacion.setEnabled(!b);
        view.tblAtributosPrevisualizacion.setEnabled(!b);
        view.btnAtributosGuardar.setEnabled(!b);
        view.btnCrearArchivos.setEnabled(!b);
        view.spnFold.setEnabled(!b);
        view.spnFolds.setEnabled(!b);
        view.spnSeed.setEnabled(!b);
        view.lblFold.setEnabled(!b);
        view.lblFolds.setEnabled(!b);
        view.lblSeed.setEnabled(!b);
        view.jPanelCreacionArchivos.setEnabled(!b);
        view.lblNumInstancias.setEnabled(!b);
        view.lblNoInstanciasN.setEnabled(!b);
}

    private void loadFilesAvailable(){
        for(MyFile file: model){
            view.cmbAtributosArchivo.addItem(file.getFileName());
        }
    }

    private void loadAttributeSelectionMethodsAvailable(){
        for(String method : MyWekaTools.reductionMethodsAvailable){
            view.cmbAtributosMetodoReduccion.addItem(method);
        }
    }
    
    private void loadSelectedFile(){
        try {
            String fileSelected = (String)view.cmbAtributosArchivo.getItemAt(view.cmbAtributosArchivo.getSelectedIndex());
            String filePath = MyFile.getFilePath(model, fileSelected);
            ConverterUtils.DataSource source = new ConverterUtils.DataSource(filePath);
            Instances data = source.getDataSet();
            data.setClassIndex(data.numAttributes()-1);
            
            instancesBeingTransformed = data;
            MyTable.displayArffInTable(view.tblAtributosPrevisualizacion,instancesBeingTransformed);
            
            //ASSIGNING PREPROCESS 
            actualPreprocessOnInstances = new MyPreprocess();
            
            //SUCCESS ON LOADING
            loadAttributeSelectionMethodsAvailable();
            setInitialValuesFiltros();
            setInitialValuesAtributos();
            
        } catch (Exception ex) {
            Logger.getLogger(ControllerAtributos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setInitialValuesAtributos(){
        view.lblAtributosNumMaxComponentes.setText(Integer.toString(instancesBeingTransformed.numAttributes()-1));
        view.spnAtributosReduccionNumComp.setModel(new SpinnerNumberModel(1,1,Integer.parseInt(view.lblAtributosNumMaxComponentes.getText()),1));
    }

    private void setInitialValuesFiltros(){
        for(int i=0;i<instancesBeingTransformed.numAttributes();i++){
                Attribute a = instancesBeingTransformed.attribute(i);    
                view.cmbAtributosAtributo.addItem(a.name());
            }
        
        //SETTING TYPES
        view.cmbAtributosTipo.addItem("numeric");
        view.cmbAtributosTipo.addItem("nominal");
        view.lblNoInstanciasN.setText(Integer.toString(instancesBeingTransformed.numInstances()));
    }
    
    private void applyFilters(){
        //IF NORMALIZE IS SELECTED
        if(view.chkAtributosNormalizar.isSelected()){
            instancesBeingTransformed = MyWekaTools.normalizeData(instancesBeingTransformed);
            actualPreprocessOnInstances.setNormalized(true);
            actualPreprocessOnInstances.addToSequence("normalize");
        }
        
        //IF ATTRIBUTE CHANGE TYPE
        Attribute selectedAttribute = instancesBeingTransformed.attribute(view.cmbAtributosAtributo.getItemAt(view.cmbAtributosAtributo.getSelectedIndex()));
        String realType = (selectedAttribute.type() == Attribute.NUMERIC ? "numeric" : "nominal");
        String newType = view.cmbAtributosTipo.getItemAt(view.cmbAtributosTipo.getSelectedIndex());
        
        //TRANSFORM NUMERIC TO NOMINAL
        if(realType == "numeric" && newType == "nominal"){
            Instances newData = MyWekaTools.numericToNominal(instancesBeingTransformed, selectedAttribute.index());
            instancesBeingTransformed = newData;
            actualPreprocessOnInstances.addToSequence("toNominal");
            actualPreprocessOnInstances.addAttributesToNominal(selectedAttribute.name());
        }
        
        //DISPLAY CHANGES
        MyTable.displayArffInTable(view.tblAtributosPrevisualizacion,instancesBeingTransformed);
    }

    private void applyReduction(){
        String method = view.cmbAtributosMetodoReduccion.getItemAt(view.cmbAtributosMetodoReduccion.getSelectedIndex());

        if(method.equals("PCA")){
            int numComponents = -1;
            double variationPorcentage = -1;
            
            if(view.radioAtributosNumComponentes.isSelected()){
                numComponents = (int)view.spnAtributosReduccionNumComp.getValue();
            }
            else{
                variationPorcentage = (double)view.spnAtributosReduccionPorVar.getValue();
            }
            
            instancesBeingTransformed = MyWekaTools.applyPca(instancesBeingTransformed, numComponents, variationPorcentage);
            actualPreprocessOnInstances.setPca(true);
            actualPreprocessOnInstances.addToSequence("pca");
            
            if(numComponents != -1){
                actualPreprocessOnInstances.setNumComponents(numComponents);
            }
            
            else if(variationPorcentage != -1){
                actualPreprocessOnInstances.setPrcVariation(variationPorcentage);
            }
            
        }
        
        //DISPLAYING RESULTS
        MyTable.displayArffInTable(view.tblAtributosPrevisualizacion,instancesBeingTransformed);   
    }

    private void saveInstancesToArff(){
        String fileName = JOptionPane.showInputDialog("Nombre del archivo: ");
        String fileNameTmp = "File" + model.size();
        String filePath = "./tmp/" + fileNameTmp + ".arff";
        
        //SAVING ARRF FILE INSIDE TMP FOLDER
        ARFFFile.createArffFile(fileNameTmp, "./tmp/", instancesBeingTransformed);
        
        //ADDING FILE TO WORK
        MyFile file = new MyFile();
        
        file.setFileName(fileName);
        file.setFilePath(filePath);
        file.setPrecedingFile(view.cmbAtributosArchivo.getItemAt(view.cmbAtributosArchivo.getSelectedIndex()));
        file.setPreprocess(actualPreprocessOnInstances);
        model.add(file);
    }
    
    private void restart(){
        initView();
        initModel();
        view.btnAtributosSeleccionar.setEnabled(true);
        view.btnAtributosReiniciar.setVisible(true);
    }
    
    private void createTrainingAndTestFile(){
        try {
            //CREAR CONJUNTO DE ENTRENAMIENTO Y PRUEBA PARA LAS INSTANCIAS CARGADAS instancesBeingTransformed
            Instances newInstances;
            int fold,folds,key;
            long seed;
            boolean inverted;
            String fileName;
            
            fold = (int)view.spnFold.getValue();
            folds = (int)view.spnFolds.getValue();
            seed = Long.valueOf((int)view.spnSeed.getValue());
            inverted = true;
            key = model.size();
            fileName = "#" + key + " - Conjunto entrenamiento";
            
            for(int i=0;i<2;i++){
                StratifiedRemoveFolds filter = new StratifiedRemoveFolds();
                filter.setInputFormat(instancesBeingTransformed);
                filter.setFold(fold);
                filter.setNumFolds(folds);
                filter.setSeed(seed);
                filter.setInvertSelection(inverted);
                newInstances = Filter.useFilter(instancesBeingTransformed, filter);
                
                //SAVING NEW FILE
                String fileNameTmp = "File" + model.size();
                String filePath = "./tmp/" + fileNameTmp + ".arff";
                //SAVING ARRF FILE INSIDE TMP FOLDER
                ARFFFile.createArffFile(fileNameTmp, "./tmp/", newInstances);
                //ADDING FILE TO WORK
                MyFile file = new MyFile();
                file.setFileName(fileName);
                file.setFilePath(filePath);
                file.setPrecedingFile(view.cmbAtributosArchivo.getItemAt(view.cmbAtributosArchivo.getSelectedIndex()));
                file.setPreprocess(actualPreprocessOnInstances);
                model.add(file);
                
                fileName = "#" + key + " - Conjunto prueba";
                inverted=false;
            }
        } catch (Exception ex) {
            Logger.getLogger(ControllerAtributos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //BTN SELECT FILE
        Object source = e.getSource();
        
        if(source == view.btnRecargar){
            restart();
        }
        
        else if(source == view.btnAtributosSeleccionar){
            loadSelectedFile();
            viewFileLoaded(true);
        }
        
        else if(source == view.btnAtributosReiniciar){
            restart();
        }
        
        else if(source == view.btnAtributosAplicarFiltros){
            applyFilters();
        }
        
        else if(source == view.btnAtributosAplicarReducccion){
            applyReduction();
        }
        
        else if(source == view.btnCrearArchivos){
            createTrainingAndTestFile();
            initModel();
            initView();
        }
        
        else if(source == view.btnAtributosGuardar){
            saveInstancesToArff();
            initModel();
            initView();
        }
        
    }
}
