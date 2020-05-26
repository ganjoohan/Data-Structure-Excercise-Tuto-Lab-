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
public class ColourCard {
    public static void main(String[] args) {
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

        //Players
        Queue <String> player1 = new Queue<>();
        Queue <String> player2 = new Queue<>();
        for(int i=0;i<5;i++){
            player1.enqueue(deck[i]);
            player2.enqueue(deck[i+5]);
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
            String [] card1 = player1.dequeue().split(" ");
            String [] card2 = player2.dequeue().split(" ");
            
            //1) Compare number
            //2) Compare colour
            if(checkNumber(card1[0])>checkNumber(card2[0])){
                score1++;
            }
            else if(checkNumber(card1[0])<checkNumber(card2[0])){
                score2++;
            }
            else if(checkNumber(card1[0])==checkNumber(card2[0])){
                //If card is same number, then compare colour
                if(compareColour(card1[1])>compareColour(card2[1])){
                    score1++;
                }
                else{
                    score2++;
                }
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
    
    public static int checkNumber(String s){
        switch(s){
            case "One": return 1;
            case "Two": return 2;
            case "Three": return 3;
            case "Four": return 4;
            case "Five": return 5;
            case "Six": return 6;
            case "Seven": return 7;
            case "Eight": return 8;
            case "Nine": return 9;
            case "Ten": return 10;
        }
        return 0;
    }
    
    public static int compareColour(String s){
        switch(s){
            case "Blue": return 4;  //Highest 
            case "Green": return 3;
            case "Red": return 2;
            case "Yellow": return 1; //Lowest
        }
        return 0;
    }
}
