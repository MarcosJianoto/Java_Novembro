import java.util.Locale;
import java.util.Scanner;

public class App6 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //palíndromo
    System.out.println("Digite uma palavra e irei analisar se é um palíndromo");
    String palindromo = sc.nextLine();

    boolean vddPalindromo = false;
    for (int i = 0; i < palindromo.length(); i++) {
      if (palindromo.charAt(0) == palindromo.charAt(palindromo.length() - 1)) {
  


        
      }
    }

    if (vddPalindromo == true) {
      System.out.println("é um palindromo: " + palindromo);
    }

    sc.close();
  }
}
