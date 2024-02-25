
public class App {

  public static void main(String[] args) throws Exception {
    Cesta<Fruta> frutas = new Cesta<>();
    frutas.adiciona(new Fruta("Maçã"));
    frutas.adiciona(new Fruta("Banana"));
    frutas.adiciona(new Fruta("Mamão"));

    frutas.adiciona("Açaí");

    while (frutas.temItens()) {
      System.out.println(frutas.retira());
    }
  }
}
