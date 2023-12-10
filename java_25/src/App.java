import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite quantos produtos precisa: ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("digite o nome do produto e depois o preço: ");
            String name = sc.nextLine();
            Double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum/vect.length;
        System.out.printf("AVERAGE PRICE: %.2f%n", avg);

        sc.close();

    }
}
