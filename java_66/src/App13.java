import java.util.Locale;
import java.util.Scanner;

public class App13 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //Contagem de numeros pares e impares
    int n = 3;
    int[][] vect = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        vect[i][j] = sc.nextInt();
      }
    }

    System.out.print("pares: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (vect[i][j] % 2 == 0) {
          System.out.print(vect[i][j] + " ");
        }
      }
    }

    System.out.println();
    System.out.print("impares: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (vect[i][j] % 2 != 0) {
          System.out.print(vect[i][j] + " ");
        }
      }
    }

    sc.close();
  }
}
