import java.util.Locale;
import java.util.Scanner;
import entities.Vetores;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        Vetores[] vectA = new Vetores[n];
        Vetores[] vectB = new Vetores[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vectA.length; i++) {
            int value = sc.nextInt();
            vectA[i] = new Vetores(value);
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vectB.length; i++) {
            int value = sc.nextInt();
            vectB[i] = new Vetores(value);
        }

        // soma dos vetores
        int soma = 0;
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            System.out.println(soma = vectA[i].getValue() + vectB[i].getValue());
        }

        sc.close();
    }
}
