
package t3q4;

import java.util.Scanner;

public class T3Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        try{
            if(s.length()>12){
                throw new NewStringException();
            }
        }catch(NewStringException e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
