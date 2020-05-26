/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q8;

/**
 *
 * @author User
 */
public class CircularLinkedList<T> {
    private ListNode head;
    
    public int length(){
        ListNode currentNode=head;
       if (head==null)
           return 0;
       else{
           int count=1;   
        while(currentNode.getLink()!=head){
          currentNode=currentNode.getLink();
          count++;
        }
        return count;
    }
    }
  
       public void addCircularNode(T e){
           ListNode newNode=new ListNode(e,head);
           if(head==null){
               head=newNode;
               head.setLink(head);
           }else{
               ListNode currentNode=head;
               while(currentNode.getLink()!=head)
                   currentNode=currentNode.getLink();
               currentNode.setLink(newNode);
               
           }
               
       }
//      
    public void showCircularNode(){
        ListNode currentNode=head;
        Music m=(Music)currentNode.getData();
        if(head==null)
            System.out.println("The list is empty");
        else{
            do{
                if(currentNode.getData() instanceof Music)
                    System.out.print(m.getTitle()+"--->");
                currentNode=currentNode.getLink();
                m=(Music)currentNode.getData();
                if(currentNode==head)
                    System.out.println(m.getTitle());
            }
            while(currentNode!=head);
        }
    }
    public T getTitle(int index){
        ListNode currentNode=head;
        Music temp;
        if(currentNode.getData() instanceof Music){
            for(int i=0;i<index;i++)
                currentNode=currentNode.getLink();
            temp=(Music)currentNode.getData();
            return (T) temp.getTitle();
        }
        else
            return null;
    }
    
    public T getFileName(int index){
        ListNode currentNode=head;
        Music temp;
        if(currentNode.getData() instanceof Music){
            for(int i=0;i<index;i++)
                currentNode=currentNode.getLink();
            temp=(Music)currentNode.getData();
            return (T) temp.getFileName();
        }
        else
            return null;
    }
}
