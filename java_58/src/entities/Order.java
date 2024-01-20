package entities;

import entities.*;
import java.time.LocalDateTime;

public class Order {

  private Integer id;
  private LocalDateTime moment;
  private OrderStatus status;

  public Order() {}

  public Order(Integer id, LocalDateTime moment, OrderStatus status) {
    this.id = id;
    this.moment = moment;
    this.status = status;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDateTime getMoment() {
    return this.moment;
  }

  public void setMoment(LocalDateTime moment) {
    this.moment = moment;
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
      " id='" +
      id +
      "'" +
      ", moment='" +
      moment +
      "'" +
      ", status='" +
      status +
      "'" +
      "}"
    );
  }
}
