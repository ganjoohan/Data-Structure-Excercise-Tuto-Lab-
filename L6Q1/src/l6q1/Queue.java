/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q1;

/**
 *
 * @author User
 * @param <T>
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
}
