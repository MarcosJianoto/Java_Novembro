package Order;

import entities.Cliente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

  private LocalDate date;
  private OrderStatus status;
  private Cliente cliente;

  List<OrderItem> list = new ArrayList<>();

  public Order() {}

  public Order(LocalDate date, OrderStatus status, Cliente cliente) {
    this.date = date;
    this.status = status;
    this.cliente = cliente;
  }

  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
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
    return this.list;
  }

  public void addItem(OrderItem item) {
    list.add(item);
  }

  public void removeItem(OrderItem item) {
    list.remove(item);
  }
}
