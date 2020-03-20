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
public class ListNode <T> {
    private T data;
    private ListNode link; //declare object

    public ListNode() {
        data = null;
        link = null;
    }

    public ListNode(T a, ListNode b) {
        data = a;
        link = b;
    }

    public T getData() { return data; }
    public void setData(T a) { data = a; }

    public ListNode getLink() { return link; }
    public void setLink(ListNode b) { link = b; }

    public String toString(){
        return data + " --> ";
    }
    
    
    
    
}

