import java.util.Locale;
import java.util.Scanner;

public class RecursivaLinear {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 caso queira resposta do FIBONACCI e 2 caso queira NÚMEROS PRIMOS: ");
        double fibonacciPrimo = sc.nextInt();

        // fibonacci fiz de forma RECURSIVA e os primos LINEAR

        // FIBONACCI
        if (fibonacciPrimo == 1) {

            // NUMEROS FIBONACCI
            System.out.println("Digite o numero que quer em fibonacci");
            double n = sc.nextInt();
            double zero = 0;
            double oneEdois = 1;
            double result = 0;
            if (n >= 0) {
                if (n == 0) {
                    System.out.println(zero);
                } else if (n == 1 || n == 2) {
                    System.out.println(oneEdois);
                } else if (n >= 2) {
                    result = (n - 1) + (n - 2);
                    System.out.println(result);
                }

            } else {
                System.out.println("Digite novamente o numero, pois precisa ser MAIOR ou IGUAL a 0");
                n = sc.nextInt();
            }
            // NUMEROS PRIMOS
        } else if (fibonacciPrimo == 2) {

            System.out.println("Digite o numero que quer analisar se é primo: ");
            double p = sc.nextInt();
            if (p > 1) {

                if (p == 2 || p == 3) {
                    System.out.println("numeros primos");
                } else if (p % 2 != 0 && p % 3 != 0) {
                    System.out.println("numero primo: " + p);
                    for (int i = 0; i <= p; i++) {
                        if (i % 2 != 0 && i % 3 != 0) {
                            System.out.println(i);
                        }
                    }
                } else {
                    System.out.println("Não é um numero primo, digite novamente");
                    p = sc.nextInt();
                }

            } else {
                System.out.println("Digite novamente, pois precisa ser MAIOR ou IGUAL a 0");
                p = sc.nextInt();
            }

        } else {
            System.out.println("Digite novamente, 1(fibonacci) ou 2(numeros primos)");
            fibonacciPrimo = sc.nextInt();
        }

        sc.close();

    }
}
