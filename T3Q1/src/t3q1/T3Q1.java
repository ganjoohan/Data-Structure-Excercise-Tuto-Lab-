
package t3q1;

public class T3Q1 {

    public static void main(String[] args) {
        //a.
        int [] array = {13,56,89,43,9,123};
        int n = array.length;
        
        System.out.println("Smallest: "+FindSmallest(array, n));
        
        
        //b.
        int [] numbers = {1,2,3,4,5};
        System.out.println("Sum: " + sum(numbers, numbers.length));
        
        
        //c.
        int x = 15 , y = 60;
        System.out.println("GCD of " + x + " and " + y + " is "+GCD(x, y));
        
        
        //d.
        int decimal = 676513213;
        System.out.print("Binary of "+ decimal +": ");
        DecimalToBinary(decimal);
        System.out.println();
        
        
        //e.
        int N = 4;
        System.out.println("Sum of first "+ N + " cubes: "+ sumCubes(N));
        
        
    }
    
    
    
    
    
    
    
    //a.
    public static int FindSmallest(int[] a, int n){
        //Base case: if remaining array is length of 1, return array[0]
        if(n == 1)
            return a[0];
        else
            //Else return minimum of following.
            //a) Last Element
            //b) Value returned by recursive call first n-1 elements.
            return Math.min(a[n-1], FindSmallest(a, n-1));
    }
            
    //b. 
    public static int sum(int[]a, int n){
        if(n==0){
            return 0;
        }
        return (sum(a, n-1)+a[n-1]);
    }
    
    //c.
    public static int GCD(int x, int y){
        //base case
        if(y == 0)
            return x;
        else
            return GCD(y,x%y);
    }
    
    //d.
    public static void DecimalToBinary(int decimal){
        if(decimal>0){
            DecimalToBinary(decimal/2);
            System.out.print(decimal%2);
        }     
    }
    
    //e.
    public static int sumCubes(int n){
        //Example: Sum of first N cubes: (1^3)+(2^3)+(3^3)+(4^3)
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return n*n*n + sumCubes(n-1);
        }
    }
    
    
}
