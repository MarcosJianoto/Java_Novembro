import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number of shapes: ");
    int number = sc.nextInt();

    List<Shape> list = new ArrayList<>();

    for (int i = 1; i < number; i++) {
      System.out.print("Shape #" + i + " data:");
      System.out.println("Regtangle or Circle (r/c)?");
      char ch = sc.next().charAt(0);
      System.out.print("Color (BLACK/BLUE/RED) :");
      Color color = Color.valueOf(sc.next());

      if (ch == 'r') {
        System.out.println("width: ");
        double width = sc.nextDouble();
        System.out.println("height: ");
        double height = sc.nextDouble();
        list.add(new Rectangle(width, height, color));
      } else {
        double radius = sc.nextDouble();
        list.add(new Circle(radius, color));
      }
    }

    sc.close();
  }
}
