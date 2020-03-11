
package t3q2;

public class T3Q2 {

    //Ackermann Function
    
    public static void main(String[] args) {
        System.out.println(Acker(3, 4));        
        System.out.println(Acker(2, 5));
    }
    
    public static int Acker(int m, int n){
        if(m==0){
            return n+1;
        }
        else if (n==0){
            return Acker(m-1, 1);
        }
        else{
            return Acker(m-1, Acker(m, n-1));
        }
            
    }
    
}
