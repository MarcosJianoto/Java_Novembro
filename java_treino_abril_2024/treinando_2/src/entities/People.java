package entities;

public class People {

  String name;
  int idade;
  double altura;

  public People() {}

  public People(String name, int idade, double altura) {
    this.name = name;
    this.idade = idade;
    this.altura = altura;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " name='" +
      getName() +
      "'" +
      ", idade='" +
      getIdade() +
      "'" +
      ", altura='" +
      getAltura() +
      "'" +
      "}"
    );
  }
}
