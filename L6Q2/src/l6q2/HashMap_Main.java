/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class HashMap_Main {
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
            
            //Implementation HashMap to solve (number of queue is variable) problem
            
            //First create a HashMap  that stores String as key, Queue as value (key = String, value = Queue) 
            HashMap <String, Queue<String>> allQueues = new HashMap<>();
            
            int j = 1;
            for(String i : array){
                if(i.contains("P0")){
                    //Then to process your inputs:  
                    if (allQueues.containsKey(i)){
                        // this means you have already created a queue for this product code, simply enqueue it to the existing queue 
                        allQueues.get(i).enqueue(array[j]);
                        j += 2;
                        
                    }
                    else{
                        // Queue for the productCode doesn’t exist. Create a new queue and put it in the hashmap 
                        Queue <String> q = new Queue<>();
                        q.enqueue(array[j]);                       
                        productCode.enqueue(i); //productCode in queue
                        j += 2;
                        allQueues.put(i, q);
                    }
                }
            }
            
            System.out.print("Product Code in Queue: ");
            productCode.showQueue();
            System.out.println();
            
            System.out.println("List of product by categories");
            
            for(int i=0; i<allQueues.size(); i++){
                String code = productCode.dequeue();
                System.out.println("Product : "+code);
                allQueues.get(code).showQueue();
                System.out.println();
            }

            System.out.println();
            
            input.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        
    }
}
