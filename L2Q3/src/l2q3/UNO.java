/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2q3;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author User
 * @param <T>
 */
class UNO <T> {
    private T obj;
    private int N;
    private static int playerNumArray = 1;
    private static int playerNumLinkedList = 1;
    
    UNO(int N, T obj) throws Exception{
        this.N = N;
        this.obj = obj;
        if(obj instanceof String[]){
            System.out.println("Player " + playerNumArray + " draws " + N + " times" );
            playerNumArray++;
        }
        if(obj instanceof LinkedList){
            System.out.println("Player " + playerNumLinkedList + " draws " + N + " times ");
            playerNumLinkedList++;
        }
        
        if(N>=108) throw new Exception("No more card left!");
        draw(N);
            
    }
    
    private void draw(int N) throws Exception{
        Random r = new Random();
        String[] colour = {"Red", "Green", "Yellow", "Blue", "None"};
        String[] number = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] wild = {"Skip", "Reverse", "Draw"};
        String[] cards = new String[N];
        String str = "";
        
        for(int i=0; i<N; i++){
            //a,b,c is assigned index refer to colour/number/wild array to draw corresponding index card
            int a = r.nextInt(5);
            int b = r.nextInt(10);
            int c = r.nextInt(3);
            if(colour[a].equals("None")){
                //It's a +4 card
                str += wild[2]+ " " + number[b];
            }
            else{
                str += colour[a] + " ";
                if(r.nextInt(2)==0){  // 0 is normal card, 1 is wild card
                    str += number[b];
                }
                else{
                    if(wild[c].equals("Draw")){
                        str += wild[c] + " " + number[b]; //If want to do detial(Only have +2 & +4)
                    }
                    else{
                        str += wild[c];
                    }
                }
            }
            cards[i] = str;
            str = ""; //reset str again to draw new card
        } 
        
        if(obj instanceof String[]){
            obj = (T)cards;
        }
        else if(obj instanceof LinkedList){
            LinkedList ll = (LinkedList)obj;
            for(int x=0;x<N;x++){
                ll.add(cards[x]);
            }
        }
        else throw new Exception ("Invalid type");
    }

    @Override
    public String toString() {
        String z = "";
        if(obj instanceof String[]){
            String [] array = (String[])obj;
            for(int i=0; i<array.length; i++){
                z += array[i]+ " :: ";
            }
            return z;
        }
        else if(obj instanceof LinkedList){
            //declare linkedlist; seem like declare data type (int num = a)
            LinkedList list = (LinkedList)obj;
            for(int i=0;i<list.size();i++){
                z+=list.get(i)+" :: ";
            }
            return z;
            
        }
        else 
            return "Invalid Constructor";
    }
 
}
