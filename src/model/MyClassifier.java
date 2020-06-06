package model;

import weka.classifiers.Classifier;

public class MyClassifier {
    private int id;
    private String type;
    private Classifier classifier;
    private float prcPrecision;
    private MyFile trainingSet;

    public MyClassifier(int id,String type){
        this.id = id;
        this.type = type;
        this.prcPrecision = 0;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Classifier getClassifier() {
        return classifier;
    }

    public void setClassifier(Classifier classifier) {
        this.classifier = classifier;
    }

    public float getPrcPrecision() {
        return prcPrecision;
    }

    public void setPrcPrecision(float prcPrecision) {
        this.prcPrecision = prcPrecision;
    }

    public MyFile getTrainingSet() {
        return trainingSet;
    }

    public void setTrainingSet(MyFile trainingSet) {
        this.trainingSet = trainingSet;
    }
    
}
