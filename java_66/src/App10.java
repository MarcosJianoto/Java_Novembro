import java.util.Locale;
import java.util.Scanner;

public class App10 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    for (int i = a; i < b; i++) {
      if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
        System.out.println("é numero primo");
        System.out.println(i);
      } else if (i == 2 || i == 5) {
        System.out.println("é numero primo");
        System.out.println(i);
      }
    }

    sc.close();
  }
}
