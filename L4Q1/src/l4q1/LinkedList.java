/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q1;

/**
 *
 * @author User
 */
public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList() {
        head = null;
    }
  
    public int length() {
        int count=0;    
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void clear() {
        head=null;
    }
    
    public boolean isEmpty() {
        return (head==null);
    }
    
    public void showList() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
        
    // insert at the back
    public void addNode(T a) {
        ListNode newNode =new ListNode(a, null);
        ListNode currentNode = head;        
        if (head==null) {
            head = newNode;
        }
        else {        
            while (currentNode.getLink() != null) 
                currentNode = currentNode.getLink();                                         
            currentNode.setLink(newNode);
        }
    }

    // delete from the back
    public void deleteNode() {
        ListNode currentNode = head;
        ListNode previousNode = head;
        if (head != null) {
            if (currentNode.getLink() == null)
                head = null;
            else {
                while (currentNode.getLink() != null) {
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);
            }    
        }
        else
            System.out.println("The list is empty.");
    }
   
    //insert at front
    public void addFrontNode(T a) {
        head = new ListNode(a, head);
    }
    
    public void deleteFrontNode() {
        if (head != null)
            head = head.getLink();
        else
            System.out.println("The list is empty.");
    }
    
    public boolean contains(T t) {
        boolean found = false;
        ListNode currentNode = head;
        while (currentNode != null) { 
            if (t.compareTo( (T) currentNode.getData())==0) {
                found = true;
                break;
            }            
            currentNode = currentNode.getLink();
        }
        return found;
   }
    
   public void addNodeByPosition(T a, int index) {        
        if (index==0) 
            addFrontNode(a);        
        else if (index==length())
            addNode(a);
        else if (index>length())
            System.out.println("Invalid index. No node inserted");   
        else {
            ListNode newNode =new ListNode(a, null);
            ListNode currentNode = head;
            for(int i=1; i<index; i++)
                currentNode = currentNode.getLink();
            
            ListNode tempNode = currentNode.getLink();
            currentNode.setLink(newNode);
            newNode.setLink(tempNode);
        }        
    }
    
    public void deleteNodeByPosition(int index) {        
        if (index==0) 
            deleteFrontNode();
        else if (index==length()-1)
            deleteNode();
        else if (index>=length())
            System.out.println("Invalid index. No node deleted");
        else {
            ListNode currentNode = head;
            for(int i=1; i<index; i++)
                currentNode = currentNode.getLink();
            ListNode tempNode = currentNode.getLink();
            currentNode.setLink(tempNode.getLink());
            tempNode = null;
        }
    }
    
    
    //https://www.geeksforgeeks.org/given-a-linked-list-which-is-sorted-how-will-you-insert-in-sorted-way/
    public void addSortNode(T a) {
        ListNode newNode = new ListNode(a, head);
        ListNode currentNode;
        
        //Special case for head node
        if (head == null || a.compareTo( (T) head.getData())<0){
            head = newNode;
        }
        else{
            //Locate the node before point of insertion
            currentNode = head;
            
            while(currentNode.getLink()!=null && a.compareTo((T)currentNode.getLink().getData())>0){
                currentNode = currentNode.getLink();
            }
            ListNode tempNode = currentNode.getLink();
            currentNode.setLink(newNode);
            newNode.setLink(tempNode);
        }
    }
}
