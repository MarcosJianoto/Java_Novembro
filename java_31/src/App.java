import java.util.Locale;
import java.util.Scanner;

import entities.Vetores;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();

        Vetores[] vect1 = new Vetores[n];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vect1.length; i++) {
            sc.nextLine();
            int number = sc.nextInt();
            vect1[i] = new Vetores(number);
        }

        Vetores[] vect2 = new Vetores[n];
        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vect2.length; i++) {
            sc.nextLine();
            int number = sc.nextInt();
            vect2[i] = new Vetores(number);
        }

        System.out.println("VETOR RESULTANTE: ");
        int sumVector = 0;
        for (int i = 0; i < vect1.length && i < vect2.length; i++) {
            sumVector = vect1[i].getNumber() + vect2[i].getNumber();
            System.out.println(sumVector);
        }

        sc.close();

    }
}
