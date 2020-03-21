/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4q5;

/**
 *
 * @author User
 */
public class T4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListQ5 <Integer> list = new LinkedListQ5<>();
        int NumOfRandom = 15;
        for(int i=0; i<NumOfRandom; i++){
            list.addNote(list.RandomNumber());
        }
        System.out.println("Linked List has "+list.length()+" node(s)");
        list.showList();
        System.out.println();
        int NumToDelete = 4;
        System.out.println("Delete the number "+NumToDelete+" from the list.");
        list.DeleteSpecifyNumber(NumToDelete);
        System.out.println();
        System.out.println("Linked List has "+list.length()+" node(s)");
        list.showList();
        System.out.println();
        
    }
    
}
