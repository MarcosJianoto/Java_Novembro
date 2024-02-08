import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {

  public static void main(String[] args) throws Exception {
    Account acc1 = new Account(1, "Marcos", 1000.00);
    acc1.withdraw(200.0);
    System.out.println(acc1.getBalance());

    Account acc2 = new SavingsAccount(2, "null", 1000.00, 0.02);
    acc2.withdraw(200);
    System.out.println(acc2.getBalance());

    //palavra super, entender pra que serve.
    Account acc3 = new BusinessAccount(3, "bob", 1000.00, 500.00);
    acc3.withdraw(200.00);
    System.out.println(acc3.getBalance());
  }
}
