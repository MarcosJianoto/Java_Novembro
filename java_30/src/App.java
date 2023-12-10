import java.util.Locale;
import java.util.Scanner;

import entities.Maiores;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");

        int n = sc.nextInt();
        Maiores[] vect = new Maiores[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            double number = sc.nextDouble();
            vect[i] = new Maiores(number);
        }

        System.out.print("MAIOR VALOR = ");
        double maiorValor = 0;
        int posicaoMaiorValor = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() > maiorValor) {
                maiorValor = vect[i].getNumber();
                posicaoMaiorValor = i;
            }

        }
        System.out.println(maiorValor);

        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);

        sc.close();

    }
}
