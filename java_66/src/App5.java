import java.util.Locale;
import java.util.Scanner;

public class App5 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //calcular o fatorial de um numero não negativo

    int fatorial = 1;
    for (int i = 1; i < 20; i++) {
      fatorial *= i;
      System.out.println(fatorial);
    }

    sc.close();
  }
}
