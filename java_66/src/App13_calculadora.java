import entities.*;
import java.util.Locale;
import java.util.Scanner;

public class App13_calculadora {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //calculadora simples, adição/subtração/multiplicação e divisão.
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    Calculadora calc = new Calculadora(a, b);
    System.out.println(calc.adicao());
    System.out.println(calc.subtracao());
    System.out.println(calc.divisao());
    System.out.println(calc.multiplicacao());

    sc.close();
  }
}
