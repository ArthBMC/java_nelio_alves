package section11.data;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        int minutes = cal.get(Calendar.MINUTE);
        int months = cal.get(Calendar.MONTH);
        //para o calendar, os meses se iniciam no "0" igual a um array, ou seja, Janeiro é zero e assim por diante
        int months2 = 1 + cal.get(Calendar.MONTH);
        //aqui seria ele corrigido


        System.out.println(sdf.format(d));
        System.out.println("Minutes: "+ minutes);
        System.out.println("Months: "+ months);
        System.out.println("Months2: "+ months2);
    }
}