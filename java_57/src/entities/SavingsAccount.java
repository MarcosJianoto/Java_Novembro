package entities;

public class SavingsAccount extends Account {

  private Double interestRate;

  public SavingsAccount() {
    super();
  }

  public SavingsAccount(
    Integer number,
    String Holder,
    Double Balance,
    Double interestRate
  ) {
    super(number, Holder, Balance);
    this.interestRate = interestRate;
  }

  public Double getInterestRate() {
    return this.interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public void updateBalance() {
    balance += balance * interestRate;
  }
}
