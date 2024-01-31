import java.util.Locale;
import java.util.Scanner;

public class CalculoJurosCompostos {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //anos para calcular
    double P = 25000.00; //investimento inicial
    double n = 10.0; // anos deixando o dinheiro investido
    double r = 10.0 / 100.0; // % de juros anual.
    double A = P * Math.pow(1.0 + r, n);
    System.out.println(A);

    sc.close();
  }
}
