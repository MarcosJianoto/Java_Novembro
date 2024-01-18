import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    LocalDate d04 = LocalDate.parse("2022-06-22");
    LocalDateTime d05 = LocalDateTime.parse("2022-06-22T01:30:26");
    Instant d06 = Instant.parse("2022-06-22T01:20:25Z");

    LocalDate pastWeekLocalDate = d04.minusDays(5);
    System.out.println(pastWeekLocalDate);

    LocalDate nextWeekLocalDate = d04.plusMonths(3);
    Instant nextDayLocalDate = d06.plusSeconds(5);

    System.out.println(nextDayLocalDate);

    LocalDateTime nextDayLocalDateTime = d05.plusHours(3);
    System.out.println(nextDayLocalDateTime);

    LocalDateTime pastWeek = d05.plusMonths(5);
    System.out.println(pastWeek);

    LocalDateTime future = d05.plusSeconds(3);
    LocalDateTime fafafa = d05.minusYears(5);

    System.out.println(fafafa);

    Instant pastWeekInstant = d06.minus(5, ChronoUnit.DAYS);
    Instant minusWeekInstant = d06.minus(5, ChronoUnit.HOURS);
    System.out.println(pastWeekInstant);
    System.out.println(minusWeekInstant);

    Duration t1 = Duration.between(pastWeekInstant, minusWeekInstant);
    System.out.println(t1.toDays());

    Duration t2 = Duration.between(d06, d05);
    System.out.println(t2.toHours());

    Duration t3 = Duration.between(
      d04.atStartOfDay(),
      nextWeekLocalDate.atStartOfDay()
    );
    System.out.println(t3.toDays());

    Duration t4 = Duration.between(pastWeekInstant, d06);
    System.out.println(t4);
    
    sc.close();
  }
}
