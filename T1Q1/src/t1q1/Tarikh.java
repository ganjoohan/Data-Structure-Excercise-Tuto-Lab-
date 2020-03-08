package t1q1;

public class Tarikh {
    private int day,month,year;
    
    public Tarikh(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String str = "";
        if(day>=10){
            str = day + "/";
        }
        else 
            str = "0" + day + "/";
        
        if(month>=10){
            str += month + "/" + year;
        }
        else 
            str += "0" + month + "/" + year;
                
        return str;
    }
    
    public static void main(String[] args) {
        int d = 5, m=11, y=2016;
        Tarikh a = new Tarikh(d,m,y);
        System.out.println("Day: "+d+" Month: "+m+" Year: "+y);
        System.out.println("Date is: "+ a.toString());
    }
    
    
}
