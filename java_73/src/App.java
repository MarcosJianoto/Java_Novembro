import entities.ImportedProduct;
import entities.Product;
import entities.UseProduct;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Product> list = new ArrayList<>();

    //n produtos
    int n = sc.nextInt();

    for (int i = 1; i < n; i++) {
      System.out.println("Product #" + i + " data: ");
      System.out.print("Common, used or imported? (c/u/i)");
      int type = sc.nextInt();
      sc.nextLine();
      System.out.print("Name: ");
      String name = sc.nextLine();
      System.out.print("Price: ");
      Double price = sc.nextDouble();
      if (type == 'c') {
        list.add(new Product(name, price));
      }
      if (type == 'u') {
        System.out.println("Data de fabricação (DD/MM/YYYY)");
        LocalDate manufactureDate = LocalDate.parse(
          sc.next(),
          DateTimeFormatter.ofPattern("dd/MM/yyyy")
        );
        list.add(new UseProduct(name, price, manufactureDate));
      }
      if (type == 'i') {
        System.out.println("Taxa de importacao: ");
        double customsFee = sc.nextDouble();
        list.add(new ImportedProduct(name, price, customsFee));
      }
    }

    System.out.println("PRICE TAGS: ");
    for (Product prod : list) {
      System.out.println(prod.priceTag());
    }

    sc.close();
  }
}
