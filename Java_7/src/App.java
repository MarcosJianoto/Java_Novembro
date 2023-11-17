import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        People[] vect = new People[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %dª pessoa: ", i + 1);
            System.out.println();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.err.print("Idade: ");
            int idade = sc.nextInt();
            System.err.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new People(nome, idade, altura);
        }

        double sumAltura = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sumAltura += vect[i].getAltura();
        }

        double mediaAltura = sumAltura / vect.length;
        System.out.print("Altura média: " + mediaAltura);

        System.out.println();

        // Porcentagem menor 16 anos
        double percentage = 0.0;
        System.out.print("Pessoas com menos de 16 anos: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                percentage += i;
            }
        }
        double idadePercentage = (percentage / vect.length) * 100;
        if (percentage != 0) {
            if (percentage == vect.length) {
                System.out.println("100%");
            } else {
                System.out.println(idadePercentage + "%");
            }
        }

        // Nome menor 16 anos
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();

    }
}