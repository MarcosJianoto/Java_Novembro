import java.util.Locale;
import java.util.Scanner;

public class App11 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    //soma de frações
    System.out.println("Quantos numeros? ");

    int n = sc.nextInt();
    double[] vect = new double[n];
    for (int i = 0; i < n; i++) {
      vect[i] = sc.nextInt();
    }

    double[] vect2 = new double[n];
    for (int i = 0; i < n; i++) {
      vect2[i] = sc.nextInt();
    }

    //soma das frações
    //a primeira soma no FOR, vai ser os numeros de cima,
    //a segunda soma no FOR vai ser os numeros de baixo

    double[] vect3 = new double[n];
    double result1 = 0;
    double result2 = 0;

    for (int i = 0; i < n; i++) {
      if (i == 0) {
        vect3[i] = vect[i + 1] * vect2[i + 1];
        result1 = vect3[i];
      } else if (i == 1) {
        vect3[i] = (vect[i - 1] * vect2[i]) + (vect[i] * vect2[i - 1]);
        result2 = vect3[i];
      }
    }
    System.out.println(result2 + " / " + result1);

    sc.close();
  }
}
