import java.util.Locale;
import java.util.Scanner;

public class RolaDados {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println(
      "Digite qual dado você gostaria de rolar, dentre: 4,6,8,10,12,20,100  "
    );
    int i = sc.nextInt();

    if (
      i == 4 || i == 6 || i == 8 || i == 10 || i == 12 || i == 20 || i == 100
    ) {
      System.out.println("Digite quantos dados gostaria de rolar:   ");
      int r = sc.nextInt();
      int dadoInt = 0;
      int[] arr = new int[r];

      for (int u = 0; u < r; u++) {
        double dadoTemp = ((Math.random() * i) + 1);
        dadoInt = (int) dadoTemp;
        arr[u] = dadoInt;
        System.out.println(arr[u]);
      }
    } else {
      System.out.println("Não temos esse dado");
    }

    sc.close();
  }
}
