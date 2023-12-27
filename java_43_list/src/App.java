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

        for (int i = 0; i < N; i++) {
            System.out.printf("Employee %d: %n", i + 1);
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        // incremento percentage e teste se existe ID
        System.out.println("Enter the employee id that will have salary increase:  ");
        int id = sc.nextInt();
        int valueId = 0;
        boolean testeId = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                valueId += i;
                testeId = true;
            }
        }
        if (testeId == true) {
            System.out.println("Enter the percentage: ");
        } else {
            System.out.println("ID don't exist");
        }
        double percentage = sc.nextDouble();

        list.get(valueId).increaseSalary(percentage);

        System.out.println("List of employees: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }

        sc.close();

    }
}
