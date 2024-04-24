import entities.Department;
import entities.HourContract;
import entities.Worker;
import enumeracao.WorkerLevel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.print("Enter department's name: ");
    String departmentName = sc.nextLine();

    System.out.println("Enter worker data: ");
    System.out.print("Name: ");
    String workerName = sc.nextLine();

    System.out.println("Level");
    String workerLevel = sc.nextLine();

    System.out.println("Base Salary: ");
    double baseSalary = sc.nextDouble();

    Worker worker = new Worker(
      workerName,
      WorkerLevel.valueOf(workerLevel),
      baseSalary,
      new Department(departmentName)
    );

    System.out.println("How many contracts to this worker?");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Enter contract #" + i + " data: ");
      System.out.println("LocalDate (DD/MM/YYYY)");
      String input = sc.next();
      LocalDate contractDate = LocalDate.parse(input, fmt1);
      System.out.println("Value per hour: ");
      double valuePerHour = sc.nextDouble();
      System.out.println("Duration (hours): ");
      int hours = sc.nextInt();
      HourContract contract = new HourContract(
        contractDate,
        valuePerHour,
        hours
      );

      worker.addContract(contract);
    }

    System.out.println();
    System.out.println("Enter month and year to calculate income (MM/YYYY)");
    String montAndYear = sc.next();
    int month = Integer.parseInt(montAndYear.substring(0, 2));
    int year = Integer.parseInt(montAndYear.substring(3));
    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.println(
      "Income for " +
      montAndYear +
      ": " +
      String.format("%.2f", worker.income(year, month))
    );

    sc.close();
  }
}
