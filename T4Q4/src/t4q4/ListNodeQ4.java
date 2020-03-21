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
public class ListNodeQ4 <T> {
    private T data;
    private ListNodeQ4 next;
    
    public ListNodeQ4(){
        data = null;
        next = null;
    }
    
    public ListNodeQ4(T a, ListNodeQ4 b){
        data = a;
        next = b;
    }
    
    public T getData(){
        return data;
    }
    public void setData(T a){
        data = a;
    }
    
    public ListNodeQ4 getNextLink(){
        return next;
    }

    public void setNextLink(ListNodeQ4 b){
        next = b;
    }
    
    @Override
    public String toString(){
        return data + "";
    }
}

