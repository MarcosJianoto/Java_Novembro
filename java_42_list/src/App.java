import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();
        int size = 0;

        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.printf("Employee #%d%n", i + 1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        boolean temId = false;
        for (int i = 0; i < N; i++) {
            if (list.get(i).getId() == idSalary) {
                temId = true;
            }
        }

        if (temId == false) {
            System.out.println("This id does not exist!");
        }

        System.out.println("Enter the percentage: ");

        double percentage = sc.nextDouble();
        for (int i = 0; i < N; i++) {
            if (list.get(i).getId() == idSalary) {
                list.get(i).increaseSalary(percentage);
            }
        }

        System.out.println();

        System.out.println("List of employees: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }
}
