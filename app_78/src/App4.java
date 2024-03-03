import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App4 {

  public static void main(String[] args) throws Exception {
    String[] lines = new String[] {
      "Good Morning",
      "Good Afternooon",
      "Good Night",
    };

    String path = "D:\\Biblioteca\\Downloads\\out.txt";

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
