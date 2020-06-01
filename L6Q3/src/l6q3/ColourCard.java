/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q3;

/**
 *
 * @author User
 * @param <T>
 */
public class ColourCard <T extends Comparable<T>> {
    private String number;
    private String color;

    public ColourCard(String number, String color) {
        this.number = number;
        this.color = color;
    }
    

    public String getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int compareTo(ColourCard b){
        
        //return 1 means player1 bigger
        //return -1 means player 2 bigger
        
        if(checkNumber(number)>checkNumber(b.number)){
            return 1;
        }
        else if(checkNumber(number)<checkNumber(b.number)){
            return -1;
        }
        else if(checkNumber(number)==checkNumber(b.number)){
            //If card is same number, then compare colour
            if(compareColour(color)>compareColour(b.color)){
                return 1;
            }
            else{
                return -1;
            }
        }
        
        return 0;
        
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

    @Override
    public String toString() {
        return number + " " + color ;
    }
}