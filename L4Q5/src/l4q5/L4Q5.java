/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q5;

import java.util.Iterator;

/**
 *
 * @author User
 */
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <String> list = new LinkedList<>();
        list.addNode("ARS");
        list.addNode("AST");
        list.addNode("CHE");
        list.addNode("LEI");
        list.addNode("MAN");
        list.addNode("LIV");
        list.addNode("TOT");
        System.out.print("The list consists of ");
        list.showList();
        System.out.println("\nRemove all the word that consists of the A character using iterator.");
        
        
        //https://blog.csdn.net/qq_33642117/article/details/52225247
        
        LinkedList.LinkedListIterator itr = list.new LinkedListIterator<>();
        while(itr.hasNext()){
            String s = (String)itr.next();
            if(s.contains("A")){
                itr.remove();
            }
        }
        System.out.print("The updated list consists of ");
        list.showList();
        System.out.println();
    }
    
}
