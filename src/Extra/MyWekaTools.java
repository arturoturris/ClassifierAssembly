package Extra;

import controller.ControllerAtributos;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.MainView;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SparseInstance;
import weka.filters.Filter;
import weka.filters.supervised.instance.StratifiedRemoveFolds;
import weka.filters.unsupervised.attribute.Normalize;
import weka.filters.unsupervised.attribute.NumericToNominal;
import weka.filters.unsupervised.attribute.PrincipalComponents;

public class MyWekaTools {
    public static final String[] reductionMethodsAvailable = {"PCA"};
    
    private static double[] textToDoubleArray(String text){
        String []values = text.split(",");
        double []valuesDouble = new double[values.length];
        
        for(int i=0;i<values.length;i++){
            valuesDouble[i] = Double.parseDouble(values[i]);
        }
        
        
        return valuesDouble;
    }
    
    public static Instance textToInstance(String text){
        double[] values = textToDoubleArray(text);
        //Instance instance = new DenseInstance(1.0,values);
        Instance instance = new DenseInstance(values.length+1);
        
        for(int i=0;i<values.length;i++)
            instance.setValue(i, values[i]);
        
        instance.setMissing(values.length);
        
        return instance;
    }
    
    public static boolean validTextInputAsInstance(String text, int numAttributes){
        boolean b = false;
        
        try{
            String []values = text.split(",");
            
            b = values.length == numAttributes ? true : false;
        }catch(Exception e){
        
        }
        
        return b;
    }
    
    public static Instances normalizeData(Instances data){
        Instances normalizedData = null;
        Filter normalize = new Normalize();
        
        try {
            normalize.setInputFormat(data);
            normalizedData = Filter.useFilter(data, normalize);
        } catch (Exception ex) {
            Logger.getLogger(ControllerAtributos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return normalizedData;
    }
    
    public static Instance normalizeInstance(Instances dataset,Instance instance){
        Instance normalizedInstance = null;
        
        try {    
            Normalize filter = new Normalize();
            filter.setInputFormat(dataset);
            instance.setDataset(dataset);
            
            //PROCESSING ALL DATASET TO DETERMINE MAX AND MIN VALUES
            filter.input(instance);
            for(Instance ins : dataset){
                filter.input(ins);
            }
            
            filter.batchFinished();
            normalizedInstance = filter.output();
        }catch (Exception ex) {
            Logger.getLogger(MyWekaTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return normalizedInstance;
    }
    
    public static Instances numericToNominal(Instances data,int attributeIndex){       
        Instances newData = null;
        
        try {
            NumericToNominal convert = new NumericToNominal();
            String[] options = new String[2];
            options[0] = "-R"; //ATTRIBUTES TO CONVERT
            options[1] = Integer.toString(attributeIndex+1);
            
            convert.setOptions(options);
            convert.setInputFormat(data);

            newData = Filter.useFilter(data, convert);
        } catch (Exception ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return newData;
    }
    
    public static Instances applyPca(Instances data,int numComponents,double prcVariation){
        Instances newData = null;
        PrincipalComponents pca = new PrincipalComponents();
        data.setClassIndex(data.numAttributes()-1);
        
        if(!(prcVariation == -1)){
            pca.setVarianceCovered(prcVariation);
        }
        else{
            pca.setMaximumAttributes(numComponents);
        }

        
        try {
            pca.setInputFormat(data);
            newData = Filter.useFilter(data,pca);    

            //RENAMING ATTRIBUTES
            for(int i=0;i<newData.numAttributes()-1;i++){
                newData.renameAttribute(i,"PC"+(i+1));
            }
            
        } catch (Exception ex) {
            
        }
        
        return newData;
    }
    
    public static Instance applyPcaToInstance(Instances dataset,Instance instance,int numComponents,double prcVariation){
        PrincipalComponents pca = new PrincipalComponents();
        Instance pcaInstance = null;
        dataset.setClassIndex(dataset.numAttributes()-1);
        
        //When providing prcVariation
        if(!(prcVariation == -1)){
            pca.setVarianceCovered(prcVariation);
        }
        //When providing min num components
        else{
            pca.setMaximumAttributes(numComponents);
        }
        
        try {
            pca.setInputFormat(dataset);
            instance.setDataset(dataset);
            instance.setClassMissing();
            
            pca.input(instance);
            for(Instance ins : dataset){
                pca.input(ins);
            }
            pca.batchFinished();
    
            pcaInstance = pca.output();
        } catch (Exception ex) {
            Logger.getLogger(MyWekaTools.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pcaInstance;
    }
    
    public static Instances applyStratifiedRemoveFolds(Instances dataset,int fold,int numFolds,long seed,boolean inverted){
        Instances newInstances = null;
        
        try {
            StratifiedRemoveFolds filter = new StratifiedRemoveFolds();
            filter.setFold(fold);
            filter.setNumFolds(numFolds);
            filter.setSeed(seed);
            filter.setInvertSelection(inverted);
            filter.setInputFormat(dataset);
            
            newInstances = Filter.useFilter(dataset, filter);
        } catch (Exception ex) {
            Logger.getLogger(MyWekaTools.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return newInstances;
    }
}
