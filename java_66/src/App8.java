import entities.*;
import java.util.Locale;
import java.util.Scanner;

public class App8 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite nome e notas");

    String name = sc.nextLine();
    int nota1 = sc.nextInt();
    int nota2 = sc.nextInt();
    int nota3 = sc.nextInt();

    Aluno8 aluno = new Aluno8(name, nota1, nota2, nota3);

    System.out.println("media = " + aluno.calcMedia());

    sc.close();
  }
}
