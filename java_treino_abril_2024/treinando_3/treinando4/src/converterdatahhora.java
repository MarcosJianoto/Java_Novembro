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

public class converterdatahhora {

  public static void main(String[] args) throws Exception {
    List<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    LocalDate d01 = LocalDate.parse("2022-07-05");
    LocalDateTime d02 = LocalDateTime.parse("2022-07-20T20:20:25");
    Instant d03 = Instant.parse("2022-07-20T02:20:21Z");

    //Temos que colocar data-hora global e timezone.
    LocalDate d04 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
    LocalDate d05 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
    LocalDateTime d06 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
    LocalDateTime d07 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

    System.out.println(d04);
    System.out.println(d05);
    System.out.println(d06);
    System.out.println(d07);

    System.out.println(d04.getDayOfMonth());
    System.out.println(d04.getMonthValue());
    System.out.println(d04.getYear());

    sc.close();
  }
}
