package entities;

public class Person {

    private int nConta;
    private String name;
    private double inicialDeposit;

    public Person() {
    }

    public Person(int nConta, String name, double inicialDeposit) {
        this.nConta = nConta;
        this.name = name;
        this.inicialDeposit = inicialDeposit;
    }

    public Person(int nConta, String name) {
        this.nConta = nConta;
        this.name = name;
        this.inicialDeposit = inicialDeposit;
    }

    public int getNConta() {
        return this.nConta;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInicialDeposit() {
        return this.inicialDeposit;
    }

    public void setInicialDeposit(double inicialDeposit) {
        this.inicialDeposit = inicialDeposit;
    }

    public void moreDeposit(double moreDeposit) {
        this.inicialDeposit += moreDeposit;
    }

    public void withdrawMoney(double withdrawMoney) {
        this.inicialDeposit -= withdrawMoney;
    }

    public String toString() {
        return "Account: "
                + nConta
                + ", Holder: "
                + name
                + ", Balance: "
                + "$ "
                + inicialDeposit;
    }

}
