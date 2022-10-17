package task2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Calendar calendar1 = new GregorianCalendar();

        calendar1.set(Calendar.DAY_OF_WEEK, 3);
        int n = calendar.get(Calendar.WEEK_OF_YEAR);
        Date date = calendar.getTime();
        Date date1 = calendar1.getTime();
        if(date.before(date1)){
            date = date1;
        }else{
            n++;
            calendar.set(Calendar.WEEK_OF_YEAR, n);
            calendar.set(Calendar.DAY_OF_WEEK, 3);
            date = calendar.getTime();
        }
        System.out.println(date);
    }
}
