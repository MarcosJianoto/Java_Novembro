import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        Triangle triangle = new Triangle(altura, largura);

        System.out.println("Enter rectangle width and height: ");

        triangle.area();

        System.out.println(triangle.area());
        System.out.println(triangle.perimetro());
        System.out.println(triangle.diagonal());

        sc.close();

    }
}
