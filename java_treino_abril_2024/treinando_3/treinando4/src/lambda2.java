import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class lambda2 {

  public static void main(String[] args) throws Exception {
    List<String> list = new ArrayList<>();
    list.add("João");
    list.add("Maria");
    list.add("Jorge");
    list.add("Julio");
    list.add("Jeová");

    list.removeIf(x -> x.charAt(0) == 'j' || x.charAt(0) == 'J');
    for (String x : list) {
      System.out.println(x);
    }

    list.add("João");
    list.add("Jorge");
    list.add("Julio");
    list.add("Jeová");

    System.out.println("--------------------------------------------");

    List<String> returnMan = list
      .stream()
      .filter(x -> x.charAt(0) == 'J')
      .collect(Collectors.toList());

    for (String x : returnMan) {
      System.out.println(x);
    }

    System.out.println("---------------------------");
    System.out.println("ARRAY TESTE");
    String array[] = returnMan.toArray(new String[0]);
    for (String x : array) {
      System.out.println(x);
    }
    System.out.println("---------------------------");

    String name = list
      .stream()
      .filter(x -> x.charAt(0) == 'J')
      .findFirst()
      .orElse(null);

    String name2 = list
      .stream()
      .filter(x -> x.charAt(0) == 'x')
      .findFirst()
      .orElse(null);
  }
}
