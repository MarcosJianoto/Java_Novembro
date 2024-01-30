import entities.*;
import java.util.Locale;
import java.util.Scanner;

public class App9 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a temperatura em CELCIUS");
    //Conversão de temperatura
    double C = sc.nextDouble(); //celcius
    double F = (C * 9 / 5) + 32;
    System.out.println("temperatura em Fahrenheit = " + F);

    sc.close();
  }
}
