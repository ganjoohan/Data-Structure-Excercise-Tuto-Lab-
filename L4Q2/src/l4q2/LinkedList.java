/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q2;

/**
 *
 * @author User
 * @param <T>
 */
public class LinkedList <T extends Comparable<T>>{
    protected ListNode head;
    
    public LinkedList() {
        //head = null;
    }
  
    public int length() {
        int count=0;    
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void clear() {
        head=null;
    }
    
    public boolean isEmpty() {
        return (head==null);
    }
    
    public void showList() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
        
    // insert at the back
    public void addNode(T a) {
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

    // delete from the back
    public void deleteNode() {
        ListNode currentNode = head;
        ListNode previousNode = head;
        if (head != null) {
            if (currentNode.getLink() == null)
                head = null;
            else {
                while (currentNode.getLink() != null) {
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);
            }    
        }
        else
            System.out.println("The list is empty.");
    }
   
    //insert at front
    public void addFrontNode(T a) {
        head = new ListNode(a, head);
    }
    
    public void deleteFrontNode() {
        if (head != null)
            head = head.getLink();
        else
            System.out.println("The list is empty.");
    }
    
    public boolean contains(T t) {
        boolean found = false;
        ListNode currentNode = head;
        while (currentNode != null) { 
            if (t.compareTo( (T) currentNode.getData())==0) {
                found = true;
                break;
            }            
            currentNode = currentNode.getLink();
        }
        return found;
   }
    
   public void addNodeByPosition(T a, int index) {        
        if (index==0) 
            addFrontNode(a);        
        else if (index==length())
            addNode(a);
        else if (index>length())
            System.out.println("Invalid index. No node inserted");   
        else {
            ListNode newNode =new ListNode(a, null);
            ListNode currentNode = head;
            for(int i=1; i<index; i++)
                currentNode = currentNode.getLink();
            
            ListNode tempNode = currentNode.getLink();
            currentNode.setLink(newNode);
            newNode.setLink(tempNode);
        }        
    }
    
    public void deleteNodeByPosition(int index) {        
        if (index==0) 
            deleteFrontNode();
        else if (index==length()-1)
            deleteNode();
        else if (index>=length())
            System.out.println("Invalid index. No node deleted");
        else {
            ListNode currentNode = head;
            for(int i=1; i<index; i++)
                currentNode = currentNode.getLink();
            ListNode tempNode = currentNode.getLink();
            currentNode.setLink(tempNode.getLink());
            tempNode = null;
        }
    }
    
    public void set(T t, int index) {
        if (index==0) {
            setFront(t);
        }
        else if (index==length()-1)
            setBack(t);
        else if (index>=length())
            System.out.println("Invalid index. Update failed.");
        else {
            ListNode currentNode = head;
            for(int i=1; i<=index; i++)
                currentNode = currentNode.getLink();    
            currentNode.setData(t);   
        }
    }
    
    public void setFront(T t) {
        if (head != null)
            head.setData(t);
        else
            System.out.println("Invalid update. List is empty");
    }
    
    public void setBack(T t) {
        if (head != null) {
            ListNode currentNode = head;
            while(currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            currentNode.setData(t);
        }
        else
            System.out.println("Invalid update. List is empty");
    } 
    
    public T get(int index) {
        if (index==0) {
            return getFront();
        }
        else if (index==length()-1)
            return getBack();
        else if (index>=length())
            return null;
        else {
            ListNode currentNode = head;                        
            for(int i=1; i<=index; i++)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();            
        }
   }
    
    public T getFront() {
        if (head != null)
            return (T) head.getData();
        else
            return null;
    }
    
    public T getBack() {
        if (head != null) {
            ListNode currentNode = head;
            while(currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();        
        }    
        else
            return null;
    }
    
    //2(a) Create a new method splitList in the LinkedList.java. 
    //If the number of characters is odd, the extra character is inserted in the first list.
    public LinkedList<T>[] splitList(){
        LinkedList<T>[] list = new LinkedList[2];
        list[0]=new LinkedList<>();
        list[1]=new LinkedList<>();
        //number of characters is even
        if(length()%2==0){
            for(int i=0;i<length()/2;i++){
                list[0].addNode(get(i));
            }
            for(int i=length()/2;i<length();i++){
                list[1].addNode(get(i));
            }
        }
        //If the number of characters is odd, the extra character is inserted in the first list.
        else{
            for(int i=0;i<(length()/2)+1;i++){
                list[0].addNode(get(i));
            }
            for(int i=(length()/2)+1;i<length();i++){
                list[1].addNode(get(i));
            }
        }
        
        return list;
    }
    
    //2(b)Create a new method alternateList in the LinkedList.java. 
    //Split the list into two by alternating the elements from the original list.
    public LinkedList<T>[] alternateList(){
        //create two linkedlist in array
        LinkedList<T>[] list = new LinkedList[2];
        list[0]=new LinkedList<>();
        list[1]=new LinkedList<>();
        
        for(int i=0;i<length();i++){
            if(i%2==0){
                list[0].addNode(get(i));
            }
            else{
                list[1].addNode(get(i));
            }
        }
        
        return list;
    }
    
    
    
    //2(c)Create a new method mergeList in the LinkedList.java. 
    //Merge two lists into one by alternating the elements from both of the lists.
    public void mergeList(LinkedList<T> list){
        int size = length()+list.length();
        for(int i=0,j=0;i<size;i++){
            if(i%2 != 0){
                addNodeByPosition(list.get(j), i);
                j++;
            }
        }
    }
    
    
    //2(d)Create a recursive method in the LinkedList.java to reverse the list.
    //https://www.geeksforgeeks.org/reverse-a-linked-list/
    public ListNode reverse(ListNode head){
        
        if(head == null || head.getLink() == null){
            return head;
        }
        
         /* reverse the rest list and put the first element at the end */
         ListNode rest = reverse(head.getLink());
         head.link.link=head;
         
         /* tricky step -- see the diagram */
         head.link=null;
         
         /* fix the head pointer */
         return rest;
        
    }
}
