package entities;

public class Aluno {

    private String name;
    private int nota1;
    private int nota2;
    private int nota3;

    public Aluno() {
    }

    public Aluno(String aluno, int nota1, int nota2, int nota3) {
        this.name = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getAluno() {
        return this.name;
    }

    public void setAluno(String aluno) {
        this.name = aluno;
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

    public double avg() {
        return this.nota1 + this.nota2 + this.nota3 / 3;
    }

}
