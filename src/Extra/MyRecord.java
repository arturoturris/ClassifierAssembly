package Extra;

import java.util.List;
import java.util.ArrayList;

public class MyRecord {
    private String relationName;
    private final int numTuples;
    private final int numAttributes;
    private final int numClasses;
    private List<Tuple> tuples;
    private String []headers;
    private String []types;
    
    public MyRecord(int numTuples,int numAttributes,int numClasses){
        relationName = "RelationName";
        this.numTuples = numTuples;
        this.numAttributes = numAttributes;
        this.numClasses = numClasses;
        tuples = new ArrayList<Tuple>();
        headers = new String[numAttributes+1];
        types = new String[numAttributes+1];
        
        startHeaders();
        startTypes();
    }
    
    public String getRelationName(){
        return this.relationName;
    }
    
    public int getNumAttributes(){
        return this.numAttributes;}
    
    public int getNumTuples(){
        return this.numTuples;}
    
    public int getNumClasses(){
        return this.numClasses;}
    
    public String getHeader(int _index){
        return headers[_index];
    }
    
    public void setName(String relationName){
        this.relationName = relationName;
    }
    
    public void setHeader(int index,String header){
        this.headers[index] = header;
    }
    
    public void setType(int index,String type){
        this.types[index] = type;}
    
    public void startHeaders(){
        for(int i=0;i<this.numAttributes;i++){
            this.headers[i] = "Att" + (i+1);
        }
        this.headers[this.numAttributes] = "class";
    }
    
    public void startTypes(){
        for(int i=0;i<this.numAttributes+1;i++){
            this.types[i] = "numeric";
        }
    }
    
    public List<Tuple> getTuples(){
        return this.tuples;}
    
    public void printHeaders(){
        for(String h:this.headers){
            System.out.print(h+"\t");
        }
        System.out.print("\n");
    }
    
    public void addTuple(Tuple newTuple){
        tuples.add(newTuple);
    }
    
    public void printRecord(){
        printHeaders();
        for(Tuple t:this.tuples){
            t.printTuple();
        }
    }
}
