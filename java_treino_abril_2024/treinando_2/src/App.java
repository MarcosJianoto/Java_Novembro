import entities.People;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantas pessoas serão digitadas?");
    int n = sc.nextInt();

    People[] pessoa = new People[n];

    double[] vect = new double[n];
    for (int i = 0; i < vect.length; i++) {
      System.out.printf("Dados da %d ª pessoa: %n", i + 1);
      System.out.println("Nome: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.println("Idade: ");
      int idade = sc.nextInt();
      System.out.println("Altura: ");
      double altura = sc.nextDouble();
      pessoa[i] = new People(name, idade, altura);
    }

    double somaIdade = 0.0;
    double somaAltura = 0.0;
    double menor16 = 0;

    for (int i = 0; i < vect.length; i++) {
      somaIdade += pessoa[i].getIdade();
      somaAltura += pessoa[i].getAltura();
    }

    for (int i = 0; i < vect.length; i++) {
      if (pessoa[i].getIdade() < 16) {
        menor16 += 1;
      }
    }

    System.out.println("-------------------------------");

    double porcentagemIdadeMenor16 = (menor16 / n) * 100;
    double mediaAltura = somaAltura / vect.length;

    System.out.println("soma idade = " + somaIdade);
    System.out.println("media altura = " + mediaAltura);
    System.out.println(
      "Porcentagem menor de 16 = " + porcentagemIdadeMenor16 + " %"
    );

    for (int i = 0; i < n; i++) {
      System.out.println(pessoa[i]);
    }

    sc.close();
  }
}
