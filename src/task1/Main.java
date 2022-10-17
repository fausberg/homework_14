package task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MMMM : " + strDate);
    }
}