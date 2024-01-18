import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {

  public static void main(String[] args) throws Exception {
    //Instant segue horário de LONDRES

    LocalDate d04 = LocalDate.parse("2022-07-20");
    LocalDateTime d05 = LocalDateTime.parse("2022-07-20T20:10:10");
    Instant d06 = Instant.parse("2022-05-30T01:10:30Z");

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter
      .ofPattern("dd/MM/yyyy HH:mm")
      .withZone(ZoneId.systemDefault());
    DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
    DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

    System.out.println(d04.format(fmt1));
    System.out.println(fmt1.format(d04));
    System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    System.out.println(d05.format(fmt2));
    System.out.println(fmt2.format(d05));

    System.out.println(d05.format(fmt1));
    System.out.println(d05.format(fmt2));

    System.out.println(fmt3.format(d06));
    System.out.println(d05.format(fmt4));
    System.out.println(fmt5.format(d06));

    System.out.println(d06.toString());
  }
}
