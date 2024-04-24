package Workers;

import enumeracao.WorkerLevel;

public class Worker {

  private String name;
  private WorkerLevel workerLevel;
  private Double baseSalary;
  private Department department;

  public Worker() {}

  public Worker(
    String name,
    WorkerLevel workerLevel,
    Double baseSalary,
    Department department
  ) {
    this.name = name;
    this.workerLevel = workerLevel;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkerLevel getWorkerLevel() {
    return this.workerLevel;
  }

  public void setWorkerLevel(WorkerLevel workerLevel) {
    this.workerLevel = workerLevel;
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

  public void addContract(HourContract hourContract) {
    
  }
}
