import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();

        Person[] vect = new Person[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %dª pessoa: %n", i + 1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Person(name, idade, altura);
        }

        // média altura
        System.out.print("Altura média: ");
        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getAltura();
        }
        double avg = sum / vect.length;
        System.out.printf("%.2f%n", avg);

        // pessoas com menos de 16 anos
        double menores = 0;
        System.out.print("Pessoas com menos de 16 anos: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                menores += 1;
            }
        }

        double percentage = (menores / vect.length) * 100;
        System.out.printf("%.2f%n", percentage);

        sc.close();

    }
}
