package entities;

public class Employee {

    private String name;
    private double salary;
    private int tax;
    private int incrementSalary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTax() {
        return tax;
    }

    public int getIncrementSalary() {
        return incrementSalary;
    }

    public double netSalary(double tax) {
        return salary += salary * (tax / 100);
    }

    public double incrementSalary() {
        return netSalary() + netSalary() * (incrementSalary / 100);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + netSalary(tax);
    }
}
