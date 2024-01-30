package entities;

public class Calculadora {

  private int a;
  private int b;

  public Calculadora() {}

  public Calculadora(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getA() {
    return this.a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return this.b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int adicao() {
    return a + b;
  }

  public int subtracao() {
    return a - b;
  }

  public int multiplicacao() {
    return a * b;
  }

  public int divisao() {
    return a / b;
  }
}
