import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class NelioAlves_Enumeracao {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    System.out.print("Enter department's name: ");
    String departmentName = sc.nextLine();

    System.out.println("Enter worker data: ");
    System.out.print("Name: ");
    String name = sc.nextLine();
    System.out.print("Level: ");
    String workerLevel = sc.nextLine();
    System.out.print("Base salary: ");
    double baseSalary = sc.nextDouble();
    Worker worker = new Worker(
      name,
      WorkerLevel.valueOf(workerLevel),
      baseSalary,
      new Department(departmentName)
    );

    System.out.println("How many contracts to this worker?");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Enter contract number #" + i + " data: ");
      System.out.println("Date (DD/MM/YYY):");
      LocalDate date = LocalDate.parse(sc.next(), formatter);
      System.out.print("Value per hour: ");
      double valuePerHour = sc.nextDouble();
      System.out.print("Duration(hours):  ");
      int hours = sc.nextInt();
      HourContract contract = new HourContract(date, valuePerHour, hours);
      worker.addContract(contract);
    }

    System.out.println();

    System.out.println("Enter month and year to calculate income(MM/YYYY): ");
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
