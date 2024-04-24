package entities;

import enumeracao.WorkerLevel;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

  private String name;
  private WorkerLevel worker;
  private Double baseSalary;

  private Department department;
  //Composição tem muitos, não incluímos o cara no construtor...
  private List<HourContract> contracts = new ArrayList<>();

  public Worker() {}

  public Worker(
    String name,
    WorkerLevel worker,
    Double baseSalary,
    Department department
  ) {
    this.name = name;
    this.worker = worker;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getWorker() {
    return this.worker;
  }

  public void setWorker(WorkerLevel worker) {
    this.worker = worker;
  }

  public Double getBaseSalary() {
    return this.baseSalary;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public Department getDepartment() {
    return this.department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public List<HourContract> getContracts() {
    return this.contracts;
  }

  public void addContract(HourContract contract) {
    contracts.add(contract);
  }

  public void removeContract(HourContract contract) {
    contracts.remove(contract);
  }

  public double income(int year, int month) {
    double sum = baseSalary;
    for (HourContract c : contracts) {
      LocalDate contractDate = c.getDate();

      int c_year = contractDate.getYear();
      int c_month = contractDate.getMonthValue();

      if (c_year == year && c_month == month) {
        sum += c.totalValue();
      }
    }
    return sum;
  }
}
