/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q1;

/**
 *
 * @author User
 */
public class L5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> candy = new Stack<>();
        Stack<String> temp = new Stack<>();
        candy.push("Orange");
        candy.push("Red");
        candy.push("Blue");
        candy.push("Orange");
        candy.push("Yellow");
        candy.push("Yellow");
        candy.push("Blue");
        System.out.println("The candies in the container: ");
        candy.showStack();
        System.out.println("\nAli takes all the candies one by one from the container and eats the blue ones");
        
         

        while(!candy.isEmpty()){ 
            // we have to pop it regardless of its color, so just pop it outside the if-else 
            String currentCandy = candy.pop(); 
            // we only push it back to the temp stack if it is not "Blue" 
            if(!currentCandy.equals("Blue")){ 
                temp.push(currentCandy); 
            }
        }

//        while(!candy.isEmpty()){
//            if(candy.peek().endsWith("Blue")){
//                //eat 
//                candy.pop();
//            }
//            else{
//                temp.push(candy.pop());
//            }
//        }
        
        System.out.println("He puts back the rest of candies in the container.");
        //put back rest of candies 
        while(!temp.isEmpty()){
            candy.push(temp.pop());
        }
        
        System.out.println("The candies in the container: ");
        candy.showStack();
        System.out.println();
        
        
        
    }
    
}
