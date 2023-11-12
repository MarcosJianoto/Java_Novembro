import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Name Product: ");
            String name = sc.nextLine();
            System.out.println("Price Product: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.printf("%.2f%n", avg);

        sc.close();

    }
}
