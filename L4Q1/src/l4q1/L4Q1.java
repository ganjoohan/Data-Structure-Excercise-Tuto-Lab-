/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q1;

import java.util.Random;

/**
 *
 * @author User
 */
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();
        LinkedList<Integer> c = new LinkedList<>();
        int [] num = new int[10];
        System.out.print("The random nunmbers are : ");
        for(int i=0;i<num.length;i++){
            num[i]=r.nextInt(101);
            System.out.print(num[i]+" ");
        }
        
        System.out.println("\nInsert the random numbers at the back of the linked list");
        for(int i=0;i<num.length;i++){
            a.addNode(num[i]);
        }
        a.showList();
        
        System.out.println("\nInsert the random numbers in front of the linked list");
        for(int i=0;i<num.length;i++){
            b.addFrontNode(num[i]);
        }
        b.showList();
        
        System.out.println("\nInsert the random numbers in a sorted linked list");
        for(int i=0;i<num.length;i++){
            c.addSortNode(num[i]);
        }
        c.showList();
        System.out.println();
    }
    
}
