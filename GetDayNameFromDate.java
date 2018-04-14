/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getdaynamefromdate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Abdulmalik
 */
public class GetDayNameFromDate {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Scanner input = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        System.out.println("enter date by using / such as dd/MM/yyyy and year > 1959 :");
        String dateStr = input.next();
        String daysList[] = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
        int starDay = 5;// date 01/01/1960 -> Friday
        int [] Days = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        try {
          Date date = formatter.parse(dateStr);
          calendar.setTime(date);
        } catch (ParseException e) {
          System.exit(0);
        }//end catch
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        for(int i = 1960; i < year;i++)
        {
            if(isLeapYear(i)){
                starDay = (starDay + 2)  % 7;
            }else{
                starDay = (starDay + 1)  % 7;
            }
        }
        Days[1] += (isLeapYear(year))? 1:0;
        for(int i = 0 ; i < month-1 ;i++)
        {
            for(int j = 0 ; j < Days[i] ; j++)
            {
                starDay = (starDay + 1)  % 7;
            }
        }
        
        for(int i = 1 ; i < day ; i++)
        {
            starDay = (starDay + 1)  % 7;
        }
        
        System.out.println(day+"/"+month+"/"+year+" " + daysList[starDay]);
        System.out.println("java class SimpleDateFormat : " + new SimpleDateFormat("EEEE").format(calendar.getTime());
        
    }//end main
    
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
          return false;
        } else if (year % 400 == 0) {
          return true;
        } else if (year % 100 == 0) {
          return false;
        } else {
          return true;
        }
    }
    public static int noday(int year) {
        return (isLeapYear(year))? 366:365;
    }
    
}
