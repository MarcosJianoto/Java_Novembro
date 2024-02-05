import java.util.Locale;
import java.util.Scanner;

public class calculoMediaDesvioPadrao {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    double a, b, c, d;
    a = 2;
    b = 4;
    c = 6;
    d = 8;
    double media = (a + b + c + d) / 4;
    double resultA;
    double resultB;
    double resultC;
    double resultD;

    if (a > media) {
      resultA = a - media;
    } else {
      resultA = media - a;
    }

    if (b > media) {
      resultB = b - media;
    } else {
      resultB = media - b;
    }

    if (c > media) {
      resultC = c - media;
    } else {
      resultC = media - c;
    }

    if (d > media) {
      resultD = d - media;
    } else {
      resultD = media - d;
    }

    double elevarQuadradoA, elevarQuadradoB, elevarQuadradoC, elevarQuadradoD;
    elevarQuadradoA = Math.pow(resultA, 2);
    elevarQuadradoB = Math.pow(resultB, 2);
    elevarQuadradoC = Math.pow(resultC, 2);
    elevarQuadradoD = Math.pow(resultD, 2);

    double somaQuadrados =
      (elevarQuadradoA + elevarQuadradoB + elevarQuadradoC + elevarQuadradoD) /
      4;

    double raizMedia = Math.sqrt(somaQuadrados);
    System.out.println(raizMedia);

    sc.close();
  }
}
