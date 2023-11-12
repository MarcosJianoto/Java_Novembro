package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entities_enums.WorkerLevel;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departments department;
    private List<HourContract> contratcs = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departments department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return this.level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departments getDepartment() {
        return this.department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public List<HourContract> getContratcs() {
        return this.contratcs;
    }

    public void addContracts(HourContract contract) {
        contratcs.add(contract);
    }

    public void removeContract(HourContract contract) {
        contratcs.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contratcs) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

}
