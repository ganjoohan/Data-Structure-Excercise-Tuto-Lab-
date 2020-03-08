/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1q4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class BannerTesterClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = s.nextLine().toUpperCase();
        
        BannerA_G AG = new BannerA_G();
        BannerH_N HN = new BannerH_N();
        BannerO_T OT = new BannerO_T();
        BannerU_Z UZ = new BannerU_Z();
        
        // 1st line
        for(int i = 0; i < word.length(); i++){
                AG.display1stLine(word.charAt(i));
                HN.display1stLine(word.charAt(i));
                OT.display1stLine(word.charAt(i));
                UZ.display1stLine(word.charAt(i));
            if(i == word.length() - 1){
                System.out.println();
            }
        }
        
        // 2nd line
        for(int i = 0; i < word.length(); i++){
                AG.display2ndLine(word.charAt(i));
                HN.display2ndLine(word.charAt(i));
                OT.display2ndLine(word.charAt(i));
                UZ.display2ndLine(word.charAt(i));
            if(i == word.length() - 1){
                System.out.println();
            }
        }
        
        // 3rd line
        for(int i = 0; i < word.length(); i++){
                AG.display3rdLine(word.charAt(i));
                HN.display3rdLine(word.charAt(i));
                OT.display3rdLine(word.charAt(i));
                UZ.display3rdLine(word.charAt(i));
            if(i == word.length() - 1){
                System.out.println();
            }
        }
        
        // 4th line
        for(int i = 0; i < word.length(); i++){
                AG.display4thLine(word.charAt(i));
                HN.display4thLine(word.charAt(i));
                OT.display4thLine(word.charAt(i));
                UZ.display4thLine(word.charAt(i));
            if(i == word.length() - 1){
                System.out.println();
            }
        }
        
        // 5th line
        for(int i = 0; i < word.length(); i++){
                AG.display5thLine(word.charAt(i));
                HN.display5thLine(word.charAt(i));
                OT.display5thLine(word.charAt(i));
                UZ.display5thLine(word.charAt(i));
            if(i == word.length() - 1){
                System.out.println();
            }
        }
    }
}
