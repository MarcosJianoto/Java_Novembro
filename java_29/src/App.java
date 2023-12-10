import java.util.Locale;
import java.util.Scanner;

import entities.Numbers;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        Numbers[] vect = new Numbers[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            vect[i] = new Numbers(number);
        }

        System.out.println("NUMEROS PARES: ");
        int numbersPares = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() % 2 == 0) {
                System.out.printf("%d  ", vect[i].getNumber());
                numbersPares += 1;
            }
        }

        System.out.println();

        System.out.println("QUANTIDADE DE PARES =  " + numbersPares);

        sc.close();

    }
}
