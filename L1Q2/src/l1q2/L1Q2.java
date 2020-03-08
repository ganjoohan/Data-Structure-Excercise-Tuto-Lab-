
package l1q2;


public class L1Q2 {

    public static void main(String[] args) {
        double [] coefficient = {4.0, 2.0, -0.5, -20.0};
        Polynomial p = new Polynomial(3, coefficient);
        System.out.print("The polynomial is "+ p + "\n");
        p.evaluate(2.0);
        p.evaluate(-3.5);
    }
    
}
