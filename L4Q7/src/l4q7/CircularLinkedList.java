/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q7;

/**
 *
 * @author User
 * @param <T>
 * 
 * This question is to test your concept on how to traverse a circular linked-list. 
 * Remember, in a conventional linked list, we traverse the list from the head node and stop the traversal when we reach NULL. 
 * In a circular linked list, we stop traversal when we reach the first node again 
 */
public class CircularLinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public CircularLinkedList(){
        head = null;    
    }
  
    public int length() {  
        ListNode currentNode = head;
        if(head == null){
            return 0;
        }
        else{
            int count = 1;
            while (currentNode.getLink()!=head) {
                currentNode = currentNode.getLink();
                count++;
            }
            return count;
        }
    }
    
    //insert at the back
    public void addCircularNode(T a){
        ListNode newNode =new ListNode(a, head);
        
        if (head==null) {
            head = newNode;
            head.setLink(head);
        }
        else {        
            ListNode currentNode = head;
            while (currentNode.getLink() != head) {
                currentNode = currentNode.getLink();                                         
            }
            currentNode.setLink(newNode);
        }
    }
    
    //delete from the back
    public void deleteCircularNode() {
        if(head != null){
            if(head.getLink() == head)
                head = null;
            else{
                ListNode currentNode = head;
                ListNode previousNode = head;
                while(currentNode.getLink() != head){
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                currentNode = null;
                previousNode.setLink(head);
            }
        }
        else
            System.out.println("The list is empty.");
    }
    
    public void showCircularList() {
        if(head != null){
            ListNode currentNode = head;
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
            while (currentNode != head) {
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
            System.out.println(currentNode.toString());
            
        }else{
            System.out.println("Empty List");
        }
    }
    
    public T getCircularItem(int index) {
        if (index==0) {
            return getFront();
        }
        else if (index==length()-1)
            return getBack();
        else if (index>=length())
            return null;
        else {
            ListNode currentNode = head;                        
            for(int i=1; i<=index; i++)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();            
        }
   }
    
    public T getFront() {
        if (head != null)
            return (T) head.getData();
        else
            return null;
    }
    
    public T getBack() {
        if (head != null) {
            ListNode currentNode = head;
            while(currentNode.getLink() != head)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();        
        }    
        else
            return null;
    }
    
}
