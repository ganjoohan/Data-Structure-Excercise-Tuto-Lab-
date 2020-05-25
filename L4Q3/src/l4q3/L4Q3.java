/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q3;

/**
 *
 * @author User
 */
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList <Course> list = new LinkedList<>();
        Course a = new Course("WXX101", "Programming", 5, 'B');
        Course b = new Course("WXX201", "Networking", 4, 'C');
        Course c = new Course("WXX301", "Operating System", 3, 'A');
        list.addNode(a);
        list.addNode(b);
        list.addNode(c);
        
        System.out.println("The list consist of");
        list.showList();
        
        //Total point = Credit hour * Grade
        int total = point(a)+point(b)+point(c);
        System.out.println("Total point is "+total);
        
        //Total credit = Sum of Credit hours
        int credit = a.getCredit()+b.getCredit()+c.getCredit();
        System.out.println("Total credit is "+credit);
        
        //CGPA
        double point = (double)total/credit;
        System.out.printf("Grade point average is %.2f",point);
        System.out.println();
    }
    
    public static int point(Course c){
        switch(c.getGrade()){
            case 'A': return 4*c.getCredit(); 
            case 'B': return 3*c.getCredit();
            case 'C': return 2*c.getCredit();
            case 'D': return 1*c.getCredit();
            case 'F': return 0*c.getCredit();
            default: return 0;
        }
        
    }
    
    
    
    
    
}
