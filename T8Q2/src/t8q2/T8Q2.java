/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8q2;

/**
 *
 * @author User
 */
public class T8Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //a. Merge Sort
        SortTest <String> a = new SortTest<>(SortTest.ASCENDING,"a");
        System.out.print("The random String are : ");
        a.showValue();
        System.out.println("Merge Sort - Axending Order");
        a.mergeSort();
        a.showValue();
        
        //b. Quick Sort
        SortTest <String> b = new SortTest<>(SortTest.ASCENDING,"a");
        System.out.print("The random String are : ");
        b.showValue();
        System.out.println("Quick Sort - Axending Order");
        b.quickSort();
        b.showValue();
    }
    
}
