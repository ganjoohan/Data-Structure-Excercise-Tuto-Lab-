/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q4;

import java.util.Random;

/**
 *
 * @author User
 */
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //StarList Game
        Random r = new Random();
        final int dice=6;
        int num;
        
        int turn = r.nextInt(2);
        if(turn == 0){
            System.out.println("Player 1 start first");    
        }
        else{
            System.out.println("Player 2 start first");
        }
        
        LinkedList <String> p1 = new LinkedList<>();
        LinkedList <String> p2 = new LinkedList<>();
        
        
        while(true){
            num=r.nextInt(dice)+1;
            if (turn%2==0){
                for(int i=0;i<num;i++){
                    p1.addNode("*");
                }
                System.out.print("\nPlayer 1: ");
                p1.showList();
            }
            else{
                for(int i=0;i<num;i++){
                    p2.addNode("*");
                }
                System.out.print("\nPlayer 2: ");
                p2.showList();
            }
            
            if (p1.length()>20 || p2.length()>20){
                break;
            }
            turn++;
        }
        
        if(p1.length()>20)
            System.out.println("\nPlayer 1 wins the game");
        else 
            System.out.println("\nPlayer 2 wins the game");
    }
        
}
    

