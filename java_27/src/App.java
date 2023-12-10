import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce quer digitar?");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            sc.nextLine();
            double number = sc.nextDouble();
            vect[i] = new Product(number);

        }

        double sum = 0.0;
        
        System.out.print("VALORES= ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f  ", vect[i].getNumber());
            sum += vect[i].getNumber();
        }
        System.out.println();
        System.out.println(sum);
        
        double avg = sum/vect.length;
        System.out.println(avg);

        sc.close();

    }
}
