/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2q3;

/**
 *
 * @author User
 */
public class maximum <N extends Comparable<N>>{
    private N a,b,c;

    public maximum(N a, N b, N c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public N getA() {
        return a;
    }

    public N getB() {
        return b;
    }

    public N getC() {
        return c;
    }

    public void setA(N a) {
        this.a = a;
    }

    public void setB(N b) {
        this.b = b;
    }

    public void setC(N c) {
        this.c = c;
    }

    
    
    @Override
    public String toString() {
        String output = "The maximum value of "+a+" "+b+" "+c+" "+" is ";
        if((a.compareTo(b)>0) && ((a.compareTo(c)>0)))
            output += a;
        else if ((b.compareTo(a)>0) && (b.compareTo(c)>0))
            output += b;
        else
            output += c;
                
        return output;
            
    }
    
    
}
