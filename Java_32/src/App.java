import java.util.Locale;
import java.util.Scanner;
import entities.Numbers;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        Numbers[] vect = new Numbers[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();
            vect[i] = new Numbers(number);
        }

        System.out.println("MEDIA DO VETOR: ");
        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getNumber();
        }
        double avg = sum / vect.length;
        System.out.println(avg);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getNumber() < avg){
                System.out.println(vect[i].getNumber());
            }
        }

        sc.close();

    }
}
