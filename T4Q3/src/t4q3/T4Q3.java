/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4q3;

import java.util.Scanner;

/**
 *
 * @author MEsut
 */
public class T4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total amount: ");
        int money = sc.nextInt();
        System.out.println("Total amount: "+money);
        
        //convert money to currency notes
        int MYR100 = money/100;
        int MYR50 = (money%100)/50;
        int MYR20 = ((money%100)%50)/20;
        int MYR10 = (((money%100)%50)%20)/10;
        int MYR5 = ((((money%100)%50)%20)%10)/5;
        int MYR1 = ((((money%100)%50)%20)%10)%5;
        
        //Store the number of notes in another linked list.
        LinkedList <Integer> numberNote = new LinkedList<>();
        numberNote.addNote(MYR100);
        numberNote.addNote(MYR50);
        numberNote.addNote(MYR20);
        numberNote.addNote(MYR10);
        numberNote.addNote(MYR5);
        numberNote.addNote(MYR1);

        //insert the currency notes into a linked list.
        LinkedList <Integer> currencyNote = new LinkedList<>();
        currencyNote.addNote(100);
        currencyNote.addNote(50);
        currencyNote.addNote(20);
        currencyNote.addNote(10);
        currencyNote.addNote(5);
        currencyNote.addNote(1);
        
        for(int i=0; i<6; i++){
            System.out.println("MYR "+currencyNote.getNodeByPosition(i)+" : "+numberNote.getNodeByPosition(i));
        }
        
                
        
        
    }
    
    
}
