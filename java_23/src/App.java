import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter account number: ");
        int nConta = sc.nextInt();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.print("Is there an initial deposit? (y /" + "n)");

        Person person = new Person();

        String valueYN = sc.nextLine();

        double inicialDeposit = 0;

        if ("y".equals(valueYN)) {
            System.out.print("Digite seu deposito inicial: ");
            inicialDeposit = sc.nextDouble();
            person = new Person(nConta, name, inicialDeposit);
        } else if ("n".equals(valueYN)) {
            person = new Person(nConta, name);
        } else {
            System.out.println("Digite novamente Y ou N");
            valueYN = sc.nextLine();
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(person.toString());

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double moreDeposit = sc.nextDouble();
        person.moreDeposit(moreDeposit);
        
        System.out.println(person.toString());

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        person.withdrawMoney(withdraw);
        System.out.println("Updated account data:");
        System.out.println(person.toString());

        sc.close();

    }
}
