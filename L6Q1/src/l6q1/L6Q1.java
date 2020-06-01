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
        String transactions = "D400|W300| w 700 | d 200 | D450 | W120";
        String [] array = transactions.split("\\|");   //https://stackoverflow.com/questions/24775817/java-string-split-method-call-not-working-correctly
        Queue<String> queue = new Queue<>();
        System.out.println("Enter transactions : "+transactions);
        for(String a: array){
            queue.enqueue(a);
        }
        queue.showQueue();
        
        int balance = 500;
        System.out.println("\nInitial Balance : "+balance);
        
        try{
            
            while(!queue.isEmpty()){
                String process = queue.dequeue();

                //remove all spaces and change it to lower case to prevent cases where user inputs multiple spaces or mixed letter cases.  
                process = process.replaceAll("\\s+","").toLowerCase();

                if(process.charAt(0) == 'd'){
                    //To read the amount, we simply need to read the substring after the first character 
                    int amount = Integer.parseInt(process.substring(1));
                    balance += amount;
                    System.out.printf("Deposit %d \t\tNew Balance %d \n",amount,balance);

                }
                else if(process.charAt(0) == 'w'){
                    int amount = Integer.parseInt(process.substring(1));
                    if(balance<amount){
                        System.out.printf("Withdraw %d Rejected \tNew Balance %d \n",amount,balance);
                    }
                    else{
                        balance -= amount;
                        System.out.printf("Withdraw %d \t\tNew Balance %d \n",amount,balance);
                    }

                }
            }    
            
        }catch(NumberFormatException e){
            System.out.println("Amount cannot be parsed into integer type");
        }
    }   
}
