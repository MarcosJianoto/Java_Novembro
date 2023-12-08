import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double PI = 3.14159;
        double circumference = 2 * PI * n;
        double area = PI * Math.pow(n, 2);
        double volume = 4 * PI * Math.pow(n, 3) / 3.0;
        System.out.println(circumference);
        System.out.println(volume);

        sc.close();

    }
}
