import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println();

        System.out.print("Product data: ");
        System.out.println(product.toString());

        System.out.println("Enter numbers of products for add: ");
        System.out.print("Updated data: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println(product.toString());

        System.out.println();

        System.out.println("Enter numbers of products for remove");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println(product.toString());

        sc.close();

    }
}
