public class forEach {

  public static void main(String[] args) throws Exception {
    String[] vect = new String[] { "Maria", "João", "Pedro" };

    double[] vectdouble = new double[] { 1.1, 2.3, 5.6, 5.6, 7.8, 10.0 };

    for (int i = 0; i < vect.length; i++) {
      System.out.println(vect[i]);
    }

    System.out.println("-----------------");

    for (String x : vect) {
      System.out.println(x);
    }

    System.out.println("-------------------");

    double soma = 0.0;
    for (Double x : vectdouble) {
      soma += x;
    }

    System.out.println(soma);
  }
}
