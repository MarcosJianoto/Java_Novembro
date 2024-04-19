import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import javax.xml.crypto.Data;

public class datahoradoi {

  public static void main(String[] args) throws Exception {
    List<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    LocalDate d01 = LocalDate.parse("2002-07-20");
    LocalDateTime d02 = LocalDateTime.parse("2002-07-20T03:50:35");
    Instant d03 = Instant.parse("2022-07-30T03:40:30-03:00");

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter
      .ofPattern("dd/MM/yyy HH:mm")
      .withZone(ZoneId.systemDefault());
    DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
    DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

    System.out.println(d01.format(fmt1));
    System.out.println(fmt1.format(d01));
    System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    System.out.println("com hora" + d02.format(fmt1));
    System.out.println("sem hora" + d02.format(fmt2));

    System.out.println("instant: " + fmt3.format(d03));
    System.out.println(d02.format(fmt4));
    System.out.println(fmt5.format(d03));
    System.out.println(d03.toString());

    

    sc.close();
  }
}
