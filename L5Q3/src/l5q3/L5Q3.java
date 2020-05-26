/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q3;

/**
 *
 * @author User
 */
public class L5Q3 {
    
    static int [] column;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Solving the 4 Queens problems");
        
        int solution = 0;
        int N = 8; // Number of queen
        int currentPosition = 0; 
        column = new int[N];
        
        Stack <Integer> queen = new Stack<>();
          
        while(true){
            while(currentPosition<N){
                if(isValid(queen, currentPosition)){
                    queen.push(currentPosition);
                    column[queen.getSize()-1] = currentPosition;
                    currentPosition = 0;
                }
                else{
                    currentPosition++;
                }
            }
            
            if(queen.getSize() == N){
                display(queen, N);
                solution++;
            }
            
            if(queen.isEmpty()){
                break;
            }
            currentPosition = queen.pop()+1;
        }
        
        System.out.println("The number of solutions are : "+solution);
    }
    
    public static boolean isValid(Stack<Integer> stack, int currentPosition){
        
        for(int i=0;i<stack.getSize();i++){
            if(currentPosition == column[i] || Math.abs(currentPosition-column[i]) == stack.getSize()-i){
                //check diagonal, vertical, horizontal
                return false;
            }   
        }
        return true; 
    }
    
    public static void display(Stack<Integer> stack, int N){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(j == column[i]){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
