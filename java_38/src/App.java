import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        int x = 20;
        Object obj = x;

        System.out.println(obj);
        int y = (int) obj;
        System.out.println(y);

    }
}
