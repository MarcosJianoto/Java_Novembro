package pacote_principal;

import entities.Order;
import entities.OrderStatus;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {

  public static void main(String[] args) throws Exception {
    LocalDate local = LocalDate.now();

    Order order = new Order(100, LocalDateTime.now(), OrderStatus.DELIVERED);
    System.out.println(order);

    OrderStatus os1 = OrderStatus.DELIVERED;
    OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

    System.out.println(os1);
    System.out.println(os2);
  }
}
