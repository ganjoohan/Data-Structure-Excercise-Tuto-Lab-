/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q2;

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
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner input = new Scanner(new FileInputStream("L2Q2textfile.txt"));
            PrintWriter output = new PrintWriter(new FileOutputStream("L2Q2ReverseTextFile.txt"));
            Reverse(input,output);
            input.close();
            output.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
    public static void Reverse(Scanner input,PrintWriter output){
        if(!input.hasNextLine()){
            
        }
        else{
            String line = input.nextLine();
            System.out.println(line);
            Reverse(input,output);
            System.out.println(line);
            output.println(line);
        }
    }
    
}
