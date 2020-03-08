/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2q3;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class L2Q3 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("Array Implementation");
        String[] arr1 = {};
        String[] arr2 = {};
        UNO<String[]> player1 = new UNO<>(7,arr1);
        System.out.println(player1);
        System.out.println("Array Implementation");
        UNO<String[]> player2 = new UNO<>(7,arr2);
        System.out.println(player2);
        System.out.println("");
        System.out.println("Linked List Implementation");
        LinkedList<String> link1 = new LinkedList<>();
        LinkedList<String> link2 = new LinkedList<>();
        UNO<LinkedList> pp1 = new UNO(7,link1);
        System.out.println(pp1);
        System.out.println("Linked List Implementation");
        UNO<LinkedList> pp2 = new UNO(7,link2);
        System.out.println(pp2);
        
        
        
    }
    
}
