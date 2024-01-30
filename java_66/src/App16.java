import java.util.Locale;
import java.util.Scanner;

public class App16 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    /*
    Calculadora de Média:
    Escreva um programa que receba uma série de números do usuário e calcule a média deles. 
    O programa deve continuar pedindo números até que o usuário insira um valor negativo.
    calculadora de media 
    */

    System.out.println(
      "Digite -1 para sair do programa ou digite um numero para calcular a média"
    );
    int sum = 0;
    int quantidade = 0;

    while (true) {
      int i = sc.nextInt();
      if (i == -1) {
        System.out.println(sum / quantidade);
        break;
      }

      if (i != -1) {
        sum += i;
        quantidade += 1;
      }
    }

    sc.close();
  }
}
