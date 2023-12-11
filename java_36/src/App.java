import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas?");

        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Genero da %dª pessoa: ", i + 1);
            String gender = sc.nextLine();
            vect[i] = new Person(height, gender);
        }

        System.out.println();

        System.out.print("Menor altura = ");
        double menorAltura = 10;
        double maiorAltura = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getHeight() < menorAltura) {
                menorAltura = vect[i].getHeight();
            }
        }
        System.out.print(menorAltura);
        System.out.println();

        System.out.print("Maior altura = ");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getHeight() > maiorAltura) {
                maiorAltura = vect[i].getHeight();
            }
        }
        System.out.println(maiorAltura);

        // MEDIA DAS ALTURAS DAS MULHERES
        System.out.print("Media das alturas das mulheres = ");
        double sum = 0;
        double nMulheres = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getGender().equals("F") || vect[i].getGender().equals("f")) {
                nMulheres += 1;
                sum += vect[i].getHeight();
            }
        }
        double avgAlturaMulheres = sum / nMulheres;
        System.out.printf("%.2f%n", avgAlturaMulheres);

        System.out.print("Numero de homens = ");
        int nHomens = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getGender().equals("M") || vect[i].getGender().equals("m")) {
                nHomens += 1;
            }
        }
        System.out.printf("%d", nHomens);

        sc.close();

    }
}
