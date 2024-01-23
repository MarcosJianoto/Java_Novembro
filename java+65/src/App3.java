import java.util.Locale;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int dois = 2;
    int tres = 3;
    int cinco = 5;

    int i = sc.nextInt();

    if (i == dois || i == tres || i == cinco) {
      System.out.println("é primo");
    }

    if (
      (
        (i % dois == 0 && i != 2) ||
        (i % tres == 0 && i != 3) ||
        (i % cinco == 0 && i != 5)
      )
    ) {
      System.out.println("Não é primo");
    }

    if (i % dois != 0 && i % tres != 0 && i % 5 != 0) {
      System.out.println("é primo");
    }

    sc.close();
  }
}
