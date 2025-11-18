package section11.data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //cria um formato customizado
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html


        String t = "2022-07-20T01:30:26";
        LocalDate d01 = LocalDate.now();//criando a variavel para armazenar a data
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); //fuso horario de Londres

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse( t);
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        //é possível passar a expressão "DateTimeFormatter" como argumento também

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);


        System.out.println("do01: "+d01); //aqui o "toString()" está implícito
        System.out.println("do02: "+d02.toString());
        System.out.println("do03: "+d03);
        System.out.println("do04: "+d04);
        System.out.println("do05: "+d05);
        System.out.println("do06: "+d06);
        System.out.println("do07: "+d07);
        System.out.println("do08: "+d08);
        System.out.println("do09: "+d09);
        System.out.println("do10: "+d10);
        System.out.println("do11: "+d11);




    }
}
