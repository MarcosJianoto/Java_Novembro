import java.util.Locale;
import java.util.Scanner;

public class App7 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String palavra = sc.nextLine().toLowerCase();

    int i = 0;
    int j = palavra.length() - 1;

    while (i < j) {
      if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1)) {
        System.out.println("Não é um palindromo");
        break;
      } else {
        i++;
        j--;
      }
    }

    sc.close();
  }
}
