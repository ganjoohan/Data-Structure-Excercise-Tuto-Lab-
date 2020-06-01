/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q3;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author User
 */
public class L6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] deck 
                = {"One Blue","One Green","One Red","One Yellow",
                    "Two Blue","Two Green","Two Red","Two Yellow",
                    "Four Blue","Four Green","Four Red","Four Yellow",
                    "Five Blue","Five Green","Five Red","Five Yellow",
                    "Six Blue","Six Green","Six Red","Six Yellow",
                    "Seven Blue","Seven Green","Seven Red","Seven Yellow",
                    "Eight Blue","Eight Green","Eight Red","Eight Yellow",
                    "Nine Blue","Nine Green","Nine Red","Nine Yellow",
                    "Ten Blue","Ten Green","Ten Red","Ten Yellow",
                };
            
        //Shuffle
        Collections.shuffle(Arrays.asList(deck));
        
        Queue <ColourCard> player1 = new Queue<>();
        Queue <ColourCard> player2 = new Queue<>();
        
        for(int i=0;i<5;i++){
            String [] temp1 = deck[i].split(" ");
            ColourCard a = new ColourCard(temp1[0], temp1[1]);
            player1.enqueue(a);

            String [] temp2 = deck[i+5].split(" ");
            ColourCard b = new ColourCard(temp2[0], temp1[1]);
            player2.enqueue(b);
        }
        
        System.out.println("Player 1 Card");
        player1.showQueue();
        System.out.println("\nPlayer 2 Card");
        player2.showQueue();
                   
        //Score
        int score1 = 0;
        int score2 = 0;
        int i=0;
        while(i<5){
            int result = player1.dequeue().compareTo(player2.dequeue());
            if(result>0){
                score1++;
            }
            else if(result<0){
                score2++;
            }
            else{
                System.out.println("No possible to draw same card in a desk");
            }
            i++;    
        }
        
        System.out.println("\nPlayer 1 Score: "+score1);
        System.out.println("Player 2 Score: "+score2);
        if(score1>score2){
            System.out.println("Player 1 WINS!");
        }
        else{
            System.out.println("Player 2 WINS!");
        }    
    }   
    
}
