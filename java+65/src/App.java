import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor inteiro:");
    int digitado = sc.nextInt();
    if (digitado >= 0) {
      System.out.println("positivo");
    } else {
      System.out.println("negativo");
    }

    sc.close();
  }
}
