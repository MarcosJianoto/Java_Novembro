import java.util.Locale;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double pesoA = 2;
    double pesoB = 3;
    double pesoC = 5;
    double pesoTotal = pesoA + pesoB + pesoC;

    System.out.println("Digite suas notas: ");
    double notaA = sc.nextInt();
    double notaB = sc.nextInt();
    double notaC = sc.nextInt();

    System.out.println("suas médias ponderadas são: ");
    double calc =
      ((notaA * pesoA) + (notaB * pesoB) + (notaC * pesoC)) / pesoTotal;

    System.out.println(calc);

    sc.close();
  }
}
