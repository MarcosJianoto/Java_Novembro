import entities.*;
import entities.Worker;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Enter department's name: ");
    String departamentName = sc.nextLine();
    System.out.println("Enter worker data: ");
    System.out.println("Name: ");
    String WorkerName = sc.nextLine();
    System.out.println("Level: ");
    String WorkerLevel = sc.nextLine();
    System.out.println("Base salary: ");
    double baseSalary = sc.nextDouble();
    Worker worker = new Worker(
      WorkerName,
      WorkerLevel.valueOf(WorkerLevel),
      baseSalary,
      new Departament(departamentName)
    );

    String name = sc.nextLine();
    System.out.print("Name");
    System.out.print("Level");
    System.out.print("Base salary: ");

    System.out.println("How many contracts to this worker? ");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.printf("Enter contract #%d data: %n", i);
      System.out.println("Date: (DD/MM/YYYY)");
      Date contractDate = (Date) sdf.parse(sc.next());
      System.out.println("Value per hour: ");
      double valuePorHour = sc.nextDouble();
      System.out.println("Duration (hours)");
      int hours = sc.nextInt();
      HourContract contract = new HourContract(
        contractDate,
        valuePorHour,
        hours
      );
      worker.addContract(contract);
    }

    System.out.println();
    System.out.println("Enter month and year to calculate income (MM/YYYY): ");
    String monthAndYear = sc.next();
    int month = Integer.parseInt(monthAndYear.substring(0, 2));
    int year = Integer.parseInt(monthAndYear.substring(3));
    System.out.println("Name: " + worker.getName());
    System.out.println("Department: " + worker.getDepartment().getName());
    System.out.println(
      "Income for: " +
      monthAndYear +
      ": " +
      String.format("%.2f", worker.income(year, month))
    );

    sc.close();
  }
}
