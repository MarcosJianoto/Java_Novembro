package entities;

import java.time.LocalDateTime;

public class CarRental {

  private LocalDateTime start;
  private LocalDateTime finish;

  public CarRental() {}

  public CarRental(LocalDateTime start, LocalDateTime finish) {
    this.start = start;
    this.finish = finish;
  }

  public LocalDateTime getStart() {
    return this.start;
  }

  public void setStart(LocalDateTime start) {
    this.start = start;
  }

  public LocalDateTime getFinish() {
    return this.finish;
  }

  public void setFinish(LocalDateTime finish) {
    this.finish = finish;
  }
}
