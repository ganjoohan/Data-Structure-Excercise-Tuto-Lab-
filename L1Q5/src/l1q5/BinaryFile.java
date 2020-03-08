/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1q5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author User
 */
public class BinaryFile implements FileIO {

    private String fileName;
            

    public BinaryFile(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void writeToFile(String content) {
        try{
            ObjectOutputStream output = new ObjectOutputStream (new FileOutputStream(fileName));
            output.writeUTF(content);
            output.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }

    @Override
    public String readFromFile() {
        String read = "";
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            try{
                while(true){
                    read += input.readUTF();
                }
            }catch(EOFException e){}
            
            input.close();
            
        
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        
        return read;

    }
}
