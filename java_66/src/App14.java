import java.util.Locale;
import java.util.Scanner;

public class App14 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor em horas: ");
    int i = sc.nextInt();
    System.out.println("seu valor em minutos é: " + i * 60);
    System.out.println("seu valor em segundos é: " + i * 60 * 60);

    System.out.println("Digite quantos segundos: ");
    int segundos = sc.nextInt();
    System.out.println("seu valor em minutos é : " + (segundos / 60));
    System.out.println("seu valor em hora é : " + ((segundos / 60) / 60));

    sc.close();
  }
}
