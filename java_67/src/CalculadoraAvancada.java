import java.util.Locale;
import java.util.Scanner;

public class CalculadoraAvancada {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Quantos números voce quer calcular?");
    int n = sc.nextInt();
    double[] array = new double[n];

    System.out.println("Digite o que você gostaria de realizar:");
    System.out.println(
      "1 = potenciação | 2 = raiz quadrada | 3 = seno | 4 = cosseno | 5 = tangente"
    );
    String operacao = sc.nextLine();

    for (int i = 0; i < array.length; i++) {
      array[i] = sc.nextDouble();
    }

    //calculo
    double calc = 0;

    for (int i = 0; i < array.length; i++) {
      if (operacao.equals("1")) {
        //numeros elevados
        calc = Math.pow(array[i], Math.pow(array[i], array[i]));
        System.out.println(calc);
        break;
      } else if (operacao.equals("2")) {
        //raiz quadrada
        calc = Math.sqrt(array[i]);
        System.out.println(calc);
        break;
      } else if (operacao.equals("3")) {
        //seno

      } else if (operacao.equals("4")) {
        calc = Math.pow(array[i], Math.pow(array[i], array[i]));
        System.out.println(calc);
        break;
      }
    }

    sc.close();
  }
}
