/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2q1;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class L2Q1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        System.out.println("Generate 20 non-duplicate Iinteger within 0-100");
        
        System.out.println("Linked LIst Implementation");
        //to create an empty linkedlist type so that can pass in Generator class & determine by T type()generic
        LinkedList<Integer> linkedlist = new LinkedList<>();
        Generator<LinkedList> b = new Generator<>(20, linkedlist);
        System.out.println(b);
        
        System.out.println("Array implementation");
        //to create an empty array type so that can pass in Generator class & determine by T type()generic
        int [] array = {};
        Generator<int[]> g = new Generator<>(20, array);
        System.out.println(g);
    }
    
}
