
package l1q4;

import java.util.Scanner;


public class L1Q4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter banner: ");
        String banner = sc.next();
        banner = banner.toUpperCase();
        A_G a = new A_G();
        for(int i=0; i<banner.length();i++){
            String character = banner.substring(i, (i+1));
            switch(character){
                case "A": a.toString(character);break;
                case "B": a.toString(character);break;
                case "C": a.toString(character);break;
                case "D": a.toString(character);break;
                case "E": a.toString(character);break;
                case "F": a.toString(character);break;
                case "G": a.toString(character);break;
                
            }
            
      
                
        }
    }
    
}
