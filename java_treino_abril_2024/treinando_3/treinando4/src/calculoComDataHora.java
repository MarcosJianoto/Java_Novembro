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

public class calculoComDataHora {

  public static void main(String[] args) throws Exception {
    List<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //data hora global, timezone -> data-hora local.
    //calculo, adicionando tempo, ou tirando.
    //------------------->Estudando<-------------------//
    //objeto é imutavel, voce cria outro objeto e altera.
    LocalDate d01 = LocalDate.parse("2021-05-03");
    LocalDateTime d02 = LocalDateTime.parse("2023-05-02T02:25:20");
    Instant d03 = Instant.parse("2022-07-05T01:30:20Z");

    LocalDate d01Antes = d01.minusWeeks(1);
    System.out.println(d01);
    System.out.println(d01Antes);

    LocalDate d02antes = d01.minusMonths(3);
    System.out.println(d02antes);

    LocalDate d02depois = d01.plusDays(30);
    System.out.println(d02depois);


    sc.close();
  }
}
