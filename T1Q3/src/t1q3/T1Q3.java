
package t1q3;


public class T1Q3 {

    
    public static void main(String[] args) {
        int subscription =5;
        int gb = 50;
        System.out.println(subscription+"Mbps Subscription and "+gb+"GB");
        DPlan d = new DPlan("DPlan",subscription,gb);
        MPlan m = new MPlan("MPlan",subscription,gb);
        System.out.println(d.displayPlan(d.getPrice()));
        System.out.println(m.displayPlan(m.getPrice()));
        if(d.getPrice() > m.getPrice())
            System.out.println("MPlan is cheaper as compared to MPlan");
        else if(d.getPrice() < m.getPrice())
            System.out.println("DPlan is cheaper as compared to MPlan");
        else
            System.out.println("DPlan is same as MPlan");
                
        
    }
    
}
