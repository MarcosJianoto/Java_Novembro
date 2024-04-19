import entitiesExercicio.Employees;
import entitiesExercicio.People;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicioList2 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("How many employees will be registered? ");
    int n = sc.nextInt();

    List<Employees> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      System.out.printf("Employee #%d id: ", i + 1);
      int id = sc.nextInt();

      while (hasId(list, id)) {
        System.out.println("ID existente, digite novamente");
        id = sc.nextInt();
      }

      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Salary: ");
      double salary = sc.nextDouble();

      Employees emp = new Employees(id, name, salary);

      list.add(emp);
    }

    System.out.println(
      "Enter the employee id that will have salary increase: "
    );
    int empIncrease = sc.nextInt();
    int pos = positionId(list, empIncrease);

    if (pos == -1) {
      System.out.println(" id não existe");
    } else {
      System.out.print("Enter the percentage: ");
      double percentage = sc.nextDouble();
      list.get(pos).increaseSalary(percentage);
    }

    System.out.println("List of employees: ");
    System.out.println();

    for (Employees x : list) {
      System.out.println(x);
    }

    sc.close();
  }

  public static int positionId(List<Employees> list, int id) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getId() == id) {
        return i;
      }
    }
    return -1;
  }

  public static boolean hasId(List<Employees> list, int id) {
    Employees emp = list
      .stream()
      .filter(x -> x.getId() == id)
      .findFirst()
      .orElse(null);
    return emp != null;
  }
}
