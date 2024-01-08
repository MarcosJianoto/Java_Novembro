import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho de sua matriz");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("main diagonal");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.println(mat[i][j]);
                }

            }
        }

        System.out.print("negative numbers = ");
        int sum = 0;
        boolean teste = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    System.out.print(mat[i][j] + " ");
                    sum += 1;
                    teste = false;
                }
            }
        }

        if (teste == true) {
            System.out.print(" nothing");
        }

        System.out.println();
        System.out.println("Quantidade numeros negativos = " + sum);

        sc.close();

    }
}
