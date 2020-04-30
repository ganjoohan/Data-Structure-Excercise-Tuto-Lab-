package l1q1;

public class L1Q1 {

    public static void main(String[] args) {
        Time a = new Time(13,45);
        Time b = new Time(33,15);
        Time c = new Time(10,52);
        
        System.out.print("Hour: "+a.hour+" Minute: "+a.minute+"  ");
        if(a.Check()){
            System.out.println(a.toString());
        }
        else
            System.out.println("Invalid time input");
        
        System.out.print("Hour: "+b.hour+" Minute: "+b.minute+" ");
        if(b.Check()){
            System.out.println(b.toString());
        }
        else
            System.out.println("Invalid time input");
        
        System.out.print("Hour: "+c.hour+" Minute: "+c.minute+" ");
        if(c.Check()){
            System.out.println(c.toString());
        }
        else
            System.out.println("Invalid time input");
        
    }
    
    
}
