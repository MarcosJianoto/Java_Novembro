public class Funcionario {

  private String name;
  private float salario;
  private Endereco endereco;

  public void setNome(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setSalario(float salario) {
    if (salario < 0) {
      this.salario = salario;
    } else {
      this.salario += salario;
    }
  }

  public float getSalario() {
    return this.salario;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public Endereco getEndereco() {
    return this.endereco;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " name='" +
      getName() +
      "'" +
      ", salario='" +
      getSalario() +
      "'" +
      ", endereco='" +
      getEndereco() +
      "'" +
      "}"
    );
  }
}
