import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        System.out.println(product.getName());

        product.setName("João");
        System.out.println(product.getName());
        sc.close();

    }
}
