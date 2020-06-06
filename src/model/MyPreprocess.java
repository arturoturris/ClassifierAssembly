package model;

import java.util.ArrayList;

public class MyPreprocess {
    boolean normalized;
    boolean pca;
    int numComponents;
    double prcVariation;
    ArrayList<String> attributesToNominal;
    ArrayList<String> sequence; // normalize toNominal pca

    public MyPreprocess(){
        normalized = false;
        pca = false;
        numComponents = -1;
        prcVariation = -1;
        attributesToNominal = new ArrayList<String>();
        sequence = new ArrayList<String>();
    }
    
    public boolean isNormalized() {
        return normalized;
    }

    public void setNormalized(boolean normalized) {
        this.normalized = normalized;
    }

    public boolean isPca() {
        return pca;
    }

    public void setPca(boolean pca) {
        this.pca = pca;
    }

    public int getNumComponents() {
        return numComponents;
    }

    public void setNumComponents(int numComponents) {
        this.numComponents = numComponents;
    }

    public double getPrcVariation() {
        return prcVariation;
    }

    public void setPrcVariation(double prcVariation) {
        this.prcVariation = prcVariation;
    }

    public ArrayList<String> getAttributesToNominal() {
        return attributesToNominal;
    }

    public void addAttributesToNominal(String attributeToNominal) {
        this.attributesToNominal.add(attributeToNominal);
    }
    
    public ArrayList<String> getSequence() {
        return sequence;
    }

    public void addToSequence(String sequence) {
        this.sequence.add(sequence);
    }

    public void printPreprocess(){
        System.out.print("Normalized: " + this.normalized);
        System.out.print("Pca: " + this.pca);
        System.out.print("Num. components: " + this.numComponents);
        System.out.print("Prc. variation: " + this.prcVariation);
        System.out.println("Attributes to nominal: ");
        for(String attribute : attributesToNominal){
            System.out.print(attribute + "\t");
        }
        System.out.println("Sequence: ");
        for(String step : sequence){
            System.out.print(step + "\t");
        }
        System.out.println("*****************************************");
    }
    
}
