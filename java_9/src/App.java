import java.util.Locale;
import java.util.Scanner;
import entities.Position;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        Position[] vect = new Position[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            double number = sc.nextDouble();
            vect[i] = new Position(number);
        }

        double higherNumber = 0.0;
        int higherValue = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() > higherNumber) {
                higherNumber = vect[i].getNumber();
                higherValue = i;
            }
        }
        System.out.println("MAIOR VALOR = " + higherNumber);
        System.out.println("POSICAO DO MAIOR VALOR = " + higherValue);

        sc.close();

    }
}
