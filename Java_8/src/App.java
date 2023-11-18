import java.util.Locale;
import java.util.Scanner;

import entities.Project;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar?");
        int n = sc.nextInt();

        Project[] vect = new Project[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            vect[i] = new Project(number);
        }
        System.out.println();

        int soma = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() % 2 == 0) {
                System.out.printf("%d ", vect[i].getNumber());
                soma += 1;
            }
        }
        System.out.println();

        System.out.println("QUANTIDADE DE PARES = " + soma);

        sc.close();
    }
}
