
package t1q3;


public class DPlan extends ISP {
     public DPlan(String planName, int mbps, int gb) {
        super(planName, mbps, gb);
    }
    
    public double getPrice(){
        double price=0;
        price = (double) ((mbps*10)+(gb*0.2));
        return price;
    }
}
