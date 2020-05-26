/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String [] str = sc.nextLine().split(" ");
        
        CircularLinkedList<String> list = new CircularLinkedList<>();
        
        for(String i:str){
            list.addCircularNode(i);
        }
         
        System.out.println("\nThe words in the circular linked list");
        list.showCircularList();
        
        System.out.println("After delete a word");
        list.deleteCircularNode();
        list.showCircularList();
        
        System.out.println("The second item in the list is "+list.getCircularItem(1));
        
        
        
        
    }
    
}
