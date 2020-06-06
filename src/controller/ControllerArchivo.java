package controller;

import Extra.ARFFFile;
import Extra.MyRecord;
import Extra.MyTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.MyFile;
import view.ViewArchivo;
import weka.core.Instances;

public class ControllerArchivo implements ActionListener{
    private ViewArchivo view;
    private ArrayList<MyFile> model;

    public ViewArchivo getView() {
        return view;
    }
    
    
    
    public ControllerArchivo(ViewArchivo view,ArrayList<MyFile> model){
        this.view = view;
        this.model = model;
        initView();
        
        //ACTION LISTENERS
        this.view.btnArchivoFile.addActionListener(this);
        this.view.btnArchivoCargar.addActionListener(this);
        this.view.btnArchivoReiniciar.addActionListener(this);
    }
    
    private void initView(){
        resetFields();
        viewFileLoaded(false);
    }
    
    private void resetFields(){
        view.inputArchivoRuta.setText(null);
        view.lblArchivoNombre.setText(null);
        view.lblArchivoFormato.setText(null);
        view.lblArchivoRegistros.setText(null);
        view.lblArchivoClases.setText(null);
        view.lblArchivoAtributos.setText(null);
        view.lblArchivoNumericos.setText(null);
        view.lblArchivoNominales.setText(null);
        view.tblArchivoConjuntoEntrenamiento.setModel(new DefaultTableModel());
    }
    
    private void viewFileLoaded(boolean b){
        b = !b;
        view.btnArchivoFile.setEnabled(b);
        view.btnArchivoCargar.setEnabled(b);
        view.btnArchivoReiniciar.setEnabled(!b);
        view.lblArchivoNombre.setEnabled(!b);
        view.lblArchivoFormato.setEnabled(!b);
        view.lblArchivoRegistros.setEnabled(!b);
        view.lblArchivoClases.setEnabled(!b);
        view.lblArchivoAtributos.setEnabled(!b);
        view.lblArchivoNumericos.setEnabled(!b);
        view.lblArchivoNominales.setEnabled(!b);
        view.tblArchivoConjuntoEntrenamiento.setEnabled(!b);
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
        //SUCCESS
        String filePath = view.inputArchivoRuta.getText();
        
        if(filePath.equals("")){
            //DIALOG FILE NOT COMPATIBLE
            return;
        }
        
        MyRecord r1 = ARFFFile.readCsv(filePath);
        Instances data = ARFFFile.transformCSVToARFF(r1);
        ARFFFile.createArffFile("original", "./tmp/", data);
        model.add(new MyFile("Conjunto entrenamiento - Original", "./tmp/original.arff"));
        
        if(r1 == null){
            return;}
        
        File file = new File(filePath);
        String []info = file.getName().split("\\.");
        view.lblArchivoNombre.setText(info[0]);
        view.lblArchivoFormato.setText(info[1]);
        view.lblArchivoRegistros.setText(Integer.toString(r1.getNumTuples()));
        view.lblArchivoAtributos.setText(Integer.toString(r1.getNumAttributes()));
        view.lblArchivoNumericos.setText(Integer.toString(r1.getNumAttributes()));
        view.lblArchivoNominales.setText(Integer.toString(0));
        view.lblArchivoClases.setText(Integer.toString(r1.getNumClasses()));
        
        //displayTable(tblArchivoConjuntoEntrenamiento,r1);
        MyTable.displayArffInTable(view.tblArchivoConjuntoEntrenamiento,data);
        
        viewFileLoaded(true);
        //SEND SIGNAL TO UNLOCK TABS
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //BTN SELECT FILE
        Object source = e.getSource();
        
        if(source == view.btnArchivoFile){
            selectFile();
        }
        else if(source == view.btnArchivoCargar){
            loadFile();
        }
        else if(source == view.btnArchivoReiniciar){
            initView();
            MyFile.deleteContentOfFolder("./tmp");
        }
    }
    
}
