import entitiesExercicio.People;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicioList {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<People> list = new ArrayList<>();

    System.out.println("how many employees will be registered? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.printf("Employee #%d%n", i + 1);

      System.out.println();
      System.out.print("Id: ");
      int id = sc.nextInt();

      int pos = position(list, id);

      while (idExist(list, id)) {
        System.out.println("id already taken! Try again: ");
        id = sc.nextInt();
      }

      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Salary: ");
      double salary = sc.nextDouble();

      People people = new People(id, name, salary);
      list.add(people);
    }

    System.out.println(
      "Enter the employee id that will have salary increase: "
    );

    int idSalary = sc.nextInt();

    People po = list
      .stream()
      .filter(x -> x.getId() == idSalary)
      .findFirst()
      .orElse(null);

    // int pos = position(list, idSalary);

    if (po == null) {
      System.out.println("this id not exist");
    } else {
      System.out.println("Enter the percentage: ");
      double percent = sc.nextDouble();
      po.inscreaseSalary(percent);
    }

    System.out.println();
    System.out.println("List of  employees: ");

    for (People x : list) {
      System.out.println(x);
    }

    sc.close();
  }

  public static int position(List<People> list, int id) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getId() == id) {
        return i;
      }
    }
    return -1;
  }

  public static boolean idExist(List<People> list, int id) {
    People peo = list
      .stream()
      .filter(x -> x.getId() == id)
      .findFirst()
      .orElse(null);
    return peo != null;
  }
}
