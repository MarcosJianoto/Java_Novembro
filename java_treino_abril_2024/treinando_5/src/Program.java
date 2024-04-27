import Order.Order;
import Order.OrderItem;
import Order.OrderStatus;
import entities.Cliente;
import entities.Product;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) throws Exception {
    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter cliente data: ");
    System.out.println("Name: ");
    String name = sc.nextLine();
    System.out.println("Email: ");
    String email = sc.next();
    System.out.println("Birth date (DD/MM/YYYY): ");
    String brithDateString = sc.next();
    LocalDate birthDate = LocalDate.parse(brithDateString, sdf);

    Cliente cliente = new Cliente(name, email, birthDate);

    System.out.println("Enter order data: ");
    System.out.print("Status: ");
    OrderStatus status = OrderStatus.valueOf(sc.next());

    Order order = new Order(LocalDateTime.now(), status, cliente);
    System.out.println("How many items to this order? ");
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      System.out.printf("Enter #%d item data: ", i + 1);
      System.out.print("Product name: ");
      String productName = sc.nextLine();
      System.out.print("Product price: ");
      double productPrice = sc.nextDouble();
      System.out.print("Quantity: ");
      int productQuantity = sc.nextInt();

      Product product = new Product(productName, productPrice);
      OrderItem id = new OrderItem(productQuantity, productPrice, product);
      order.addItem(id);
    }

    System.out.println(order);
  }
}
