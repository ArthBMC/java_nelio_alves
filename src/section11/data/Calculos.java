package section11.data;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Calculos {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");


        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        //diminuir 1 semana da variável "d04"
        LocalDate nextWeekLocalDate = d04.plusWeeks(1);
        //adiciona 1 semana da variável "do4"

        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);
        LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        //ChronoUnit serve para especificar a unidade de tempo que será usada

        System.out.println("pastWeekLocalDate = "+pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = "+nextWeekLocalDate);
        System.out.println("nextWeekLocalDateTime = "+nextWeekLocalDateTime);
        System.out.println("pastWeekInstant = "+pastWeekInstant);
        System.out.println("nextWeekInstant = "+nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        //desse jeito nao funciona:
        //Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        //tem que converter para "LocalDateTime" por causa dos segundos
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0,0));

        Duration t3 = Duration.between(pastWeekInstant, d06);

        System.out.println("Duration em dias = "+t1.toDays());
        System.out.println("Duration em dias = "+t2.toDays());
        System.out.println("Duration em dias = "+t3.toDays());






    }
}
