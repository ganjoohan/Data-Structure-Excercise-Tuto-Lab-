/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6q2;

/**
 *https://www.geeksforgeeks.org/array-implementation-of-queue-simple/
 * @author Mesut
 */
public class ArrayQueue <T> {
    private static final int size = 10;
    private T[] arr;
    private int currentSize=0;
    private int front = 0 , rear = 0;
    
    //Constructor
    public ArrayQueue(){
        arr = (T[]) new Object[size];
    }
    
    //isEmpty
    public boolean isEmpty(){
        return (currentSize==0);
    }
    
    //isFull
    public boolean isFull(){
        return (currentSize==size);
    }
    
    //getSize
    public int getSize(){
        return currentSize;
    }
    
    //enqueue
    public void enqueue(T a){
        if(isFull()){
            System.out.println("The Queue is Full");
        }
        else{
            arr[rear]= a;
            rear = ++rear%size;
            currentSize++;
        }
    }
    
    //dequeue
    public T dequeue(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
            return null;
        }
        else{
            T temp = arr[front];
            front = ++front%size;
            currentSize--;
            return temp;    
        }
    }
    
    //peek
    public T peek(){
        if(isEmpty()){
            System.out.println("The Queue is Empty.");
            return null;
        }
        else{
            return arr[front];
        }
    }
    
    //showQueue
    public void showQueue(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
        }
        else{
            for(int i=0;i<currentSize;i++){
                System.out.print(arr[front+i%size]+ " --> ");
            }
        }
    }
}
