package entitiesExercicio;

public class Employees {

  private int id;
  private String name;
  private double salary;

  public Employees() {}

  public Employees(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public double increaseSalary(double percentage) {
    return salary += salary * percentage / 100;
  }

  @Override
  public String toString() {
    return id + ", " + name + ", " + String.format("%.2f%n", salary);
  }
}
