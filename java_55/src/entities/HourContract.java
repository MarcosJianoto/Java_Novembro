package entities;

import java.sql.Date;

public class HourContract {

  private Double valuePorHour;
  private Integer hours;
  private Date date;

  public HourContract(Date contractDate, double valuePorHour2, int hours2) {}

  public HourContract(Double valuePorHour, Integer hours, Date date) {
    this.valuePorHour = valuePorHour;
    this.hours = hours;
    this.date = date;
  }

  public Double getValuePorHour() {
    return this.valuePorHour;
  }

  public void setValuePorHour(Double valuePorHour) {
    this.valuePorHour = valuePorHour;
  }

  public Integer getHours() {
    return this.hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public double totalValue() {
    return valuePorHour * hours;
  }
}
