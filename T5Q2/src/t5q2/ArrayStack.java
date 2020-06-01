/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5q2;

/**
 *
 * @author User
 */
public class ArrayStack<T> {
    private T[] elements;
    private int size;

    public ArrayStack() {
        elements = (T[])(new Object[10]);
        size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public boolean isFull(){
        return size == elements.length+1;
    }
    
    public int getSize(){
        return size;
    }
    
    public void push(T a){
        if(isFull()){
            System.out.println("The size is full");
        }
        else{
            elements[size] = a;
            size ++;
        }
    }
    
    public T pop(){
        if(size ==0){
            return null;
        }
        else{
            T temp = elements[size-1];
            elements[size-1] = null;
            size--;
            return temp;
        }
    }
    
    public T peek(){
         return elements[size-1];
    }
    
    public void showStack(){
        if(isEmpty()){
            System.out.println("Empty Stack");
        }
        else{
            for(int i=size-1; i>=0; i--){
                System.out.print("<--"+elements[i]);
            }
        }
    }
    
    
}
