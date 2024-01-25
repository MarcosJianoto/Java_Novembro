import java.util.Locale;
import java.util.Scanner;

public class App4 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //Como realizar contagem de vogais?
    System.out.println("Digite uma palavra");

    String palavra = sc.nextLine().toLowerCase();
    int consoantes = 0;
    int vogais = 0;

    for (int i = 0; i < palavra.length(); i++) {
      char letra = palavra.charAt(i);
      if (letra >= 'a' && letra <= 'z') {
        if (
          letra == 'a' ||
          letra == 'e' ||
          letra == 'i' ||
          letra == 'o' ||
          letra == 'u'
        ) {
          vogais++;
        } else {
          consoantes++;
        }
      }
    }

    System.out.println(vogais);
    System.out.println(consoantes);

    sc.close();
  }
}
