package Extra;

import java.util.List;
import java.util.ArrayList;

public class Tuple {
    private List<Double> values;
    
    public Tuple(){
        values = new ArrayList<Double>();
    }
    
    public void addValue(double _value){
        values.add(_value);
    }
    
    public void printTuple(){
        for(Double v:values){
            System.out.print(v + "\t");
        }
        System.out.print("\n");
    }
    
    public List<Double> returnValues(){
        return values;}
}
