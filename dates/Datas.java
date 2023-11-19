package nelioAlves.course.dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {

//        LOCALDATE - Representa uma Data;
//        LOCALDATETIME - Representa um Horário;
//        INSTANT  - Represena um momento (data e hora) no tempo em UTC(Tempo universal Coordenado);


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-11-25");
        LocalDateTime d05 = LocalDateTime.parse("2023-11-25T01:30:26");
        Instant d06 = Instant.parse("2023-11-19T01:30:26Z");
        Instant d07 = Instant.parse("2023-11-19T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",fmt2);

        LocalDate d10 = LocalDate.of(2023,7,20);
        LocalDateTime d11 = LocalDateTime.of(2023,7,20,1,30);

        System.out.println("Data 1 - Ano mes dia"+ d01);
        System.out.println("Data 2 - Ano mes dia segundos milisigundos "+d02);
        System.out.println("Data 3 Horario global (londres) "+d03);

        System.out.println("Data Estatica  4 "+d04);
        System.out.println("Data Estatica  5 "+d05);
        System.out.println("Data Estatica  6 "+d06);
        System.out.println("Data Estatica  com timezone global [Armazena a data relativa á data de londres ] 7 "+d07);

        System.out.println("Convertendo datas  8 "+d08);
        System.out.println("Convertendo datas  9 "+d09);
        System.out.println("Convertendo datas  10 "+d10);
        System.out.println("Convertendo datas  11 "+d11);

    }
}
