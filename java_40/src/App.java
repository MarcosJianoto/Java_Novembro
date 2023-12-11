import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        // hoje, dia 11/12, estudar sobre LISTAS.
        // myList, nodo, tem um ponteiro para o próximo nodo. somente o próximo. Desenho
        // básico sobre LISTA ENCADEADA.
        // List é uma interface e não classe, define apenas as especificações. a
        // Interface nao pode ser instanciada.
        // utilizamos ArrayList, LinkedList... etc..
        // Vantagem: Tamanho variável/ Facilidade para se realizar inserções e deleções.
        // Desvantagem:Acesso sequencial aos elementos

        // tamanho da lista/ inserir elemento na lista/ remover elementos/ encontrar
        // posição de elemento / filtrar lista com base em predicado/ encontrar primeira
        // ocorrência com base em predicado.

        // size()
        // add(obj), add(int, obj)
        // remove(obj), remove(int), removeIf(Predicate)
        // indexOf(obj), lastIndexOf(obj)
        // List<Integer> result = list.stream().filter(x -> x >
        // 4).collect(Collectors.toList());
        // Integer result = list.stream().filter

        List<String> list = new ArrayList<>();

        list.add("Marcos");
        list.add("Amanda");
        list.add("Alex");
        list.add("Ana");
        list.add("Mos");
        list.add("Bob");
        list.add(2, "Pedro");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println(list.size());

        System.out.println("----------------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("----------------------------");
        System.out.println(list.indexOf("Bob"));
        System.out.println(list.indexOf("jonas"));

        System.out.println("----------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("----------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

        String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse();
        System.out.println(name2);

        String name3 = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println(name3);

        

    }
}
