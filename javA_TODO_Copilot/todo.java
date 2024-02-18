import java.util.ArrayList;

// Uma classe para representar uma tarefa com um título e um status
class Tarefa {

  private String titulo;
  private boolean concluida;

  // Construtor da classe Tarefa
  public Tarefa(String titulo) {
    this.titulo = titulo;
    this.concluida = false;
  }

  // Método para obter o título da tarefa
  public String getTitulo() {
    return this.titulo;
  }

  // Método para marcar a tarefa como concluída
  public void concluir() {
    this.concluida = true;
  }

  // Método para verificar se a tarefa está concluída
  public boolean isConcluida() {
    return this.concluida;
  }

  // Método para retornar uma representação textual da tarefa
  public String toString() {
    return (this.concluida ? "[X] " : "[ ] ") + this.titulo;
  }
}

// Uma classe para representar uma lista de tarefas com um ArrayList de Tarefa
class ListaDeTarefas {

  private ArrayList<Tarefa> tarefas;

  // Construtor da classe ListaDeTarefas
  public ListaDeTarefas() {
    this.tarefas = new ArrayList<Tarefa>();
  }

  // Método para adicionar uma nova tarefa à lista
  public void adicionarTarefa(String titulo) {
    Tarefa tarefa = new Tarefa(titulo);
    this.tarefas.add(tarefa);
  }

  // Método para remover uma tarefa da lista pelo índice
  public void removerTarefa(int indice) {
    if (indice >= 0 && indice < this.tarefas.size()) {
      this.tarefas.remove(indice);
    } else {
      System.out.println("Índice inválido.");
    }
  }

  // Método para marcar uma tarefa como concluída pelo índice
  public void concluirTarefa(int indice) {
    if (indice >= 0 && indice < this.tarefas.size()) {
      Tarefa tarefa = this.tarefas.get(indice);
      tarefa.concluir();
    } else {
      System.out.println("Índice inválido.");
    }
  }

  // Método para mostrar a lista de tarefas na tela
  public void mostrarLista() {
    System.out.println("Lista de Tarefas:");
    for (int i = 0; i < this.tarefas.size(); i++) {
      Tarefa tarefa = this.tarefas.get(i);
      System.out.println((i + 1) + ". " + tarefa);
    }
  }
}
// Uma classe principal para testar o código
