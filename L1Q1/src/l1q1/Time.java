package l1q1;

public class Time {
    protected int hour, minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    
    public boolean Check(){
        if(hour<24 && minute<60){
            return true;
        }
        return false;
    }
    
    
    public String toString(){
       if(hour<13){
           if(minute<10){
               return hour+":0"+minute+"AM";
           }
           return hour+":"+minute+"AM";
       }
       else{
           if(minute<10){
               return (hour-12)+":0"+minute+"PM";
           }
           return (hour-12)+":"+minute+"PM";
       }
    }
}
