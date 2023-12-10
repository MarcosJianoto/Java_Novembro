import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        Product[] vect = new Product[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero:");
            int number = sc.nextInt();
            vect[i] = new Product(number);
        }

        // numeros negativos
        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() < 0) {
                System.out.println(vect[i].getNumber());
            }
        }

        sc.close();

    }
}
