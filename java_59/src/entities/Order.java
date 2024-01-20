package entities;

import entities.*;

public class Order {

  private int orderID;
  private OrderStatus status;

  public Order() {}

  public Order(int orderID, OrderStatus status) {
    this.orderID = orderID;
    this.status = status;
  }

  public int getOrderID() {
    return this.orderID;
  }

  public void setOrderID(int orderID) {
    this.orderID = orderID;
  }

  public OrderStatus getStatus() {
    return this.status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " orderID='" +
      getOrderID() +
      "'" +
      ", status='" +
      getStatus() +
      "'" +
      "}"
    );
  }
}
