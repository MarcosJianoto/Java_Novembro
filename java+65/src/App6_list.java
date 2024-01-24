import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App6_list {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int[] numeros = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

    int menorValor = 10;
    int maiorValor = 0;
    for (int s : numeros) {
      if (menorValor > s) {
        menorValor = s;
      }
      if (maiorValor < s) {
        maiorValor = s;
      }
    }

    System.out.println(menorValor);
    System.out.println(maiorValor);

    sc.close();
  }
}
