/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l3q4;

/**
 *
 * @author User
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Calender
        System.out.print("Today Date (dd/mm/yyyy): ");
        String todayDate = sc.next();
        Calendar c = Calendar.getInstance();
        c.setTime(new SimpleDateFormat("dd/M/yyyy").parse(todayDate));
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String todayDay = getDay(dayOfWeek);
        System.out.println("Today is on "+todayDay);
        
        System.out.print("Search Date (dd/mm/yyyy): ");
        String searchDate = sc.next();
        SearchDay(todayDate, searchDate, 0 , dayOfWeek);
        
        
    }
    public static void SearchDay(String todayDate, String searchDate, int daylapse , int todayDay){
      
        String [] date = todayDate.split("/"); 
        int day=Integer.valueOf(date[0]); 
        int month=Integer.valueOf(date[1]); 
        int year=Integer.valueOf(date[2]); 

        daylapse++;        
        day--; 

        if(day==0){ 
            day=31;  // For month 1,3,5,7,8,10
            month--; 
            if(month==2){ 
                if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) // if is a leap year, then Feb will be 29 days
                    day=29; 
                else 
                    day=28;  // normal Feb 
            } 

            if(month == 4|| month==6||month==9||month==11){ 
                day=30; 
            } 

            if(month==0){ 
                year--; 
                month=12;  // check finish month, then go previous year
            } 
        } 

        String newdate= day+"/"+month+"/"+year; 

        if(newdate.equals(searchDate)){ 
            int dayback = daylapse%7;
            int sDay = todayDay - dayback;
            if(sDay <= 0){
                sDay = 7 - Math.abs(sDay);
            }
            System.out.println("Search Date is on "+getDay(sDay));

        }else{ 

            SearchDay(newdate,searchDate,daylapse,todayDay);    

        }
        
        
    }
    
    private static String getDay(int value){
    String day = "";
    switch(value){
        case 1:
            day="Sunday";
            break;
        case 2:
            day="Monday";
            break;
        case 3:
            day="Tuesday";
            break;
        case 4:
            day="Wednesday";
            break;
        case 5:
            day="Thursday";
            break;
        case 6:
            day="Friday";
            break;
        case 7:
            day="Saturday";
            break;
    }
    return day;

    }
    
}
