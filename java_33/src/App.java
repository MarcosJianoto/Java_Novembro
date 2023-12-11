import java.util.Scanner;
import java.util.Locale;
import entities.Pares;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        Pares[] vect = new Pares[n];
        String paresSim = "NENHUM NUMERO PAR";

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            vect[i] = new Pares(number);
            if (vect[i].getNumber() % 2 == 0) {
                paresSim = "MEDIA DOS PARES = ";
            }
        }

        System.out.print(paresSim);
        int sum = 0;
        int nPares = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() % 2 == 0) {
                sum += vect[i].getNumber();
                nPares += 1;
            }
        }

        int avg = 0;

        if (sum > 0 && nPares > 0) {
            avg = sum / nPares;

        }
        System.out.println(avg);

        sc.close();

    }
}
