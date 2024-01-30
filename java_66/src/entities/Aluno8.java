package entities;

public class Aluno8 {

  private String nome;
  private int nota1;
  private int nota2;
  private int nota3;

  public Aluno8() {}

  public Aluno8(String nome, int nota1, int nota2, int nota3) {
    this.nome = nome;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getNota1() {
    return this.nota1;
  }

  public void setNota1(int nota1) {
    this.nota1 = nota1;
  }

  public int getNota2() {
    return this.nota2;
  }

  public void setNota2(int nota2) {
    this.nota2 = nota2;
  }

  public int getNota3() {
    return this.nota3;
  }

  public void setNota3(int nota3) {
    this.nota3 = nota3;
  }

  public int calcMedia() {
    return (nota1 + nota2 + nota3) / 3;
  }
}
