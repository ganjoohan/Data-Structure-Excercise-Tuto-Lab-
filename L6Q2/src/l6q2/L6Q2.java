/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner input = new Scanner(new FileInputStream("lab6Q2.txt"));
            String str="";
            while(input.hasNextLine()){
                str += input.nextLine()+" ";
            }
            
            String [] array = str.split(" ");
            Queue<String> productCode = new Queue<>();
            ArrayList <String> arr = new ArrayList<>();
            for(String i : array){
                if(i.contains("P0")){
                    if(!arr.contains(i)){
                        arr.add(i);
                        productCode.enqueue(i);
                    }
                }
            }
            
            System.out.print("Product Code in Queue: ");
            productCode.showQueue();
            System.out.println();
            
            //The number of queue is variable & determined by reading data from textfile (How to Solve)
            Queue <String> P03 = new Queue<>();
            Queue <String> P02 = new Queue<>();
            Queue <String> P06 = new Queue<>();
            Queue <String> P04 = new Queue<>();
            
            for(int i=0;i<array.length;i=i+2){
                switch (array[i]) {
                    case "P03":
                        P03.enqueue(array[i+1]);
                        break;
                    case "P02":
                        P02.enqueue(array[i+1]);
                        break;
                    case "P06":
                        P06.enqueue(array[i+1]);
                        break;
                    case "P04":
                        P04.enqueue(array[i+1]);
                        break;
                    default:
                        break;
                }
            }
            
            System.out.println("List of product by categories");
            
            System.out.println("Product : "+productCode.dequeue());
            P03.showQueue();
            System.out.println("\nProduct : "+productCode.dequeue());
            P02.showQueue();
            System.out.println("\nProduct : "+productCode.dequeue());
            P06.showQueue();
            System.out.println("\nProduct : "+productCode.dequeue());
            P04.showQueue();
           
            System.out.println();
            
            input.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        
    }
    
}
