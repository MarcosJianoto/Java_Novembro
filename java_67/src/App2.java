import java.util.Locale;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //calculadora com menu
    System.out.println(
      "você gostaria de realizar qual tipo de operação? adição, subtração, multiplicação ou divisão? escreva qual, ou digite 1,2,3 ou 4, respectivamente. "
    );
    String operacao = sc.nextLine();
    double calc;
    double n1 = 0;
    double n2 = 0;
    //quantos números? eu limito? ou não? acho que vou começar com 2 numeros.
    while (true) {
      System.out.println();
      if (operacao.equals("adição") || operacao.equals("1")) {
        System.out.println("Digite os dois valores a ser calculado; ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        calc = n1 + n2;
        System.out.println("Adição: " + calc);
      } else if (operacao.equals("subtração") || operacao.equals("2")) {
        System.out.println("Digite os dois valores a ser calculado; ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        calc = n1 - n2;
        System.out.println("Adição: " + calc);
      } else if (operacao.equals("multiplicação") || operacao.equals("3")) {
        System.out.println("Digite os dois valores a ser calculado; ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        calc = n1 * n2;
        System.out.println("Adição: " + calc);
      } else if (operacao.equals("divisão") || operacao.equals("4")) {
        System.out.println("Digite os dois valores a ser calculado; ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        calc = n1 / n2;
        System.out.println("Adição: " + calc);
      } else {
        System.out.println(
          "não temos esse tipo de calculo, digite novamente: "
        );
        operacao = sc.nextLine();
        continue;
      }
      break;
    }
    sc.close();
  }
}
