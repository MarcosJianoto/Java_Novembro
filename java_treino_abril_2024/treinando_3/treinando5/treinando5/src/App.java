import entities.OrderStatus;
import entities_order.Order;
import java.time.Instant;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    //tipo ENUM e como utilizar..
    Scanner sc = new Scanner(System.in);

    Instant d01 = Instant.now();
    Integer id = 3;

    Order order = new Order(id, d01, OrderStatus.PROCESSING);
    System.out.println(order);
    System.out.println("-------------------");

    String orderDigit = "batata";
    String orderDigitUpper = orderDigit.toUpperCase();
    System.out.println(orderDigitUpper);
    System.out.println("-------------------");

    OrderStatus os1 = OrderStatus.DELIVERED;
    OrderStatus os2 = OrderStatus.valueOf("PENDING_PAYMENT");
    OrderStatus os3 = OrderStatus.valueOf("PROCESSING");
    OrderStatus os4 = OrderStatus.valueOf("SHIPPED");

    sc.close();
  }
}
