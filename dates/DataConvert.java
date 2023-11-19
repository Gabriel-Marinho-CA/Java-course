package nelioAlves.course.dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataConvert {

    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2023-11-19");
        LocalDateTime d02 = LocalDateTime.parse("2023-11-19T01:30:00");
        Instant d03 = Instant.parse("2023-11-19T01:30:00Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("D01 - " + d01.format(fmt1));
        System.out.println("D02 - " + d02.format(fmt2));
        System.out.println("D02 - " + d02.format(fmt4));
        System.out.println("D03 - " + fmt3.format(d03));
        System.out.println("D03 - " + fmt5.format(d03));

        System.out.println("\n================================\n");
        // Converter data-hora global para local ( precisamos informar o timezone);

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03,  ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03,  ZoneId.of("Portugal"));

        System.out.println("r1 = "+r1);
        System.out.println("r2 = "+r2);
        System.out.println("r3 = "+r3);
        System.out.println("r4 = "+r4);

        System.out.println("\n================================\n");

        System.out.println("d01 - dia = "+ d01.getDayOfMonth());
        System.out.println("d01 - mes = "+ d01.getMonthValue());
        System.out.println("d01 - ano = "+ d01.getYear());
        System.out.println("d02 - hora = "+ d02.getHour());
        System.out.println("d02 - minute = "+ d02.getMinute());

    }
}
