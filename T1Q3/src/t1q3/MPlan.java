
package t1q3;


public class MPlan extends ISP{
    public MPlan(String planName, int mbps, int gb) {
        super(planName, mbps, gb);
    }
    
    public double getPrice(){
        double price=0;
        price = (double) ((mbps*5)+(gb*0.8));
        return price;
    }
}
