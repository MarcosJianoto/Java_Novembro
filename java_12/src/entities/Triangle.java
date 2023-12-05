package entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double p = (a + b + c) / 2;

    public double area(double a, double b, double c, double p) {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
