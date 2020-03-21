/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t4q4;

/**
 *
 * @author User
 */
public class LinkedListQ4 <T>{
    private ListNodeQ4 head;
    
    public LinkedListQ4(){
        head = null;
    }
    
    public void addNote(T a){
        ListNodeQ4 newNode = new ListNodeQ4(a,null);
        ListNodeQ4 currentNode = head;
        if(head == null){
            head = newNode;
        }
        else{
            while(currentNode.getNextLink() != null){
                currentNode = currentNode.getNextLink();
            }
            currentNode.setNextLink(newNode);
        }
    }
    
    public void showList(){
        ListNodeQ4 currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString()+" --> ");
            currentNode = currentNode.getNextLink();
        }
    }
    
    public int length(){
        int count = 0;
        ListNodeQ4 currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getNextLink();
            count++;
        }
        return count;
    }
    
    public void clear(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head==null);
    }
    
    public int Sum(){
        ListNodeQ4 currentNode = head;
        int sum = 0;
        while(currentNode != null){
            sum += (int)currentNode.getData();
            currentNode = currentNode.getNextLink();
        }
        return sum;
    }
    
    public int EvenNumber(){
        ListNodeQ4 currentNode = head;
        int count = 0;
        while(currentNode != null){
            if((int)currentNode.getData()%2 == 0){
                count++;
            }
            currentNode = currentNode.getNextLink();
        }
        return count;
    }
    
}
