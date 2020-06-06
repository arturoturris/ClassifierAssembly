package Extra;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;

public class MyTable {
    public static void clearTable(JTable table){
        DefaultTableModel model =  (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
    }

    public static void displayArffInTable(JTable table,Instances data){
        DefaultTableModel model = new DefaultTableModel();

        //FILLING HEADERS
        for(int i=0;i<data.numAttributes();i++){
            int typeIndex = data.attribute(i).type();
            String type = (typeIndex == Attribute.NUMERIC ? "numeric" : "nominal"); 
            model.addColumn("<html>" + data.attribute(i).name() + "<br>" + "(" + type + ")</html>");
        }

        //FILLING DATA
        for(int i=0;i<data.numInstances();i++){
            Instance actual = data.instance(i);
            Vector<String> tmpList = new Vector<>();

            for(int j=0;j<actual.numAttributes();j++){
                tmpList.add(actual.toString(j));
            }

            model.addRow(tmpList);
        }

        table.setModel(model);
    }
    
    public static void displayConfusionMatrix(JTable table,double[][] array,String[] headers){
        DefaultTableModel model = new DefaultTableModel();
        
        for(int i=0;i<headers.length;i++){
            model.addColumn(headers[i]);
        }
        
        for(int i=0;i<headers.length;i++){
            Vector<String> tmpList = new Vector<>();
            
            for(int j=0;j<headers.length;j++){
                tmpList.add(Double.toString(array[i][j]));
            }
            
            model.addRow(tmpList);
        }
        
        table.setModel(model);
    }
}
