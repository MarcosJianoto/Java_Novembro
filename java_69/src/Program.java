import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);

    List<Account> list = new ArrayList<>();

    list.add(new SavingsAccount(1001, "null", 1500.00, 0.02));
    list.add(new BusinessAccount(1002, "Marcos", 1200.00, 1000.00));
    list.add(new SavingsAccount(1001, "João", 150.00, 0.05));
    list.add(new BusinessAccount(1005, "Pedro", 1200.00, 1500.00));

    double sum = 0.0;
    for (Account acc : list) {
      sum += acc.getBalance();
    }

    System.out.println(sum);

    for (Account acc : list) {
      acc.deposit(500.00);
    }

    System.out.println("Updated balance: ");
    for (Account acc : list) {
      System.out.println(acc.getBalance());
    }
  }
}
