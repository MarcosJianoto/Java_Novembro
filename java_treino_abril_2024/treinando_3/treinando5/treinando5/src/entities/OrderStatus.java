package entities;

public enum OrderStatus {
  PENDING_PAYMENT(0),
  PROCESSING(1),
  SHIPPED(3),
  DELIVERED(4);

  private int code;

  private OrderStatus(int code) {
    this.code = code;
  }

  private final int getCode() {
    return this.code;
  }
}
