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

    System.out.println(
      "Qual o tipo de juros? 1 - Ao dia, 2 - Ao mês, 3 - Bimestral ou 4 - Anual?"
    );
    String tipoJuros = sc.nextLine();

    TaxaDeJuros qualTaxaDeJuros;

    if (tipoJuros.equals(1) || tipoJuros.equals("um")) {
      qualTaxaDeJuros = TaxaDeJuros.ADIA;
    } else if (tipoJuros.equals(2) || tipoJuros.equals("dois")) {
      qualTaxaDeJuros = TaxaDeJuros.AMES;
    } else if (tipoJuros.equals(3) || tipoJuros.equals("tres")) {
      qualTaxaDeJuros = TaxaDeJuros.ABIMESTRE;
    } else if (tipoJuros.equals(4) || tipoJuros.equals("quatro")) {
      qualTaxaDeJuros = TaxaDeJuros.AANO;
    } else {
      System.out.println("Inexistente esse tipo de juros");
    }

    System.out.println("Valor do Juros: ");
    int juros = sc.nextInt();

    System.out.println("Taxa de Juros: ");
    int taxaDeJuros = sc.nextInt();

    System.out.println("tempo: ");
    int tempo = sc.nextInt();

    System.out.println("montante: ");
    int montante = sc.nextInt();

    System.out.println();
  }
}
