package Test;

import Extra.MyWekaTools;
import controller.ControllerFormKnn;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.lazy.IBk;
import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.NumericToNominal;
import weka.gui.beans.DataVisualizer;
import weka.gui.beans.ModelPerformanceChart;
import weka.gui.beans.ThresholdDataEvent;
import weka.gui.beans.VisualizableErrorEvent;
import weka.gui.visualize.Plot2D;
import weka.gui.visualize.PlotData2D;
import weka.gui.visualize.VisualizePanel;

public class MyTest {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws Exception {
            DataSource sourceTraining, sourceTest;
            Instances dataTraining, dataTest;
            
            sourceTraining = new DataSource("C:\\Users\\Lanix\\Desktop\\365-TRAINING.arff");
            sourceTest = new DataSource("C:\\Users\\Lanix\\Desktop\\365-TEST.arff");
            dataTraining = sourceTraining.getDataSet();
            dataTest = sourceTest.getDataSet();

            int totalInstances = 10;
            int processedInstances = 0;
            Timer timer = new Timer();
            TimerTask task;
            
            JFrame jf = new JFrame();
            JProgressBar pb = new JProgressBar();
            pb.setIndeterminate(true);
            pb.setMaximum(totalInstances);
            pb.setIndeterminate(false);
            jf.setLayout(new GridLayout(1,1));
            jf.setSize(500,400);
            jf.setVisible(true);
            
            //timer.scheduleAtFixedRate(task, totalInstances, totalInstances);
    }
    
    public static void refreshTime(JProgressBar pb,int value){
        pb.setValue(value);
    }
            
}