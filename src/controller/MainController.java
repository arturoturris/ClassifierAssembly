package controller;

import view.MainView;
import view.ViewArchivo;
import java.awt.GridLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.MyEnsemble;
import model.MyFile;
import view.ViewAtributos;
import view.ViewClasificadores;
import view.ViewPrueba;

public class MainController {
    public static void main(String args[]) {
        //Creating folder tmp
        checkFolder();
        
        //Defining model
        ArrayList<MyFile> files = new ArrayList<>();
        MyEnsemble assemble = new MyEnsemble(files);
        
        //Defining views
        MainView mainView = new MainView();
        ViewArchivo viewArchivo = new ViewArchivo();
        ViewAtributos viewAtributos = new ViewAtributos();
        ViewClasificadores viewClasificadores = new ViewClasificadores();
        ViewPrueba viewPrueba = new ViewPrueba();
        
        //Defining controllers
        ControllerArchivo controllerArchivo = new ControllerArchivo(viewArchivo,files); 
        ControllerAtributos controllerAtributos = new ControllerAtributos(viewAtributos,files);
        ControllerClasificadores controllerClasificadores = new ControllerClasificadores(viewClasificadores,assemble,files);
        ControllerPrueba controllerPrueba = new ControllerPrueba(viewPrueba,assemble,files);
        
        //Initiating
        mainView.mainTabPane.addTab("Archivo",controllerArchivo.getView());
        mainView.mainTabPane.addTab("Atributos",controllerAtributos.getView());
        mainView.mainTabPane.addTab("Clasificadores",controllerClasificadores.getView());
        mainView.mainTabPane.addTab("Prueba",controllerPrueba.getView());
        
        //Setting sizes
        controllerArchivo.getView().setLayout(new GridLayout(1,1));
        controllerAtributos.getView().setLayout(new GridLayout(1,1));
        controllerClasificadores.getView().setLayout(new GridLayout(1,1));
        controllerPrueba.getView().setLayout(new GridLayout(1,1));
        
        //Look and feel views
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            UIManager.setLookAndFeel ("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(mainView);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Blocking tabs
        //blockTabs(mainView.mainTabPane,true);
        //Set event to de block
        //controllerArchivo.getView().btnArchivoCargar.addEventListener(this);
        
        //Displaying
        mainView.setTitle("MD-Ensamble-OP");
        mainView.setSize(924, 568);
        mainView.setVisible(true);
    }
    
    private static void checkFolder(){
        //BASIS
        final String tmpFolder = "./tmp";
        
        if(!(new File(tmpFolder).exists())){
            MyFile.createFolder(tmpFolder); //FOLDER TO STORE FILES WHILE WORKING
        }
        else{
            MyFile.deleteContentOfFolder(tmpFolder);
        }
    }
    
    private static void blockTabs(JTabbedPane tabPane,boolean block){
        for(int i=1;i<tabPane.getTabCount();i++){
            tabPane.getTabComponentAt(i).setEnabled(!block);
        }
    }
}
