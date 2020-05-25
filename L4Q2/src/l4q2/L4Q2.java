/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String w = sc.nextLine();
        
        System.out.print("The original list : ");
        LinkedList<Character> a = new LinkedList<>();
        for(char c: w.toCharArray()){
            a.addNode(c);
        }
        a.showList();
        
        //2(a)
        System.out.println("\nSplit the list into two");
        LinkedList <Character> [] split = a.splitList();
        LinkedList <Character> splitList1 = split[0];
        LinkedList <Character> splitList2 = split[1];
        System.out.print("First List : ");
        splitList1.showList();
        System.out.print("\nSecond List : ");
        splitList2.showList();
        
        //2(b)
        System.out.println("\nSplit the list by alternating the nodes");
        LinkedList <Character> [] alternate = a.alternateList();
        LinkedList <Character> alternateList1 = alternate[0];
        LinkedList <Character> alternateList2 = alternate[1];
        System.out.print("First List : ");
        alternateList1.showList();
        System.out.print("\nSecond List : ");
        alternateList2.showList();
        
        //2(c)
        System.out.println("\nMerge First List and Second List by alternating the nodes");
        alternateList1.mergeList(alternateList2);
        alternateList1.showList();
        
        //2(d) 
        System.out.println("\nReverse the list. Recursive method in the LinkedList");
        a.head = a.reverse(a.head);
        a.showList();
        
        //2(e)
        System.out.println("\nReverse the list. Recursive method in tester class");
        a.head = reverseTestClass(a.head);
        a.showList();
        
        System.out.println();
    }
    
    //2(e)Create a static recursive method in the tester class to reverse the list.
    public static ListNode reverseTestClass(ListNode head){
        
        if(head == null || head.getLink() == null){
            return head;
        }
        
         /* reverse the rest list and put the first element at the end */
         ListNode rest = reverseTestClass(head.getLink());
         head.link.link=head;
         
         /* tricky step -- see the diagram */
         head.link=null;
         
         /* fix the head pointer */
         return rest;
        
    }
    
    
    
}
