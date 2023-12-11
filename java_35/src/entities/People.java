package entities;

public class People {

    private String name;
    private double nota1;
    private double nota2;

    public People() {
    }

    public People(String name, double nota1, double nota2) {
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getName() {
        return this.name;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

}
