/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MEsut
 * Refer from https://www.geeksforgeeks.org/print-all-permutations-of-a-string-in-java/
 * https://www.youtube.com/watch?v=AfxHGNRtFac
 */
public class L3Q3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter number of elements: ");
        int element = sc.nextInt();
//        ArrayList<Integer> collection = new ArrayList<>();
        int [] array = new int [element];
        for(int i=0;i<element;i++){
            int random = rand.nextInt(10);
            array[i]=random;
        }
        System.out.print("The elements of the array: ");
        String str="";
        for(int a:array){
            str += a;
            System.out.print(a);
        }
        System.out.println();
        
        //Method 1
        Permutation(str, "");
//        str = "5520";
        System.out.println();
        System.out.println("Non-Duplicate Permutation:");
        NonDuplicatePermutation(str, "");
        System.out.println();
        
        
        
        //Method 2
        //printAllRecursive(element, array, ' ');
        
    }
    
    //Method 1 (Using String)
    public static void Permutation(String str, String ans){
        //if string is empty
        if(str.length() == 0){
            System.out.print(ans+" ");
            return;
        }
        
        for(int i=0; i<str.length();i++){
            
            //i th character of str
            char ch = str.charAt(i);
            
            //Rest of the string after excluding
            //the ith character
            String ros = str.substring(0, i)+str.substring(i+1);
            
            //Recursive call
            Permutation(ros, ans+ch);
        }
        
    }
    
    public static void NonDuplicatePermutation(String str, String ans){
        //if string is empty
        if(str.length() == 0){
            if(ans.charAt(0)=='0'){
                System.out.print(ans.substring(1)+" ");
            }
            else{
                System.out.print(ans+" ");
                return;
            }
        }
        
        // Make a boolean array of size '26' which 
        // stores false by default and make true  
        // at the position which alphabet is being 
        // used 
        boolean num[] = new boolean[10];
        
        for(int i=0; i<str.length();i++){
            
            //i th character of str
            char ch = str.charAt(i);
            
            //Rest of the string after excluding
            //the ith character
            String ros = str.substring(0, i)+str.substring(i+1);
            
            // If the character has not been used  
            // then recursive call will take place.  
            // Otherwise, there will be no recursive 
            // call 
            if (num[ch - '0'] == false) 
                NonDuplicatePermutation(ros, ans + ch); 
            num[ch - '0'] = true; 
        }
        
    }
    
    
    
    
    
    //Method 2 (Passing Array)
    public static void printAllRecursive(int n, int[] elements, char delimiter) {
 
        if(n == 1) {
            printArray(elements);
        } else {
            for(int i = 0; i < n-1; i++) {
                printAllRecursive(n - 1, elements, delimiter);
                if(n % 2 == 0) {
                    swap(elements, i, n-1);
                } else {
                    swap(elements, 0, n-1);
                }
            }
            printAllRecursive(n - 1, elements, delimiter);
        }
    }
    
    private static void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }   

    private static void printArray(int[] input) {
        System.out.print('\n');
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
    }
}
