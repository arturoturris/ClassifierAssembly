package model;

import Extra.ARFFFile;
import Extra.MyWekaTools;
import controller.ControllerPrueba;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

public class MyEnsemble {
    private static final String[] classifiersAvailable = {"KNN","Naive Bayes","Multilayer Perceptron"};
    private static int id = 1;
    private ArrayList<MyClassifier> classifiers;
    private double[] predictedClasses;
    private ArrayList<MyFile> filesAvailable; 

    public MyEnsemble(ArrayList<MyFile> filesAvailable){
        classifiers = new ArrayList<MyClassifier>();
        predictedClasses = null;
        this.filesAvailable = filesAvailable;
    }
    
    public static int getNewId(){
        return id++;
    }
    
    public void resetEnsemble(){
        this.classifiers.clear();
    }
    
    public static String[] getClassifiersAvailable(){
        return classifiersAvailable;
    }
    
    public ArrayList<MyClassifier> getClassifiers() {
        return classifiers;
    }

    public void addClassifier(MyClassifier classifier) {
        this.classifiers.add(classifier);
    }
    
    public void removeClassifier(MyClassifier classifier){
        classifiers.remove(classifier);
    }

    public float getPrcPrecision() {
        float total = 1;
        
        if(this.classifiers == null)
            return 0;
        
        for(MyClassifier classifier : this.classifiers){
            total *= classifier.getPrcPrecision()/100;
        }
        
        return total;
    }
    
    public int getSize(){
        if(classifiers == null){
            return 0;
        }
        else{
            return classifiers.size();
        }
    }
    
    private ArrayList<String> getPossibleClasses(){
        Instances instances = ARFFFile.readArffFile(filesAvailable.get(1).getFilePath());
        Attribute classAttribute;
        ArrayList<String> possibleClasses = new ArrayList<>();
        
        instances.setClassIndex(instances.numAttributes()-1);
        classAttribute = instances.classAttribute();
        
        for(int i=0;i<classAttribute.numValues();i++){
            possibleClasses.add(classAttribute.value(i));
        }
        
        return possibleClasses;
    }
    
    private Instance preprocessInstance(Instances trainingSet,MyPreprocess preprocess,Instance instance){
        for(String process : preprocess.getSequence()){
            if(process.equals("normalize")){
                instance = MyWekaTools.normalizeInstance(trainingSet, instance);
            }

            else if(process.equals("pca")){
                double prcVariation = -1;
                int numComponents = -1;

                //IF THERE IS NO NUM. COMPONENTS PUT PRCVARIATION
                if(preprocess.getNumComponents() == -1){
                    prcVariation = preprocess.getPrcVariation();
                }

                else{
                    numComponents = preprocess.getNumComponents();
                }

                instance = MyWekaTools.applyPcaToInstance(trainingSet, instance, numComponents, prcVariation);
            }

            else{
            }
        }
            return instance;
    }
    
