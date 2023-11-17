import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números voce vai digitar?");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.print("VALORES: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f   ", vetor[i]);
        }

        System.out.println();

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vetor[i];
        }
        System.out.printf("SOMA: %.2f%n", sum);

        double avg = sum / vetor.length;
        System.out.printf("MEDIA: %.2f%n", avg);

        sc.close();
    }
}
