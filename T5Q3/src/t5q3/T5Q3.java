/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t5q3;

/**
 *
 * @author User
 */
public class T5Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListStack<String> stack = new LinkedListStack<>();
        String s = "Software-defined networking (SDN) technology is an approach to network management";
        System.out.println("Enter a sentence : "+s);
        System.out.println("Original Sentence: "+s);
        
        //Sentence reverse
        System.out.print("The sentence in reverse order : ");
        for(int i=0; i<s.length();i++){
            stack.push(s.charAt(i)+"");
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        
        System.out.print("\nThe word in reverse order : ");
        String [] word = s.split(" ");
        for(int i=0;i<word.length;i++){
            stack.push(word[i]);
        }
        
        //Pop out word
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }
    
}
