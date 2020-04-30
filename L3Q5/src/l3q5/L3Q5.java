/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int [] array = new int [5];
        int i = 0;
        while(true){
            try{
                System.out.print("Enter an Integer: ");
                array[i]=sc.nextInt();
                i++;
            }catch(InputMismatchException ex){
                System.out.println("Invalid input type");
                sc.nextLine();
                
            }catch(ArrayIndexOutOfBoundsException ex){
                break;
            }
            
        }
        System.out.println("The array of integers is: ");
        for (int a : array){
            System.out.print(a+" ");
        }
        System.out.println();
        
    }
    
}
