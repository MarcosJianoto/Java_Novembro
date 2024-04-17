package entitiesExercicio;

public class People {

  private int id;
  private String name;
  private double salary;

  public People() {}

  public People(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return this.id;
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

  public void inscreaseSalary(double percentage) {
    salary += salary * percentage / 100;
  }

  @Override
  public String toString() {
    return (getId() + ", " + getName() + ", " + getSalary());
  }
}
