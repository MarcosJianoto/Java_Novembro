import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // matriz = arranjo bidimensional.
        // matriz é um vetor de vetores.
        // possui linhas e colunas, cada linha pode ser visto como um vetor.
        // desvantagem = tamanho fixo, dificuldade em realizar inserções e deleções. Não
        // costumamos inserir e depois deslocar colunas/ linhas.
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("main diagonal:");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int sumNegative = 0;

        System.out.print("Negative numbers = ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    sumNegative += 1;
                }
            }
        }
        System.out.println(sumNegative);

        sc.close();

    }
}
