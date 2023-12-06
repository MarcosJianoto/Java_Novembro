import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        System.out.println("Digite a tax: ");
        int tax = sc.nextInt();
        Employee employee = new Employee(name, salary);

        System.out.println(employee.toString());

        System.out.println("Which percentage to increase salary? ");
        int incrementSalary = sc.nextInt();

        sc.close();

    }
}
