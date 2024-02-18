import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma frase: ");
    String frase = "Marcos Aurelio Jianoto dos Santos";
    char espaco;
    int nPalavras = 1;

    for (int i = 0; i < frase.length(); i++) {
      espaco = frase.charAt(i);
      String espacoString = Character.toString(espaco);

      if (espacoString.equals(" ")) {
        nPalavras += 1;
      }
    }

    System.out.println(nPalavras);

    sc.close();
  }
}
