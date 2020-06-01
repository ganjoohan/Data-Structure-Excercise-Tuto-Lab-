
package t5q4;

public class T5Q4 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Fib(1);
        Fib(5);
        Fib(8);
        Fib(14);
    }
    
    public static void Fib(int N){
        Stack <Integer> s = new Stack<>();
        
        int num1 = 1;
        int num2 = 1;
        s.push(num1);
        s.push(num2);
        int sum = 1;
        
        for(int i=2;i<N;i++){
            int second = s.pop();
            sum = second+s.pop();
            s.push(second);
            s.push(sum);
        }
        System.out.println("Fib("+N+"): "+sum);
    }
    
    
}