    public double evaluateInstance(Instance inputInstance){
        //PREPROCESS AND CLASSIFY THE INSTANCE FOR EACH CLASSIFIER
        predictedClasses = new double[classifiers.size()];
        int i = 0;
        
        for(MyClassifier classifier : this.classifiers){   
            //INSTANCE TO EVALUATE
            Instance instance = (Instance) inputInstance.copy();
            MyFile trainingSet = classifier.getTrainingSet();
            Stack<MyFile> stackOfFiles = new Stack<MyFile>();
            //MyPreprocess preprocess = file.getPreprocess();


            //ADDING FILES TO STACK TO MAKE PREPROCESS
            while(trainingSet.getPrecedingFile() != null){
                stackOfFiles.push(trainingSet);
                trainingSet = MyFile.getMyFileFromList(filesAvailable,trainingSet.getPrecedingFile());
            }

            MyFile file = null;
            while(!stackOfFiles.empty()){
                file = stackOfFiles.pop();
                MyFile precedent = MyFile.getMyFileFromList(filesAvailable,file.getPrecedingFile());
                Instances tmpInstances = ARFFFile.readArffFile(precedent.getFilePath());
                tmpInstances.setClassIndex(-1);
                instance = preprocessInstance(tmpInstances,file.getPreprocess(),instance);
            }
            
            try {
                //INSTANCE READY TO EVALUATE WITH CLASSIFIER N
                //PROBAR CON EL CONJUNTO DE DATOS QUE EL CLASIFICADOR TIENE
                //System.out.println("Instance 1: " + classifier.getClassifier().classifyInstance(instance));
                MyFile traiSet = MyFile.getMyFileFromList(filesAvailable,classifier.getTrainingSet().getFileName());
                Instances trainSet = ARFFFile.readArffFile(traiSet.getFilePath());
                trainSet.setClassIndex(trainSet.numAttributes()-1);
                instance.setDataset(trainSet);

                double predictedClass = classifier.getClassifier().classifyInstance(instance);
                predictedClasses[i++] = predictedClass;

            } catch (Exception ex) {
                Logger.getLogger(ControllerPrueba.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return getPredictedClass();
    }
    
    private double getPredictedClass(){
        ArrayList<String> possibleClasses = new ArrayList<>();
        
        //GET ALL POSSIBLE CLASSES IN PREDICTED CLASSES
        for(int i=0;i<predictedClasses.length;i++){
            String classValue = Double.toString(predictedClasses[i]);
            if(!possibleClasses.contains(classValue)){
                possibleClasses.add(classValue);
            }
        }
        
        //COUNT FREQUENCY FOR EACH CLASS
        int frequency[] = new int[possibleClasses.size()];
        
        for(int i=0;i<frequency.length;i++){
            frequency[i] = 0;
        }
        
        for(int i=0;i<predictedClasses.length;i++){
            for(int j=0;j<possibleClasses.size();j++){
                if(Double.toString(predictedClasses[i]).equals(possibleClasses.get(j))){
                    frequency[j]++;
                    break;
                }
            }
        }
        
        //GET MAYOR FREQUENCY
        int mayorFrequencyIndex = 0;
        boolean tie = false;
        
        for(int i=1;i<frequency.length;i++){
            if(frequency[i] > frequency[mayorFrequencyIndex]){
                mayorFrequencyIndex = i;
            }
            else if(frequency[i] == frequency[mayorFrequencyIndex]){
                tie = true;
            }
        }
        
        if(!tie){
            return Double.parseDouble(possibleClasses.get(mayorFrequencyIndex));
        }
        //THERE IS A TIE
        else{
            mayorFrequencyIndex = 0;
            
            for(int i=1;i<possibleClasses.size();i++){
                if(classifiers.get(i).getPrcPrecision() > classifiers.get(mayorFrequencyIndex).getPrcPrecision()){
                    mayorFrequencyIndex = i;
                }
            }
            return Double.parseDouble(possibleClasses.get(mayorFrequencyIndex));
        }
        
    }
    
    //*****ORIGINAL
//    private double getPredictedClass(){
//        int []frequence = new int[getPossibleClasses().size()];
//        ArrayList<String> possibleClasses = getPossibleClasses();
//        
//        
//        //COUNTING FREQUENCE
//        for(int i=0;i<predictedClasses.length;i++){
//            for(int j=0;j<possibleClasses.size();j++){
//                if(Double.parseDouble(possibleClasses.get(j)) == predictedClasses[i]){
//                    frequence[j]++;
//                    break;
//                }
//            }
//        }
//        
//        int mayorFrequenceIndex = 0;
//        
//        //SELECTING CLASS
//        for(int i=1;i<frequence.length;i++){
//           if(frequence[i] > frequence[mayorFrequenceIndex]){
//               mayorFrequenceIndex = i;
//           }
//        }
//        
//        ArrayList<Integer> indexesOfTie = new ArrayList<>();
//        indexesOfTie.add(mayorFrequenceIndex);
//        
//        //SELECTING INDEXES WITH TIE
//        for(int i=0;i<frequence.length;i++){
//            if((frequence[i] == frequence[mayorFrequenceIndex]) && (i != mayorFrequenceIndex)){
//                indexesOfTie.add(i);
//            }
//        }
//        
//        if(indexesOfTie.size() == 1)
//            return Double.parseDouble(possibleClasses.get(mayorFrequenceIndex));
//        
//        //SELECTING BY MAYOR PRC
//        mayorFrequenceIndex = 0;
//        
//        //THIS IS ONLY VALID FOR 3 CLASSIFIERS *****NEEDS FIX********
//        for(int i=1;i<predictedClasses.length;i++){
//            if(classifiers.get(i).getPrcPrecision() > classifiers.get(mayorFrequenceIndex).getPrcPrecision()){
//                mayorFrequenceIndex = i;
//            }
//        }
//        
//        return Double.parseDouble(possibleClasses.get(mayorFrequenceIndex));
//    }
    
    //RETURNS AN ARRAY THAT COLLECTS ALL PREDICTED CLASSES BY EACH CLASSIFIER IN ENSEMBLE
    //ONLY AVAILABLE AFTER CALLING evaluateInstance
    public double[] getPredictedClasses(){
        return this.predictedClasses;}
}
