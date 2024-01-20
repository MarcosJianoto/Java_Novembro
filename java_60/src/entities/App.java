package entities;

import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual planeta você quer ir?");
    String planeta = sc.nextLine().toUpperCase();
    sc.close();

    TesteEnum teste = new TesteEnum(planeta);
    teste.viajarPlaneta();
  }
}
