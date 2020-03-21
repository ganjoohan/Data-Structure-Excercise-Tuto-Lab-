/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4q4;

/**
 *
 * @author MEsut
 */
public class T4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListQ4 <Integer> list = new LinkedListQ4<>();
        list.addNote(23);
        list.addNote(15);
        list.addNote(17);
        list.addNote(28);
        list.addNote(12);
        list.addNote(40);
        list.showList();
        System.out.println();
        
        System.out.println("Linked List has "+list.length()+" node(s)");
        System.out.println("Total is "+list.Sum());
        System.out.println("Total even number is "+list.EvenNumber());
        
        
    }
    
}
