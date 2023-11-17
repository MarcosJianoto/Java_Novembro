import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();

    }
}
