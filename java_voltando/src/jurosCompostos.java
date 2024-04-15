import entities.*;
import java.util.Locale;
import java.util.Scanner;

public class jurosCompostos {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Dinheiro inicial: ");
    double capital = sc.nextDouble();

    System.out.println("Aporte Mensal: ");
    double aporteMensal = sc.nextDouble();

    //tipo de juros
    System.out.println(
      "Qual o tipo de juros? 1 - Ao dia, 2 - Ao mês, 3 - Bimestral ou 4 - Anual?"
    );
    String tipoJuros = sc.nextLine();

    System.out.println("Valor do Juros: ");
    double juros = sc.nextInt();

    System.out.println("Taxa de Juros: ");
    double taxaDeJuros = sc.nextInt();
    double converterTaxaJuros;

    if (tipoJuros.equals(1) || tipoJuros.equals("um")) {
      converterTaxaJuros = taxaDeJuros * 365;
    } else if (tipoJuros.equals(2) || tipoJuros.equals("dois")) {
      converterTaxaJuros = taxaDeJuros * 12;
    } else if (tipoJuros.equals(3) || tipoJuros.equals("tres")) {
      converterTaxaJuros = taxaDeJuros * 3;
    } else if (tipoJuros.equals(4) || tipoJuros.equals("quatro")) {
      converterTaxaJuros = taxaDeJuros;
    }

    System.out.println("tempo: ");
    double tempo = sc.nextInt();

    System.out.println("montante: ");
    double montante = sc.nextInt();

    FormulasJurosCompostos form = new FormulasJurosCompostos(
      capital,
      juros,
      tempo,
      montante
    );
    System.out.println(form.calcMontante(taxaDeJuros));

    System.out.println();

    System.out.println();
  }
}
