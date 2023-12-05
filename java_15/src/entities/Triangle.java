package entities;

public class Triangle {

    private double largura;
    private double altura;

    public Triangle(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return (largura * 2) + (altura * 2);
    }

    public double diagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }

}
