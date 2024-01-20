import entities.BusinessAccount;

public class App {

  public static void main(String[] args) throws Exception {
    //herança = tipo de associação que permite que uma classe herde dados e comportamentos de outra// reuso e polimorfismo...
    //sintaex = class A extends B.

    BusinessAccount account = new BusinessAccount();

    account.getBalance();
  }
}
