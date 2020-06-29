/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9q2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class T9Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int key, count;
        SearchTest<Integer> a = new SearchTest<>(1,10);
        System.out.print("The Integer data set are : ");
        a.selectionSort(a.ASCENDING);
        a.showValue();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Binary Search");
        System.out.print("Enter a number to search: ");
        key = sc.nextInt();
        count = a.binarySearchCount(key);
        if (count!=0) {
            System.out.println(key+" is found");
            System.out.println("The number of " + key + " in the data set is " + count);
            System.out.print("The location of the "+key+" are : ");
            for(int c : a.locationElements(key)){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        else {
            System.out.println(key + " is not found");
        }
        sc.nextLine();
        try{
            System.out.print("Enter two numbers to search (begin end): ");
            int begin = sc.nextInt();
            int end = sc.nextInt();
            sc.nextLine();
//            System.out.println("Begin : "+begin);
//            System.out.println("End   : "+end);
            if(a.binarySearch(begin, end)){
                System.out.println("The integer can be found in between "+begin+" and "+end);
                System.out.println("The number of the elements in between "+begin+" and "+end
                        +" in the data set is "+a.binarySearchCount(begin, end));
                System.out.print("The location of the elements in between "+begin+" and "+end+" are : ");
                for(int i: a.locationElements(begin, end)){
                    System.out.print(i+" ");
                } 
                System.out.println();
            }
            else{
                System.out.println("No integer can be found in between "+begin+" and "+end);
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong search arguments");
        }
    
    }
    
}
