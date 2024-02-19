package entities;

import java.time.LocalDate;

public class UseProduct extends Product {

  private LocalDate manufactureDate;

  public UseProduct() {}

  public UseProduct(String name, Double price, LocalDate manufactureDate) {
    super(name, price);
    this.manufactureDate = manufactureDate;
  }

  public LocalDate getManufactureDate() {
    return this.manufactureDate;
  }

  public void setManufactureDate(LocalDate manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  @Override
  public String priceTag() {
    return (
      getName() +
      "(used) $" +
      getPrice() +
      "(Manufacture date: )" +
      manufactureDate
    );
  }
}
