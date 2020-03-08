/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1q3;

/**
 *
 * @author User
 */
public class test {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        System.out.println(a & b);
        
        String ip = "10.1.1.70";
        String [] octet = ip.split(".");

        for(String c: octet){
            System.out.println(c);
        }
    }
}
