import java.util.Locale;
import java.util.Scanner;

public class Salario {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //salário bruto:
    double salarioBruto = 2000.00;
    double salarioLiquido = 2000.00 - salarioBruto * 0.09;
    double energia = 100.00;
    double internet = 70.00;
    double alimentacao = 28 * 22;
    double comissoes = 500;

    //Valores anuais
    double salarioLiquidoAnual = (2000.00 - (salarioBruto * 0.09)) * 12;
    double energiaAnual = 100.00 * 11;
    double internetAnual = 70.00 * 11;
    double alimentacaoAnual = 28 * 22 * 11;
    double comissoesAnual = 500;
    double ferias = 666.00;
    double decimoTerceiro = 2000;
    double extras = 1000;
    double totalAnual =
      energiaAnual +
      internetAnual +
      alimentacaoAnual +
      comissoesAnual +
      salarioLiquidoAnual +
      ferias +
      decimoTerceiro +
      extras;
    double investimentos = 200.00 * 12;

    System.out.printf(
      "Salário sem comissão: %.2f%n",
      salarioLiquido + energia + internet + alimentacao
    );
    System.out.printf(
      "Salário com comissão de 500: %.2f%n",
      salarioLiquido + energia + internet + alimentacao + comissoes
    );
    System.out.printf("Salário anual: %.2f%n", totalAnual);
    System.out.printf(
      "Salário anual com investimentos: %.2f",
      totalAnual + investimentos
    );

    //Salário + investimentos:

    sc.close();
  }
}
