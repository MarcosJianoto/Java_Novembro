import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira nome e idade: ");
    String nome = sc.nextLine();
    int idade = sc.nextInt();
    System.out.printf("Olá, %s! Você tem %d anos.", nome, idade);

    sc.close();
  }
}
