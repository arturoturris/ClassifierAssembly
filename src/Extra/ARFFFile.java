package Extra;

import Extra.MyRecord;
import Extra.Tuple;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class ARFFFile {
    
    public static Instances transformCSVToARFF(MyRecord r){
        ArrayList<Attribute> atts;
        Instances data;
        double []vals;
                
        //1) SETTING ATTRIBUTES
        atts = new ArrayList<Attribute>();
        
        for(int i=0;i<r.getNumAttributes()+1;i++){
            //For numeric attributes
            atts.add(new Attribute(r.getHeader(i)));
        }
        
        //2) INTANSANCES
        data = new Instances(r.getRelationName(),atts,0);        
        
        //3) FILLING DATA
        List<Tuple> tuples = r.getTuples();
        //ATTRIBUTES PLUS CLASS LABEL
        int numAttributes = r.getNumAttributes() + 1;
        Instance inst;
        List<Double> values;
        
        for(Tuple tuple: tuples){
            values = tuple.returnValues();
            inst = new DenseInstance(numAttributes);
            int i = 0;
            
            for(Double value:values){
                inst.setValue(data.attribute(i++),value);
            }
            
            data.add(inst);
        }
        
        //4) RETURN
        
        return data;
    }
    
    public static void createArffFile(String fileName,String filePath,Instances data){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath + fileName + ".arff"))) {
            writer.write(data.toString());
            writer.flush();
         }
        catch(IOException e){
        }
    }
    
    public static MyRecord readCsv(String filePath){
        Path fp = Paths.get(filePath);
        MyRecord newRecord = null;
        
        try (BufferedReader br = Files.newBufferedReader(fp,StandardCharsets.US_ASCII)) {

            // ASSSIGNING BASE TO RECORD
            String line = br.readLine();
            int rows = Integer.parseInt(line);
            line = br.readLine();
            int atts = Integer.parseInt(line);
            line = br.readLine();
            int classes = Integer.parseInt(line);
            line = br.readLine();
            newRecord = new MyRecord(rows,atts,classes);
            Tuple temporalTuple;
            
            //READING LINE BY LINE
            while (line != null) {

                temporalTuple = new Tuple();
                String[] attributes = line.split(",");
                
                for(String v:attributes){
                    temporalTuple.addValue(Double.parseDouble(v));
                }
                
                newRecord.addTuple(temporalTuple);

                //NEXT LINE
                line = br.readLine();
            }
            

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        return newRecord;
    }
    
    public static Instances readArffFile(String filePath){
        Instances data = null;
        
        try {
            DataSource source = new DataSource(filePath);
            data = source.getDataSet();
            
            if (data.classIndex() == -1)
                data.setClassIndex(data.numAttributes() - 1);
            
        } catch (Exception ex) {
            Logger.getLogger(ARFFFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return data;
    }
    
}
