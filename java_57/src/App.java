import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {

  public static void main(String[] args) throws Exception {
    Account acc = new Account(101, "Alex", 0.0);
    BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

    //UPCASTING

    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "null", 0.0, 300.0);
    Account acc3 = new SavingsAccount(500, "Ana", 0.0, 0.01);

    //DOWNCASTING

    BusinessAccount acc4 = (BusinessAccount) acc2;
    // BusinessAccount acc5 = (BusinessAccount) acc3;

    if (acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount) acc3;
      acc5.getLoanLimit(200.0);
    }
  }
}
