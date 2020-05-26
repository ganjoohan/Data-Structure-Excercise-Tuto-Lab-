/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner input = new Scanner(new FileInputStream("lab6Q4.txt"));
            Queue <String> stock = new Queue<>();
            while(input.hasNextLine()){
                String read = input.nextLine();
                stock.enqueue(read);
            }
            System.out.println("List of Transactions");
            stock.showQueueStock();
            
            int size = stock.getSize();
            int [] shareHold = new int[size];
            int [] priceBuyIn = new int [size];
            boolean [] checkSell = new boolean [size];
            
            for(int i=0; i<size; i++){
                String [] temp = stock.dequeue().split(" ");
                shareHold[i] = Integer.parseInt(temp[2]);
                priceBuyIn[i] = Integer.parseInt(temp[3]);
                if(temp[1].equals("S")){
                    checkSell[i]=true;
                }
            }
            
            int total = 0;
            for(int i=0; i<size; i++){
                if(checkSell[i]==true){
                    int sellShareAmount = shareHold[i];
                    int sellPrice = priceBuyIn[i];
                    for(int j=0; j<i; j++){
                        if(sellShareAmount>=shareHold[j]){
                            total += shareHold[j]*(sellPrice-priceBuyIn[j]);
                            sellShareAmount -= shareHold[j];
                            shareHold[j] = 0;
                        }
                        else{  //sellShareAmount < shareHold[i]
                            shareHold[j] -= sellShareAmount;
                            total += sellShareAmount*(sellPrice-priceBuyIn[j]);
                            sellShareAmount = 0;
                        }
                    }
                }
                //else nothing
            }
            
            if(total>0){
                System.out.println("Total Gain "+total);
            }
            else if(total<0){
                System.out.println("Total loss "+total);
            }
            else{
                System.out.println("No gain or loss");
            }       
            
            input.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    } 
}
