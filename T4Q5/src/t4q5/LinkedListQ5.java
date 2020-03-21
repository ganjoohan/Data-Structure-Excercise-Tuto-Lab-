/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4q5;

import java.util.Random;

/**
 *
 * @author User
 */
public class LinkedListQ5 <T> {
    private ListNodeQ5 head;
    
    public LinkedListQ5(){
        head = null;
    }
    
    public void addNote(T a){
        ListNodeQ5 newNode = new ListNodeQ5(a,null);
        ListNodeQ5 currentNode = head;
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
    
    public int length(){
        int count = 0;
        ListNodeQ5 currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void showList(){
        ListNodeQ5 currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString()+" --> ");
            currentNode = currentNode.getLink();
        }
    }
    
    public void clear(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    
    public void deleteNode(){
        ListNodeQ5 currentNode = head;
        ListNodeQ5 previousNode = head;
        if(head != null){
            if(currentNode.getLink() == null){
                head = null;
            }
            else{
                while(currentNode.getLink() != null){
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);
            }
        }
        else{
            System.out.println("The list is empty");
        }
    }
    
    public void deleteFrontNode(){
        if(head!=null)
            head = head.getLink();
        else
            System.out.println("The list is empty");
    }
    
    
    public void deleteNodeByPosition(int index) {        
        if (index==0) 
            deleteFrontNode();
        else if (index==length()-1)
            deleteNode();
        else if (index>=length())
            System.out.println("Invalid index. No node deleted");
        else {
            ListNodeQ5 currentNode = head;
            for(int i=1; i<index; i++)
                currentNode = currentNode.getLink();
            ListNodeQ5 tempNode = currentNode.getLink();
            currentNode.setLink(tempNode.getLink());
            tempNode = null;
        }
    }
    
    
    public int RandomNumber(){
        Random rand = new Random();
        return rand.nextInt(11);
    }
    
    public void DeleteSpecifyNumber(int num){
        ListNodeQ5 currentNode = head;
        for(int i=0; i<length(); i++){
            if((int)currentNode.getData() == num){
                System.out.print(i+" ");
                deleteNodeByPosition(i);
                currentNode = head;
                i=0;
            }
            currentNode=currentNode.getLink();
            
            
        }
    }
    
}
