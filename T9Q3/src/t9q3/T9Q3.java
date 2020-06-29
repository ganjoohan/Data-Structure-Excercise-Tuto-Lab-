/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9q3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class T9Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashTable<String,String> hash = new HashTable<>();
        hash.put("100-101", "ICND 1");
        hash.put("200-101", "ICND 2");
        hash.put("200-120", "CCNA Routing and Switching");
        hash.put("210-260", "CCNA Security");
        System.out.println("Hash Table");
        System.out.println("The number of elements in the Hash Table "+hash.getSize());
        hash.showHashTable();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a code to search : ");
        String key = sc.next();
        if(hash.containsKey(key)){
            System.out.println("Course "+key+" : "+hash.get(key));
        }
        else{
            System.out.println("The course "+key+" cannot be found");
        }
           
    }
    
}
