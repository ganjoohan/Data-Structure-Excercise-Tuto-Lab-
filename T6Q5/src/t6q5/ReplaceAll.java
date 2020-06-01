/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6q5;

/**
 *
 * @author User
 */
public class ReplaceAll {
    public static void main(String[] args) {
        
        //String s2 = s1.replaceAll(" ","").toLowerCase().replaceAll("[^a-z]","");
        //str.replaceAll("\\p{Punct}",""); 
        //String[] words = instring.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        //replaceAll("[^a-zA-Z0-9 ]", "")    
        
        String str = "&^* Hello Bitc  jjj )(*1230213";
        System.out.println("Initial: "+str);
        str = str.replaceAll("[^a-zA-Z]", ""); //^ means except a-z & A-Z
        System.out.println("Result: "+str);
    }
}
