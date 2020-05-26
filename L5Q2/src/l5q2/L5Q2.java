/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class L5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine();
        infix = convertInfix(infix);
        System.out.println("The infix expression is: "+infix);
        
        String postfix = infixToPostfix(infix);
        System.out.println("The postfix expression is: "+postfix);
        
        System.out.println("The result is: "+postfixEvaluation(postfix));
        
    }
    public static String convertInfix(String a){
        a = a.replaceAll("add", "+")
                .replaceAll("sub", "-")
                .replaceAll("mul", "*")
                .replaceAll("div", "/")
                .replaceAll("mod", "%")
                .replaceAll("ob", "(")
                .replaceAll("cb", ")");
        return a;
    }
    
    
    public static String infixToPostfix(String a){
        String str="";
        char c=' ';
        Stack<String> stack = new Stack<>();
        for(String ch: a.split(" ")){
            if(Character.isLetterOrDigit(ch.charAt(0)))
                str += ch + " ";
            else if (ch.charAt(0) == '(')
                stack.push(ch);
            else if (ch.charAt(0) == ')'){
                c = stack.pop().charAt(0);
                while(c!='('){
                    str += c + " ";
                    c = stack.pop().charAt(0);
                }
            }
            else {
                if (!stack.isEmpty()){
                    if(stack.peek().charAt(0)=='(')
                        stack.push(ch);
                    else{
                        c = stack.peek().charAt(0);
                        while(getPriority(ch.charAt(0)) <= getPriority(c)){
                            str += stack.pop()+" ";
                            if(!stack.isEmpty()){
                                c = stack.peek().charAt(0);
                                if (c == '(')
                                    break;
                            }
                            else
                                break;
                        }
                        stack.push(ch);
                    }
                }
                else{
                    stack.push(ch);
                }
            
            }
        }
        
        while(!stack.isEmpty())
            str +=stack.pop()+" ";
        
        return str;
    }
    
    public static int getPriority(char a) {
        switch (a) {
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
    
    public static int postfixEvaluation(String a){
        Stack<String> stack = new Stack<>();
        int num1=0, num2=0, result=0;  
        
        for(String operate : a.split(" ")) {
            if (Character.isLetterOrDigit(operate.charAt(0))) {
                stack.push(operate);
            }
            else {
                num2 = Integer.parseInt(stack.pop());
                num1 = Integer.parseInt(stack.pop());
                result = getResult(num1, num2, operate.charAt(0)); //when ch is operator (+-*/%)
                stack.push(result+"");
            }
        }
        result = Integer.parseInt(stack.pop());
        return result;
    }     
    
    public static int getResult(int a, int b, char c) {
        switch(c) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            case '%':
                return a%b;
        }
        return 0;
    }
    
}
