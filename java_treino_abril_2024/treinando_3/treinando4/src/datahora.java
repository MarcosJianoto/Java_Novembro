import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.xml.crypto.Data;

public class datahora {

  public static void main(String[] args) throws Exception {
    List<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //PADRÃO ISO 8601, 2022-07-21 / 2022-07-21T:52:09.4073
    //data-hora global:
    //fração de segundos
    //existe o tracinho, horario diferente do GMT, -03:00,
    //o GMT é LONDRES <------
    //texto ISO 8601, Data-hora.
    //CALCULO COM DATA HORA, é difícil, mas preciso aprender.
    //como isntanciar data em java.

    //LocalDate / LocalDateTime
    //Instant
    //Duration
    //ZoneId / ChronoUnit

    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now(); // puxa horário Z - Zulu Time / Horário de Londres
    Instant d07 = Instant.parse("2023-10-24T20:20:20Z");
    Instant d08 = Instant.parse("2024-10-24T20:20:20-03:00");

    LocalDate d04 = LocalDate.parse("2022-07-20");
    LocalDateTime d05 = LocalDateTime.parse("2022-07-20T02:10:20");
    DateTimeFormatter d06 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    LocalDate d09 = LocalDate.parse("22/07/2022", fmt1);
    LocalDateTime d10 = LocalDateTime.parse("22/05/2022 01:30", fmt2);

    LocalDate d11 = LocalDate.of(2022, 03, 30);
    LocalDateTime d12 = LocalDateTime.of(2002, 03, 30, 20, 35, 35);

    System.out.println("d01: " + d01);
    System.out.println("d02: " + d02);
    System.out.println("d03: " + d03);
    System.out.println("d04: " + d04);
    System.out.println("d05: " + d05);
    System.out.println(d02.format(d06));
    System.out.println(d07);
    System.out.println(d08);
    System.out.println(d09);
    System.out.println(d10);
    System.out.println(d11);
    System.out.println(d12);

    sc.close();
  }
}
