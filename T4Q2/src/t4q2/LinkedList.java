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
public class LinkedList <T>{
    private ListNode head;
    
    public LinkedList(){
        head = null;
    }
    
    public void addNote(T a){
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head==null){
            head = newNode;
        }
        else {
            while (currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    
    public void showList(){
        ListNode currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    
    public void update(){
        ListNode currentNode = head;
        while (currentNode != null){
            if((Double)currentNode.getData()>20){
                currentNode.setData((Double)currentNode.getData()+10.5);
            }
            currentNode = currentNode.getLink();
        }
    }
    
}
