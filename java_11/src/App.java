import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enther the measures of triangle X");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Enther the measures of triangle Y");
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        double p2 = (d + e + f) / 2;
        double area2 = Math.sqrt(p2 * (p2 - d) * (p2 - e) * (p2 - f));

        System.out.printf("Triangle X area: %.4f%n", area);
        System.out.printf("Triangle Y area: %.4f%n", area2);

        if (area > area2) {
            System.out.println("Largear area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();

    }
}
