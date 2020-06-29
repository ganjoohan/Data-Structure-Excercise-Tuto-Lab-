/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9q1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class T9Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char key;
        int count;
        SearchTest<Character> a = new SearchTest<>('A',10);
        System.out.print("The Character data set are : ");
        a.showValue();
        Scanner sc = new Scanner(System.in);
        System.out.println("Linear Search");
        System.out.print("Enter a letter to search: ");
        key = sc.next().charAt(0);
        count = a.linearSearchCount(key);
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
            System.out.print("Enter two letter to search (begin end): ");
            String search = sc.nextLine();
            String [] array = search.split(" ");
            char begin = array[0].charAt(0);
            char end = array[1].charAt(0);
//            System.out.println("Begin : "+begin);
//            System.out.println("End   : "+end);
            if(a.linearSearch(begin, end)){
                System.out.print("The character can be found in between "+begin+" and "+end);
//                for(char c: a.elementsFound(begin, end)){
//                    System.out.print(c+" ");
//                }

                System.out.println("\nThe number of the elements in between "+begin+" and "+end
                        +" in the data set is "+a.linearSearchCount(begin, end));
                System.out.print("The location of the elements in between "+begin+" and "+end+" are : ");
                for(int i: a.locationElements(begin, end)){
                    System.out.print(i+" ");
                } 
                System.out.println();
            }
            else{
                System.out.println("No character can be found in between "+begin+" and "+end);
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Wrong search arguments");
        }
    }
    
}
