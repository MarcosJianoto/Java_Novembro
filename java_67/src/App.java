import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int soma = 1;

    String frase = " Marcos perola atlantica   ";
    for (int i = 1; i < frase.length() - 1; i++) {
      char caractereAtual = frase.charAt(i);
      char caractereAnterior = frase.charAt(i - 1);
      char caracterePosterior = frase.charAt(i + 1);

      if (Character.isWhitespace(caractereAtual)) {
        if (
          Character.isLetter(caractereAnterior) &&
          Character.isLetter(caracterePosterior)
        ) {
          soma++;
        }
      }
    }

    System.out.println("tem " + soma + " palavras");

    sc.close();
  }
}
