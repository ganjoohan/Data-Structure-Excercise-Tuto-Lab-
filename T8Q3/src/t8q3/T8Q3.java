/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8q3;

import java.util.Random;

/**
 *
 * @author User
 */
public class T8Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        LinkedList <Integer> a = new LinkedList<>();
        for(int i=0;i<10;i++){
            a.addNode(rand.nextInt(101));
        }
        
        System.out.print("The random integers are :");
        a.showList();
        
        System.out.println("\nSelection Sort - Ascending Order");
        a.selectionSort();
        a.showList();
        
    }
    
}
