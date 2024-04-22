import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.xml.crypto.Data;

public class calculoComDataHora {

  public static void main(String[] args) throws Exception {
    List<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //data hora global, timezone -> data-hora local.
    //calculo, adicionando tempo, ou tirando.
    //------------------->Estudando<-------------------//
    //objeto é imutavel, voce cria outro objeto e altera.
    LocalDate d01 = LocalDate.parse("2021-05-03");
    LocalDate d010 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.parse("2023-05-02T02:25:20");
    Instant d03 = Instant.parse("2022-07-05T01:30:20Z");

    LocalDate d01Antes = d01.minusWeeks(1);
    System.out.println(d01);
    System.out.println(d01Antes);

    LocalDate d02antes = d01.minusMonths(3);
    System.out.println(d02antes);

    LocalDate d02depois = d01.plusDays(30);
    System.out.println(d02depois);

    LocalDateTime d03Depois = d02.minusDays(5);
    System.out.println(d03Depois);

    System.out.println(LocalDate.now());
    LocalDate now = LocalDate.now();
    Instant ludVolta = Instant.parse("2024-07-10T06:00:00-03:00");
    Instant nowInstant = Instant.now();
    Duration t01 = Duration.between(nowInstant, ludVolta);
    System.out.println(t01.toDays());

    System.out.println("---------------------------");

    Duration t02 = Duration.between(d01.atStartOfDay(), d010.atStartOfDay());
    //atStartOfDay == inicio da noite do dia.
    System.out.println("t02: " + t02.toDays());

    Duration t03 = Duration.between(ludVolta, nowInstant);

    //Duration t1 = Duration.between(nowInstant, ludVoltaNow)

    //-----------calculo entre datas------------

    sc.close();
  }
}
