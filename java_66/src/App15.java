import java.util.Locale;
import java.util.Scanner;

public class App15 {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int segundos = sc.nextInt();

    int horas = segundos / 3600;
    int minutos = (segundos % 3600) / 60;
    int segundosRestantes = segundos % 60;

    System.out.println(horas);
    System.out.println(minutos);
    System.out.println(segundosRestantes);

    sc.close();
  }
}
