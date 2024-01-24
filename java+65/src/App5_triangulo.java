import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class App5_triangulo {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite largura x altura do Triangle");
    int widht = sc.nextInt();
    int height = sc.nextInt();

    Triangle triangle = new Triangle(height, widht);

    System.out.println("area = " + triangle.area());
    System.out.println("perímetro = " + triangle.perimetro());

    sc.close();
  }
}
