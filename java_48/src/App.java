import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 2 numeros inteiros: ");
    int m = sc.nextInt();
    int n = sc.nextInt();

    System.out.println("Digite os numeros da matriz");
    int[][] mat = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    System.out.println("Digite um numero inteiro para procurar na matriz");
    int number = sc.nextInt();

    //descobrir se existe numeros esquerda/cima/direita/baixo
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (number == mat[i][j]) {
          System.out.println();
          System.out.println("Position:" + i + ", " + j);
          if (j > 0) {
            System.out.println("Left " + mat[j][i - 1]);
          }
          if (j < mat[i].length - 1) {
            System.out.println("Right " + mat[i - 1][j]);
          }
          if (i > 0) {
            System.out.println("Up " + mat[j - 1][i]);
          }
          if (i < mat.length - 1) {
            System.out.println("Down " + mat[j][i + 1]);
          }
          System.out.println();
        }
      }
    }
    sc.close();
  }
}
