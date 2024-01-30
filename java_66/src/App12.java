import java.util.Locale;
import java.util.Scanner;

public class App12 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //contagem de palavras:
    int nDigitado = 123; //3 numeros
    String nDigitadoText = nDigitado + "";
    int numeroReverso = 0;

    for (int i = nDigitadoText.length() - 1; i >= 0; i--) {
      int digito = Character.getNumericValue(nDigitadoText.charAt(i));

      numeroReverso = numeroReverso * 10 + digito;
    }

    System.out.println(numeroReverso);

    sc.close();
  }
}
