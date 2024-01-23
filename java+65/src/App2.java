import java.util.Locale;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 2 numeros inteiros: ");
    int one = sc.nextInt();
    int two = sc.nextInt();

    int oneXTwo = one * two;

    System.out.println(oneXTwo);

    sc.close();
  }
}
