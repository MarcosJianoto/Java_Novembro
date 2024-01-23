import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App4 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    while (true) {
      System.out.println("Digite um numero entre 1 e 2");
      int j = sc.nextInt();
      sc.nextLine();

      int numeroAleatorio = random.nextInt(2) + 1;
      System.out.println(numeroAleatorio);

      if (j == numeroAleatorio) {
        System.out.println("Conseguiu!");
        System.out.println("Gostaria de tentar novamente?");
        String tentarNovamente = sc.nextLine();
        if (tentarNovamente.equals("n")) {
          break;
        } else {
          continue;
        }
      } else {
        System.out.println("Não conseguiu");
      }
    }
  }
}
