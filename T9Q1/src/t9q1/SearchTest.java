/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9q1;

import java.util.Random;

/**
 *
 * @author User
 */
public class SearchTest<T extends Comparable<T>> {
    public static final int ASCENDING = 1;
    public static final int DESCENDING = 2;
    private final int MAX=20;
    private final int MAXCHAR=26;
    private T[] value;    
    private int orderType, size, line;
    private Random r;
    
    public SearchTest(T b, int size) {            
        this.size = size;       
        line =10;
        value = (T[]) new Comparable[size];
        r = new Random();
        char c;
        for(int i=0; i<size; i++) {
            if (b instanceof Integer) 
                value[i] = (T) ((Integer) r.nextInt(MAX));                
            else if (b instanceof Double)
                value[i] = (T) ((Double) (0.01*r.nextInt(MAX)));
            else if (b instanceof Character) {
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i] = (T) ((Character) c);
            }
            else {
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i] = (T) (c+"");        
            }
        }
    }
        
    public SearchTest(int sortType, T b, int size) {    
        orderType = sortType;
        this.size = size;        
        line =10;
        value = (T[]) new Comparable[size];
        r = new Random();
        char c;
        for(int i=0; i<size; i++) {
            if (b instanceof Integer) 
                value[i] = (T) ((Integer) r.nextInt(MAX));                
            else if (b instanceof Double)
                value[i] = (T) ((Double) (0.01*r.nextInt(MAX)));
            else if (b instanceof Character) {
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i] = (T) ((Character) c);
            }
            else {
                c = (char)('A'+r.nextInt(MAXCHAR));
                value[i] = (T) (c+"");        
            }
        }
    }
    
    public void showValue() {
        for(int i=0; i<value.length; i++) {
            System.out.print(value[i] + " ");
            if ((i+1)%line==0)
                System.out.println();
        }    
    }    
    
    public T getElement(int index) {
        return value[index];
    }

    public int linearSearchCount(T t) {
        int count=0;
        for(int i=0; i<value.length; i++) {
            if(value[i].compareTo(t)==0)
                count++;
        }
        return count;
    }
    /*
        a. A method that returns true if the element can be found.
        b. A method that returns the number of occurrence for the element.
        c. A method that returns a list of index for the element.
        d. A method that returns true if the elements can be found. (search by range)
        e. A method that returns the number of occurrence for the elements. (search by range)
        f. A method that returns a list of index for the elements. (search by range)
    */
    public boolean linearSearch(T t1, T t2){
        for(int i=0; i<value.length;i++){
            if(value[i].compareTo(t1)>=0 && value[i].compareTo(t2)<=0){
                return true;
            }
        }
        return false;
    }
    
    
    public int linearSearchCount(T t1, T t2){
        int count=0;
        for(int i=0; i<value.length;i++){
            if(value[i].compareTo(t1)>=0 && value[i].compareTo(t2)<=0){
                count++;
            }
        }
        return count;
    }
    
    public int [] locationElements(T t1, T t2){
        int size = linearSearchCount(t1,t2);
        if(size == 0){
            return null;
        }
        int [] a = new int[size];
        for(int i=0, j=0; i<value.length;i++){
            if(value[i].compareTo(t1)>=0 && value[i].compareTo(t2)<=0){
                a[j]=i;
                j++;
            }
        }
        return a;
    }
    
    public int [] locationElements(T t1){
        int size = linearSearchCount(t1);
        if(size == 0){
            return null;
        }
        int [] a = new int[size];
        for(int i=0, j=0; i<value.length;i++){
            if(value[i].compareTo(t1)==0){
                a[j]=i;
                j++;
            }
        }
        return a;

    }
    
//    public char [] elementsFound(T t1, T t2){
//        int size = linearSearchCount(t1,t2);
//        if(size == 0){
//            return null;
//        }
//        char [] a = new char[size];
//        for(int i=0, j=0; i<value.length;i++){
//            if(value[i].compareTo(t1)>=0 && value[i].compareTo(t2)<=0){
//                a[j]=(Character)value[i];
//                j++;
//            }
//        }
//        return a;
//    }
}
