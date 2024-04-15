import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class lambda {

  public static void main(String[] args) throws Exception {
    List<String> list = new ArrayList<>();
    list.add("joão");
    list.add("Maria");
    list.add("pedro");
    list.add("Guilherme");

    for (String x : list) {
      System.out.println(x);
    }

    System.out.println("----------------------------");
    list.removeIf(x -> x.charAt(0) == 'M');

    for (String x : list) {
      System.out.println(x);
    }

    System.out.println("----------------------------");
    System.out.println("Index of joao:" + list.indexOf("joão"));
    System.out.println("Index of guilherme:" + list.indexOf("Guilherme"));

    System.out.println(list.indexOf(list));
    //deixar na lista somente quem tem M...args

    System.out.println("----------------------------");

    List<String> filter = list
      .stream()
      .filter(x -> x.charAt(0) == 'j')
      .collect(Collectors.toList());

    for (String x : filter) {
      System.out.println(x);
    }
  }
}
