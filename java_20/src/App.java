import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do aluno: ");
        String name = sc.nextLine();

        System.out.println("notas que ele tirou: ");
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        int nota3 = sc.nextInt();

        Aluno aluno = new Aluno(name, nota1, nota2, nota3);
        aluno.avg();

        if (aluno.avg() > 60) {
            System.out.println(aluno.avg() + "passou");
        } else {
            System.out.println("não passou");
        }

        sc.close();

    }
}
