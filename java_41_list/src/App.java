import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> nomes = new ArrayList<>();
        nomes.add("William");
        nomes.add("Marcos");
        nomes.remove(1);

        for (String obj : nomes) {
            System.out.println(obj);
        }

        System.out.println("------------");

        nomes.add("null");
        int nomesSize = nomes.size();
        for (int i = 0; i < nomesSize; i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("------------");
    }
}
