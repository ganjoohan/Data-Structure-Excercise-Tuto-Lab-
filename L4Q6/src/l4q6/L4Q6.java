/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q6;

import java.util.Random;

/**
 *
 * @author User
 */
public class L4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        System.out.print("The random numbers are : ");
        for(int i=0;i<10;i++){
            int num=r.nextInt(101);
            System.out.print(num+" ");
            list.addRightNode(num);
        }
        System.out.println("\nInsert the random numbers into the doubly linked list");
        list.showList();
        
        System.out.println("\nRemove a number from the third position");
        list.deleteNodeByPosition(2);
        list.showList();
        
        System.out.println("\nReplace the number in seventh position with 999");
        list.deleteNodeByPosition(6);
        list.addNodeByPosition(999, 6);
        list.showList();
        
        System.out.println("\nRemove all even number from the the doubly linked list");
        list.deleteEven();
        list.showList();
        System.out.println();
    }
    
}
