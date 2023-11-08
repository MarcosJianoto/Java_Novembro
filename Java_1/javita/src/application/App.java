package application;

import java.util.Date;
import entities.Order;
import entities_enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DEVILERED;

        OrderStatus os2 = OrderStatus.valueOf("DEVILERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
