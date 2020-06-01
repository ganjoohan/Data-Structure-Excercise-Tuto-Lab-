/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5q6;

import java.util.Random;

/**
 *
 * @author User
 */
public class T5Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Random number
        Random rand = new Random();
        int [] Q6 = new int[10]; 
        System.out.print("The random numbers are: "); 
        for(int i=0;i<10;i++){
            Q6[i]=rand.nextInt(100)+1;
            System.out.print(Q6[i]+" ");
        }
       
        boolean [] visited = new boolean[10];
        for(int i=0;i<10;i++){
            visited[i]=false;
        }
        
        Stack <Integer> stack = new Stack<>();
        boolean first = true;
        for(int i=0,j=0; i<Q6.length; i++){
            if(first == true){
                if(Q6[i]%2==1){
                    stack.push(Q6[i]);
                    visited[i]=true;
                    first = false;
                    j++;
                }
            }
            else{
                if(Q6[i]%2==0 && j%2==1 && visited[i]==false){
                    stack.push(Q6[i]);
                    visited[i]=true;
                    j++;
                }
                else if(Q6[i]%2==1 && j%2==0 && visited[i]==false){
                    stack.push(Q6[i]);
                    visited[i]=true;
                    j++;
                }
                
                //When reach end of the array
                if(i==9){
                    int top = stack.peek();
                    for(int k=0; k<Q6.length; k++){
                        //reset back the array again to loop again
                        if(visited[k]==false &&(Q6[k]%2!=top%2)){
                            i=k;
                            //if no i--, infinite loop: if no i--, when exit this for loop, i++ again, thus , in some case 
                            //i will become 10; out of boundary
                            i--;
                            break;
                        }
                    }
                }
            }
        }
        
        
        System.out.print("\nThe numbbers in the stack : ");
        stack.showStack();
        System.out.println("\nThe numbers remain in the array");
        for(int i=0;i<Q6.length;i++){
            if(visited[i]==false){
                System.out.print(Q6[i]+" ");
            }
        }
        System.out.println();
    }
}