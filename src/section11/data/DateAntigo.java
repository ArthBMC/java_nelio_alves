package section11.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateAntigo {
    public static void main(String[] args) throws ParseException {

        //throws ParseException permite o parse de data

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));


        Date y1 = sdf1.parse("23/04/2006");
        Date y2 = sdf2.parse("23/04/2006 12:50:23");
        Date x1 = new Date(); //cria uma data atual com o formato padrao
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(1000L*60L*60L*5L);//adicionando 5 horas a data do "Date"

        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));



        System.out.println("y1 (padrao)= "+y1); //formato padrao "mon apr 23 00:00:00 BRT 2006"
        System.out.println("Y1 (formatado)= "+sdf1.format(y1)); //formato personalizado "23/04/2006"

        System.out.println("y2 (padrao)= "+y2);
        System.out.println("y2 (formatado)= "+sdf2.format(y2));

        System.out.println("x1 = "+x1);
        System.out.println("x1 (formatado)= "+sdf2.format(x1));

        System.out.println("x2 = "+x2);
        System.out.println("x3 = "+x3);

        System.out.println("y3 (formatado)= "+sdf2.format(y3));System.out.println("y1 (padrao)= "+y1); //formato padrao "mon apr 23 00:00:00 BRT 2006"
        System.out.println("---------------------------------------");
        System.out.println("Y1 (formatado)= "+sdf3.format(y1)); //formato personalizado "23/04/2006"

        System.out.println("y2 (padrao)= "+y2);
        System.out.println("y2 (formatado)= "+sdf3.format(y2));

        System.out.println("x1 = "+x1);
        System.out.println("x1 (formatado)= "+sdf3.format(x1));

        System.out.println("x2 = "+x2);
        System.out.println("x3 = "+x3);

        System.out.println("y3 (formatado)= "+sdf3.format(y3));
    }
}
