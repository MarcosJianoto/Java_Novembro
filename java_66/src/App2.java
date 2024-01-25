import java.util.Locale;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();

      if (n == -1) {
        break;
      }

      if (n > 0) {
        System.out.println("positivo");
      } else if (n < 0) {
        System.out.println("Negativo");
      } else {
        System.out.println("0");
      }
    }
    sc.close();
  }
}
