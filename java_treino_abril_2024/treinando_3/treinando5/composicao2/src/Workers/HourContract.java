package Workers;

import java.time.LocalDate;

public class HourContract {

  private LocalDate Date;
  private Double valuePerHour;
  private Integer hours;

  public HourContract() {}

  public HourContract(LocalDate Date, Double valuePerHour, Integer hours) {
    this.Date = Date;
    this.valuePerHour = valuePerHour;
    this.hours = hours;
  }

  public LocalDate getDate() {
    return this.Date;
  }

  public void setDate(LocalDate Date) {
    this.Date = Date;
  }

  public Double getValuePerHour() {
    return this.valuePerHour;
  }

  public void setValuePerHour(Double valuePerHour) {
    this.valuePerHour = valuePerHour;
  }

  public Integer getHours() {
    return this.hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public double totalValue() {
    return valuePerHour * hours;
  }
}
