import java.util.Locale;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //simulador de dados
    System.out.println("Digite 1 se quer rodar os dados: ");
    int i = sc.nextInt();
    double dado = 0;
    int dadoInt;

    if (i == 1) {
      dado = ((Math.random() * 6) + 1);
      dadoInt = (int) dado;
      System.out.println(dadoInt);
    }

    sc.close();
  }
}
