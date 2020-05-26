/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q4;

/**
 *
 * @author User
 */
public class Queue <T>{
    private ListNode head;
    
    public Queue() {
        head = null;
    }
    
    public boolean isEmpty() {
        return (head==null);
    }    
    
    public int getSize() {
        int count=0;    
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void enqueue(T a) {
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
    
    public T dequeue() {
        if (head == null)
            return null;
	T temp = (T) head.getData();
        head = head.getLink();
        return temp;
    }
    
    public T peek() {
        if (head == null)
            return null;
	else
            return (T) head.getData();
    }
    
    public void showQueue() {        
        if (!isEmpty()) {
            ListNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
        }        
    }
    
    //Question 4
    public void showQueueStock(){
        if (!isEmpty()) {
            ListNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.toStringStock());
                currentNode = currentNode.getLink();
            }
        }
    }
 
}

class ListNode<T> {
    private T data;
    private ListNode link;
    
    public ListNode() {
        data = null;
        link = null;
    }
    
    public ListNode(T a, ListNode b) {
        data = a;
        link = b;
    }
    
    public void setData(T a) {data = a;}
    public T getData() {return data;}    
    public void setLink(ListNode a) { link = a;}
    public ListNode getLink() { return link; }    
    @Override
    public String toString() { return data + " --> "; }
    
    //Question 4
    public String toStringStock(){
        String [] array = String.valueOf(data).split(" ");
        if(array[1].equals("B")){
            System.out.printf("Day %s : Buy %s shares at RM %s --> ",array[0],array[2],array[3]);
        }
        else if(array[1].equals("S")){
            System.out.printf("Day %s : Sell %s shares at RM %s --> ",array[0],array[2],array[3]);
        }
        return "\n";
    }
}

