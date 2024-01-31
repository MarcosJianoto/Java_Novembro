import java.util.Locale;
import java.util.Scanner;

public class ContagemVogaisEConsoantes {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String palavra = sc.nextLine();
    String palavraToUpper = palavra.toLowerCase();
    char temp;

    System.out.println("Vogal: ");
    for (int i = 0; i < palavraToUpper.length(); i++) {
      temp = palavraToUpper.charAt(i);
      if (
        temp == 'a' ||
        temp == 'e' ||
        temp == 'i' ||
        temp == 'o' ||
        temp == 'u' ||
        temp == 'y'
      ) {
        System.out.print(temp + " ");
      }
    }

    System.out.println();

    System.out.println("Consoantes: ");
    for (int i = 0; i < palavraToUpper.length(); i++) {
      temp = palavraToUpper.charAt(i);

      if (
        temp != 'a' &&
        temp != 'e' &&
        temp != 'i' &&
        temp != 'o' &&
        temp != 'u' &&
        temp != 'y'
      ) {
        System.out.println(temp);
      }
    }

    sc.close();
  }
}
