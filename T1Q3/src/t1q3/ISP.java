package t1q3;


public class ISP {
    
    private String planName;
    protected int mbps;
    protected int gb;

    public ISP(String planName, int mbps, int gb) {
        this.planName = planName;
        this.mbps = mbps;
        this.gb = gb;
    }
    

    public String displayPlan(double price) {
        return String.format("Plan : " + planName + "with price RM: %.1f", price);
        
    }
    
    
    
}


