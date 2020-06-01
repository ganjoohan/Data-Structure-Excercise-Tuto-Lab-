/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6q4;

/**
 *
 * @author User
 */
public class T6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] str = {"kayak","Welcome","Was it a car or a cat I saw?","civic","race car"};
        Queue<Character> que;
        Stack<Character> stac;
        for(int i=0; i<str.length;i++){
            que = new Queue<>();
            stac = new Stack<>();
            String temp = str[i];
            for(int j=0; j<temp.length();j++){
                que.enqueue(temp.charAt(j));
                stac.push(temp.charAt(j));
            }
            
            if(check(que,stac)){
                System.out.println(str[i]+ " is a palindrome.");
            }
            else{
                System.out.println(str[i]+ " is not a palindrome.");
            }
            
        }
    }
    
    public static boolean check(Queue<Character> a, Stack<Character> b){
        while(!a.isEmpty()){
            if(a.dequeue()!=b.pop()){
                return false;
            }
        }
        return true;
    }
    
}
