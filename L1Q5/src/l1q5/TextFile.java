/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1q5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TextFile implements FileIO{
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }
    
    


    
    @Override
    public void writeToFile(String content) {
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream(fileName));
            p.print(content);
            p.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }

    @Override
    public String readFromFile() {
        String str = "";
        try{
            Scanner s = new Scanner(new FileInputStream(fileName));
            while(s.hasNextLine()){
                str += s.nextLine()+"\n";
            }
            s.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        return str;
        
    }
    
    
}
