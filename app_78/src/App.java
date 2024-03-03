import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    //com a classe Scanner conseguimos utilizar FILE também... para ler um arquivo e seu caminho.
    //Scanner / IOException..
    //

    File file = new File("D:\\Biblioteca\\Downloads\\in.txt");
    Scanner sc = null;
    try {
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }
}
