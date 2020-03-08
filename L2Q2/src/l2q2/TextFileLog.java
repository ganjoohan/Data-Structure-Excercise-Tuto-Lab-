
package l2q2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TextFileLog<T extends Comparable<T>> implements SimpleLog<T> {
   
    private ArrayList<T> log;
    private int maxsize;
    PrintWriter pw;
    

    public TextFileLog(int a) {
        maxsize = a;
        log = new ArrayList<>();
    }
    
    public void insert(T t){
        if(!isFull()){
            try{
                pw = new PrintWriter(new FileOutputStream("Text File Log.txt", true));
                log.add(t);
                pw.println(t);
                pw.close();
            }catch(IOException e){
                System.out.println("Problem with file output");
            }
            System.out.println(t);
        }
        else{
            System.out.println("\nAdding another record\nThe log is full");
        }
    }
    
    @Override
    public boolean isFull(){
        return ((maxsize == log.size()));
    }
    
    @Override
    public int size() {
        return log.size();
    }
    
    @Override
    public boolean search(T t){
        System.out.println("Searching for "+t+" in the file");
        for(int i=0;i<size();i++){
            if(log.get(i).compareTo(t) == 0){
                System.out.println("Text File Log contains "+t);
                return true;
            }
        }
        System.out.println("Text File Log do not contain "+t);
        return false;
    }
    
    @Override
    public void clear(){
        System.out.println("Clear the text file log");
        for(int i=size()-1;i>=0;i--){
            log.remove(i);
        }
        System.out.println("Text file Log Size "+size());
        
        try{
            pw = new PrintWriter(new FileOutputStream("Text File Log.txt",false));
            pw.print("");
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        
    } 

    @Override
    public String toString() {
        String str="";
        for(int i=0; i<size(); i++) 
            str += log.get(i) + "\n";
        return str;
    }
    
    
    
    
    
}
