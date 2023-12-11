import java.util.Locale;
import java.util.Scanner;
import entities.People;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados?");
        int n = sc.nextInt();

        People[] vect = new People[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: %n", i + 1);
            String name = sc.nextLine();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vect[i] = new People(name, nota1, nota2);
        }

        System.out.println();
        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < vect.length; i++) {
            if ((vect[i].getNota1() + vect[i].getNota2()) / 2 >= 6) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
