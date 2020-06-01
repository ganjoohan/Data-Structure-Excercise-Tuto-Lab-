/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6q3;

import java.util.Random;

/**
 *
 * @author User
 */
public class T6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Simulating a Queue to puchase MY phone");
        Queue<String> q = new Queue<>();
        Random r = new Random();
        
        int total = 0;
        int customer = 1;
        while(total<30){
            int phone = r.nextInt(3)+1;
            if(total+phone<=30){
                q.enqueue("Customer "+customer+" : "+phone+" set(s) ");
                total += phone;
                customer++;
            }
        }
        
        q.showQueue();
        System.out.println("Number of Customer : "+q.getSize());
        
        
    }
    
}
