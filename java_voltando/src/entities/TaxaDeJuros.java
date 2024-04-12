package entities;

public enum TaxaDeJuros {
  ADIA,
  AMES,
  ABIMESTRE,
  AANO;

  private double valor;

  public void setValor(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }
}
