public class Endereco {

  private String rua;
  private int numero;
  private String complemento;
  private String bairro;
  private String cidade;
  private String estado;
  private int cep;

  public Endereco() {}

  public Endereco(
    String rua,
    int numero,
    String complemento,
    String bairro,
    String cidade,
    String estado,
    int cep
  ) {
    this.rua = rua;
    this.numero = numero;
    this.complemento = complemento;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
  }

  public Endereco(
    String rua,
    int numero,
    String bairro,
    String cidade,
    String estado,
    int cep
  ) {
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
  }

  public String getRua() {
    return this.rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return this.complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getBairro() {
    return this.bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return this.cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return this.estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public int getCep() {
    return this.cep;
  }

  public void setCep(int cep) {
    this.cep = cep;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " rua='" +
      getRua() +
      "'" +
      ", numero='" +
      getNumero() +
      "'" +
      ", complemento='" +
      getComplemento() +
      "'" +
      ", bairro='" +
      getBairro() +
      "'" +
      ", cidade='" +
      getCidade() +
      "'" +
      ", estado='" +
      getEstado() +
      "'" +
      ", cep='" +
      getCep() +
      "'" +
      "}"
    );
  }
}
