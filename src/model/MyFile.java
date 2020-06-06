package model;

import java.io.File;
import java.util.ArrayList;
import model.MyPreprocess;

public class MyFile {
    private String fileName;
    private String filePath;
    private String precedingFile;
    private MyPreprocess preprocess;

    public MyFile() {
        fileName = null;
        filePath = null;
        precedingFile = null;
        preprocess = null;
    }

    public MyFile(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getPrecedingFile() {
        return precedingFile;
    }

    public void setPrecedingFile(String precedingFile) {
        this.precedingFile = precedingFile;
    }

    public MyPreprocess getPreprocess() {
        return preprocess;
    }

    public void setPreprocess(MyPreprocess preprocess) {
        this.preprocess = preprocess;
    }
    
    public static boolean createFolder(String path){
        File file = new File(path);
        boolean bool = file.mkdir();

        if(!bool){
           System.out.println("The foler " + path + " couldnt be made");
        }
    
        return bool;
    }
    
    public static boolean deleteContentOfFolder(String folderPath){
        boolean success = true;
        File folder = new File(folderPath);
        File []files = folder.listFiles();

            for (File file : files) {
                success = success && file.delete();
            }

        return success;
    }
    
    public static String getFilePath(ArrayList<MyFile> list,String fileName){
        String filePath = "";
        
        for(MyFile file : list){
            if(file.fileName == fileName){
                filePath = file.filePath;
                return filePath;
            }
        }
        
        return filePath;
    }
    
    public static MyFile getMyFileFromList(ArrayList<MyFile> list, String fileName){
        MyFile requestedFile = null;
        
        for(MyFile file : list){
            if(file.getFileName().equals(fileName)){
                requestedFile = file;
                break;
            }
        }
        
        return requestedFile;
    }

}
