/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q1;

/**
 *
 * @author User
 */
public class L6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String transactions = "D 400 | W 300 | W 700 | D 200 | D 450 | W 120";
        String [] array = transactions.split(" \\| ");   //https://stackoverflow.com/questions/24775817/java-string-split-method-call-not-working-correctly
        Queue<String> queue = new Queue<>();
        System.out.println("Enter transactions : "+transactions);
        for(String a: array){
            queue.enqueue(a);
        }
        queue.showQueue();
        
        int balance = 500;
        System.out.println("\nInitial Balance : "+balance);
        
        while(!queue.isEmpty()){
            String process = queue.dequeue();
            String [] temp = process.split(" ");
            if(temp[0].matches("D")){
                int amount = Integer.parseInt(temp[1]);
                balance += amount;
                System.out.printf("Deposit %d \t\tNew Balance %d \n",amount,balance);
                
            }
            else if(temp[0].matches("W")){
                int amount = Integer.parseInt(temp[1]);
                if(balance<amount){
                    System.out.printf("Withdraw %d Rejected \tNew Balance %d \n",amount,balance);
                }
                else{
                    balance -= amount;
                    System.out.printf("Withdraw %d \t\tNew Balance %d \n",amount,balance);
                }
                
            }
        }    
    }   
}
