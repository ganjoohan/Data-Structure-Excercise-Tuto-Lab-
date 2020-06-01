
package t5q5;

public class T5Q5 {

    //https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
    /*Algorithm:

    1.Declare a character stack S.
    2.Now traverse the expression string exp.
     * If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
     * If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and 
       if the popped character is the matching starting bracket then fine else parenthesis are not balanced.
    
    After complete traversal, if there is some starting bracket left in stack then “not balanced”
    */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] str = {"(())",")()(","((())())()","(())()))","())"};
        for (int i=0;i<str.length;i++){
            if(balance(str[i]))
                System.out.println(str[i]+" is balanced");
            else
                System.out.println(str[i]+" is not balanced");
        }
    }
    
    public static boolean balance(String s){
        Stack <Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            
            if(s.charAt(i)==')'){
                
                /* If we see an ending parenthesis without  
                 a pair then return false*/
                if(stack.isEmpty()){
                    return false;
                }
                
                /* Pop the top element from stack, if  
                it is not a pair parenthesis of character  
                then there is a mismatch. This happens for  
                expressions like {(}) */
                else if(stack.pop()==')'){
                    return false;
                }
                            
            }   
        }
        
        if(stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    
    
    //Alternative solution: 
    public static boolean isBalanced(String a) { 
            Stack<Character> stack = new Stack<>(); 
            for(int i=0; i<a.length(); i++) { 
                if (a.charAt(i)=='(') 
                    stack.push(a.charAt(i)); 
                else { 
                    if (!stack.isEmpty() && stack.peek()=='(') 
                        stack.pop(); 
                    else   
                        return false; 
                } 
            }  
            if (stack.isEmpty()) 
                return true; 
            else 
                return false; 
    } 


}
