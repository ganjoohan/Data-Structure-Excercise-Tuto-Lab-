/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4q3;

/**
 *
 * @author User
 */
public class LinkedList <T> {
    private ListNode head;
    
    public LinkedList(){
        head = null;
    }
    
    public void addNote(T a){
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head == null){
            head = newNode;
        }
        else{
            while(currentNode.getLink() != null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    
    public ListNode getNodeByPosition(int findIndex){
        ListNode temp = head;
        int index = 0;
        while(temp != null){
            if(index == findIndex){
                return temp;
            }
            temp = temp.getLink();
            index++;
        }
        return null;
    }
    
    
    public void showList(){
        ListNode currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
  
//    public void merge(LinkedList q){
//        ListNode p_current = head, q_current = q.head;
//        ListNode p_next, q_next;
//        
//        //while there are available positions in p
//        while(p_current != null && q_current != null){
//            
//            //save next pointers
//            p_next = p_current.getLink();
//            q_next = q_current.getLink();
//            
//            //make  q_current as next of p_current
//            q_current.getLink() = p_next;
//            p_current.getLink() = q_current;
//            
//            //update current pointers for next iteration
//            p_current = p_next;
//            q_current = q_next;
//        }
//        q.head = q_current;
//    }
    
    
}
