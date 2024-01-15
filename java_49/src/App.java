import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 2 valores /m/n");
    int m = sc.nextInt();
    int n = sc.nextInt();

    System.out.println("Digite os valores da MATRIZ");
    int[][] mat = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    System.out.println("Valor a ser buscado:");
    int x = sc.nextInt();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        if (x == mat[i][j]) {
          System.out.println();
          System.out.println("Position: " + i + ", " + j);
          if (j > 0) {
            System.out.println("Left: " + mat[i][j - 1]);
          }
          if (i > 0) {
            System.out.println("Top: " + mat[i - 1][j]);
          }
          if (j < mat[i].length - 1) {
            System.out.println("Right: " + mat[i][j + 1]);
          }
          if (i < mat.length - 1) {
            System.out.println("Bottom: " + mat[i + 1][j]);
          }
        }
      }
    }

    sc.close();
  }
}
