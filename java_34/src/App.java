import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();

        People[] vect = new People[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %dª pessoa: %n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            vect[i] = new People(name, age);
        }

        System.out.print("PESSOA MAIS VELHA: ");
        int moreAge = 0;
        String nameMoreAge = " ";
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() > moreAge) {
                moreAge = vect[i].getAge();
                nameMoreAge = vect[i].getName();
            }
        }

        System.out.println(nameMoreAge);

        sc.close();

    }
}
