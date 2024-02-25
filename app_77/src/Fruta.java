import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fruta<E> {

  private List<E> lista = new ArrayList<>();

  public Fruta(String string) {
    //TODO Auto-generated constructor stub
  }

  public Fruta(List<E> lista) {
    this.lista = lista;
  }

  public void adiciona(E elemento) {
    lista.add(elemento);
  }

  public E retira() {
    Random r = new Random(System.currentTimeMillis());
    return lista.remove(r.nextInt(lista.size()));
  }

  public boolean temItens() {
    return !lista.isEmpty();
  }
}
