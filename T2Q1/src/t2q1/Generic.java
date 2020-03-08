/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2q1;

/**
 *
 * @author User
 */
public class Generic <T> {
    private T para1, para2;

    public Generic(T para1, T para2) {
        this.para1 = para1;
        this.para2 = para2;
    }

    public T getPara1() {
        return para1;
    }

    public T getPara2() {
        return para2;
    }

    public void setPara1(T para1) {
        this.para1 = para1;
    }

    public void setPara2(T para2) {
        this.para2 = para2;
    }

    @Override
    public String toString() {
        System.out.println("The parameters value are : " + para1 + " and " + para2);
        String output = "";
        if (para1 instanceof String){
            if(para1.equals(para2))
                output += "The string is equal";
            else 
                output += "The string is not equal";
        }
        else if (para1 instanceof Integer){
            int value1 = Integer.parseInt(para1.toString());
            int value2 = Integer.parseInt(para2.toString());
            output += "The sum of the integer is " + (value1+value2);
        }
        else if (para1 instanceof Double){
            double value1 = Double.parseDouble(para1.toString());
            double value2 = Double.parseDouble(para2.toString());
            output += "The sum of the double is "+ (value1+value2);
        }
        else
            output += "Wrong parameters";
        
        return output;
    }
    
    
}
