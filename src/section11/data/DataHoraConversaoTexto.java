package section11.data;

import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class DataHoraConversaoTexto {
    public static void main(String[] args) {


        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
        DateTimeFormatter form3 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mmX").withZone(ZoneId.systemDefault());
        DateTimeFormatter form4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter form5 = DateTimeFormatter.ISO_INSTANT;


        System.out.println("d04 = " + form1.format(d04));
        System.out.println("d04 = " + d04.format(form1));
        //os dois jeitos funcionam de forma igual


        System.out.println("d04 = "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        //assim também funciona, mais objetivo

        System.out.println("d05 = "+ d05.format(form2));
        System.out.println("d05 = "+ d05.format(form4));

        //aqui deve ser escrito desta forma, se escrever igual a linha 31 não funciona
        System.out.println("d06 = "+ form3.format(d06));
        System.out.println("d06 = "+ form5.format(d06));


    }
}
