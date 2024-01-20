import entities.*;

public class App {

  public static void main(String[] args) throws Exception {
    Order order = new Order(5, OrderStatus.CIDADE);
    System.out.println(order);

    OrderStatus os1 = OrderStatus.BAIRRO;
    OrderStatus os2 = OrderStatus.valueOf("BAIRRO");

    System.out.println(os1);
    System.out.println(os2);
  }
}
