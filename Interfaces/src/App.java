import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model_entities.CarRental;
import model_entities.Vehicle;

public class App {

  public static void main(String[] args) throws Exception {
    //Invoice //CarRental// Invoice // Vehicle

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

    System.out.println("Entre com os dados do aluguel:");
    System.out.println("Modelo do carro");
    String carModel = sc.nextLine();
    System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
    LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
    System.out.println("Retorno (dd/MM/yyyy hh:mm)");
    LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

    CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

    sc.close();
  }
}
