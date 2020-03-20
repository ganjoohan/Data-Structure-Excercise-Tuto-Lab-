/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4q2;

/**
 *
 * @author User
 */
public class T4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <Double> list = new LinkedList<>();
        System.out.println("The number in the linked list");
        list.addNote(23.1);
        list.addNote(36.5);
        list.addNote(12.8);
        list.addNote(42.6);
        list.addNote(32.8);
        list.showList();
        System.out.println();
        
        System.out.println("The number in the linked list after updated");
        list.update();
        list.showList();
        System.out.println();
        
    }
    
}
