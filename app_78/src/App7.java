import java.io.File;
import java.util.Scanner;

public class App7 {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Local File: ");
    String atrFile = sc.nextLine();

    File file = new File(atrFile);

    System.out.println(file.getParent());
    System.out.println(file.getName());
    System.out.println(file.getPath());

    sc.close();
  }
}
