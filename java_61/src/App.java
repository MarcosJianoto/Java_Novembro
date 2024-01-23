import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    //o primeiro a digitar será X
    //O segundo O

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //Escolha de Cara ou Coroa
    System.out.println(
      "Escolha Cara ou Coroa, [jogador 1 = X] - [jogador 2 = O]"
    );
    String escolhaMoeda = sc.nextLine();

    double moeda = Math.random() * 10 + 1;
    System.out.println("-----------");
    String caiuMoeda;
    if (moeda <= 5 && escolhaMoeda == "Cara") {
      sc.nextLine();
      System.out.println("Deu Cara");
      caiuMoeda = "Cara";
    } else {
      System.out.println("Deu Coroa");
      caiuMoeda = "Coroa";
    }
    System.out.println("-----------");

    //jogador que será o Inicial
    int jogadorInicial;
    if (caiuMoeda == "Cara") {
      System.out.println(
        "Jogador 1 começa, digite a posição que gostaria, você será: X"
      );
      jogadorInicial = 1;
    } else {
      System.out.println(
        "Jogador 2 começa, digite a posição que gostaria, você será: O"
      );
      jogadorInicial = 2;
    }
    System.out.println(
      "----------------------------------------------------------------"
    );
    System.out.println();

    //Matriz 3x3 pré-definida para o jogo da velha
    String[][] matriz = { { "1", "2", "3", "4", "5", "6", "7", "8", "9" } };
    //Inicio do programa

    int nDigitado = sc.nextInt();
    String nDigitadoString = String.valueOf(nDigitado);
    String o = "O";
    String x = "X";

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        if (nDigitadoString.equals(matriz[i][j]) && jogadorInicial == 1) {
          matriz[i][j] = x;
        }
        if (nDigitadoString.equals(matriz[i][j]) && jogadorInicial == 2) {
          matriz[i][j] = o;
        }
      }
    }

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.print(matriz[i][j] + " ");

        if ((j + 1) % 3 == 0) {
          System.out.println();
        }
      }
    }

    

    sc.close();
  }
}
