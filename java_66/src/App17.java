import java.util.Locale;
import java.util.Scanner;

public class App17 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String senha = sc.next();
    int contador = 0;

    while (true) {
      if (contador == 3) {
        System.out.println("3 tentativas, falhou!");
        break;
      }

      if (!senha.equals("senha123")) {
        System.out.println("Acesso negado");
        contador++;
        senha = sc.next();
        continue;
      } else if (senha.equals("senha123")) {
        System.out.println("Acesso permitido");
        break;
      }
      sc.close();
    }
  }
}
