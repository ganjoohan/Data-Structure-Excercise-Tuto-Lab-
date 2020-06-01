
package t5q2;


public class T5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Stack Implementation using Array");
        ArrayStack<Character> a = new ArrayStack<>();
        System.out.println("Insert three nodes into the stack");
        a.push('A');
        a.push('N');
        a.push('D');
        a.showStack();
        System.out.println("\nPop one node from the stack");
        System.out.println("Pop "+a.pop());
        a.showStack();
        System.out.println("\nThe element on the top of the stack is "+a.peek());
        a.showStack();
        System.out.println("\nThe number of elements in the stack is "+a.getSize());
    }
    
}
