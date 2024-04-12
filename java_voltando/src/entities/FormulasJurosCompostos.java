package entities;

public class FormulasJurosCompostos {

  private double capital;
  private double juros;
  private double tempo;
  private double montante;

  public FormulasJurosCompostos(
    double capital,
    double juros,
    double tempo,
    double montante
  ) {
    this.capital = capital;
    this.juros = juros;
    this.tempo = tempo;
    this.montante = montante;
  }

  public double getCapital() {
    return this.capital;
  }

  public void setCapital(double capital) {
    this.capital = capital;
  }

  public double getJuros() {
    return this.juros;
  }

  public void setJuros(double juros) {
    this.juros = juros;
  }

  public double getTempo() {
    return this.tempo;
  }

  public void setTempo(double tempo) {
    this.tempo = tempo;
  }

  public double getMontante() {
    return this.montante;
  }

  public void setMontante(double montante) {
    this.montante = montante;
  }
}
