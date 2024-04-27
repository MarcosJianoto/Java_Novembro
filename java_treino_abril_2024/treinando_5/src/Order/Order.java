package Order;

import entities.Cliente;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

  private DateTimeFormatter sdf = DateTimeFormatter.ofPattern(
    "dd/MM/yyyy HH/mm"
  );

  private LocalDateTime date;
  private OrderStatus status;
  private Cliente cliente;

  private List<OrderItem> items = new ArrayList<>();

  public Order() {}

  public Order(LocalDateTime date, OrderStatus status, Cliente cliente) {
    this.date = date;
    this.status = status;
    this.cliente = cliente;
  }

  public LocalDateTime getDate() {
    return this.date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public OrderStatus getStatus() {
    return this.status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  public Cliente getCliente() {
    return this.cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public List<OrderItem> getList() {
    return this.items;
  }

  public void addItem(OrderItem item) {
    items.add(item);
  }

  public void removeItem(OrderItem item) {
    items.remove(item);
  }

  public double total() {
    double sum = 0.0;
    for (OrderItem it : items) {
      sum += it.subTotal();
    }
    return sum;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Order moment: ");
    sb.append(sdf.format(date));
    sb.append(status + "\n");
    sb.append("Cliente: ");
    sb.append("Order items:\n");
    for (OrderItem item : items) {
      sb.append(item + "\n");
    }
    sb.append("Total price: $");
    sb.append(String.format("%.2f", total()));
    return sb.toString();
  }
}
