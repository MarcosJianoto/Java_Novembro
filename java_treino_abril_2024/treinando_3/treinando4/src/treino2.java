import java.util.ArrayList;
import java.util.List;

public class treino2 {

  public static void main(String[] args) throws Exception {
    List<String> list = new ArrayList<>();

    if (list.size() <= 1) {
      list.add("Mero");
      list.add("um");
      list.add("dois");
      list.add("Nayla");
    }

    list.add(3, "joao");

    list.remove("joao");

    String local = "";

    for (String x : list) {
      System.out.println(x);
      if (x.equals("dois")) {
        local = x;
      }
    }

    System.out.println("valor local  = " + local);

    System.out.println("----------------------");

    list.removeIf(x -> x.charAt(0) == 'M');

    System.out.println(list);
  }
}
