/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q1;

/**
 *
 * @author User
 */
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Mesh Topology");
        int switches1 = 4;
        int switches2 = 7;
        System.out.println("The are "+switches1+" switches in the campus.");
        System.out.println("The total number of connections required is "+MeshTopology(switches1));
        System.out.println("The are "+switches2+" switches in the campus.");
        System.out.println("The total number of connections required is "+MeshTopology(switches2));
 
    }
    
    //Formula : NC2 (n= number of device; r = 2) -->(n!)/(r!(n-r)!)
    public static int MeshTopology(int n){
        return factorial(n)/(factorial(2)*factorial((n-2)));
    }
    
    //Return factorial of specified number
    public static int factorial(int n){
        if(n==0) // base case
            return 1;
        else
            return n * factorial(n-1); //Recursive call
    }
    
}
