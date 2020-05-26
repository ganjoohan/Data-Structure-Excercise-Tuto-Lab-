/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q6;

/**
 *
 * @author User
 */
public class DoubleListNode<T>{
    private T data;
    private DoubleListNode previousLink;
    private DoubleListNode nextLink;
    
    public DoubleListNode(){
        data = null;
        previousLink = null;
        nextLink = null;
    }
    
    public DoubleListNode(T a,DoubleListNode b, DoubleListNode c){
        data = a;
        previousLink = b;
        nextLink = c;
    }
    
    public void setData(T a){data = a;}
    public T getData(){ return data; }
    public void setLink(DoubleListNode a, DoubleListNode b) {previousLink = a; nextLink = b;}
    public void setNextLink(DoubleListNode a) {nextLink = a;}
    public DoubleListNode getNextLink(){ return nextLink;}
    public void setPreviousLink (DoubleListNode a) { previousLink = a; }
    public DoubleListNode getPreviousLink(){ return previousLink; }
    @Override
    public String toString() { return " <-- " + data + " --> ";}

}
