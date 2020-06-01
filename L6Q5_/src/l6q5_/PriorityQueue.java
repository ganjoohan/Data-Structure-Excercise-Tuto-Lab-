/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q5_;

/**
 *
 * @author User
 * @param <T>
 */
public class PriorityQueue<T extends Packet>{
    
    private ListNode head;

    public PriorityQueue() {
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.getLink();
        }
        return count;
    }

    //Question requirement
    //Actually can be simpler
    /*
      Do you really need to modify both enqueue and dequeue method to make a queue a priority queue? 
      Philemon's advise : You definitely do not need to. 
      You only need one and its usually the dequeue method because we're interested in the way the items in a queue are taken out.  
    */
    //https://www.java2novice.com/data-structures-in-java/queue/priority-queue/
    
    public void enqueuePriority(T a){
        ListNode newNode = new ListNode(a, null);
        if(head == null) 
                head = newNode;
        else {
            PriorityQueue<T> tmp = new PriorityQueue<>();
            ListNode current = head;
            while(!isEmpty() && peek().getPriority() >= a.getPriority()) {
                tmp.enqueue(dequeue());
            }    
            tmp.enqueue(a); 
            while(!isEmpty()) 
                tmp.enqueue(dequeue());
            while(!tmp.isEmpty()) 
                enqueue(tmp.dequeue()); 
        }
    }

    private void enqueue(T a){
        ListNode newNode = new ListNode(a, null);
        if(head == null) 
                head = newNode;
        else {
            ListNode current = head;
            while(current.getLink() != null) 
                current = current.getLink();
            current.setLink(newNode);
        }
    }

    public T dequeue(){
        if(head == null) 
                return null;
        T a = (T) head.getData();
        head = head.getLink();
        return a;
    }

    public T peek(){
        if(head == null) 
                return null;
        return (T) head.getData();
    }

    public void showQueue(){
        if(head == null) 
                System.err.println("EmptyQueueException");
        else {
            ListNode current = head;
            while(current != null){
                System.out.println(current.getData().getPacketType() + " " 
                        + current.getData().getOrder() + " (Priority=" 
                        + current.getData().getPriority() + ')');
                
                current = current.getLink();
            }
        }
    }
}

class ListNode<T extends Packet> {
	//extend packet
	
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
