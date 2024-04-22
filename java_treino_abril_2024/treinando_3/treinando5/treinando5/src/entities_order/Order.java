package entities_order;

import entities.OrderStatus;
import java.time.Instant;
import java.time.LocalDate;

public class Order {

  private Integer id;
  private Instant moment;
  private OrderStatus status;

  public Order() {}

  public Order(Integer id, Instant moment, OrderStatus status) {
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

  public Instant getMoment() {
    return this.moment;
  }

  public void setMoment(Instant moment) {
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
      getId() +
      "'" +
      ", moment='" +
      getMoment() +
      "'" +
      ", status='" +
      getStatus() +
      "'" +
      "}"
    );
  }
}
