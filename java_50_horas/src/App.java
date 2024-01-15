import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //2022-10-30T20:30:20-03:00
    //Sempre horario GMT, que é de LONDRES, por isso o nosso é GMT-3, pois é 3 horas a menos do que LONDRES.
    //temos que saber instancias uma data. instanciar um a partir do momento AGORA.
    //Texto ISO 8601 -> Data-hora
    //texto formato customizado -> Data-hora
    //dia, mês, ano, [horário] -> Data-hora local

    //formatação
    //data-hora -> texto ISO 8601
    //data-hora 1, data-hora 2 -> Duração
    //temos que informar a data-hora-local e também a timezone.
    //aprender os cálculos com data-hora....
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now(); // data hora global com o GMT, seguindo Londres

    LocalDate d04 = LocalDate.parse("2022-07-20");
    LocalDateTime d05 = LocalDateTime.parse("2022-07-30T10:30:30"); // formato ISO 8601
    Instant d06 = Instant.parse("2022-06-20T10:30:20Z");
    Instant d07 = Instant.parse("2023-06-20T10:20:30-03:00");

    LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
    LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:33", fmt2);

    LocalDate d10 = LocalDate.of(2002, 7, 20);
    LocalDateTime d11 = LocalDateTime.of(2022,  7, 30, 12, 30, 20);

    System.out.println(d09.toString());
    System.out.println(d11.toString());

    sc.close();
  }
}
