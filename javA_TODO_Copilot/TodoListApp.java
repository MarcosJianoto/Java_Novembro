import java.util.Scanner;

public class TodoListApp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Um scanner para ler a entrada do usuário
    ListaDeTarefas lista = new ListaDeTarefas(); // Uma lista de tarefas vazia
    boolean rodando = true; // Uma variável para controlar o loop principal
    while (rodando) {
      System.out.println("Escolha uma opção:");
      System.out.println("0. Sair do programa");
      System.out.println("1. Mostrar a lista de tarefas");
      System.out.println("2. Adicionar uma tarefa à lista");
      System.out.println("3. Remover uma tarefa da lista");
      System.out.println("4. Marcar uma tarefa como concluída");
      int opcao = scanner.nextInt(); // Lê a opção do usuário
      scanner.nextLine(); // Limpa o buffer do scanner
      switch (opcao) {
        case 0: // Opção para sair do programa
          rodando = false;
          break;
        case 1: // Opção para mostrar a lista de tarefas
          lista.mostrarLista();
          break;
        case 2: // Opção para adicionar uma tarefa à lista
          System.out.println("Digite o título da tarefa:");
          String titulo = scanner.nextLine(); // Lê o título da tarefa
          lista.adicionarTarefa(titulo); // Adiciona a tarefa à lista
          break;
        case 3: // Opção para remover uma tarefa da lista
          System.out.println("Digite o índice da tarefa a ser removida:");
          int indice = scanner.nextInt() - 1; // Lê o índice da tarefa (subtrai 1 para ajustar o índice)
          scanner.nextLine(); // Limpa o buffer do scanner
          lista.removerTarefa(indice); // Remove a tarefa da lista
          break;
        case 4: // Opção para marcar uma tarefa como concluída
          System.out.println("Digite o índice da tarefa a ser concluída:");
          indice = scanner.nextInt() - 1; // Lê o índice da tarefa (subtrai 1 para ajustar o índice)
          scanner.nextLine(); // Limpa o buffer do scanner
          lista.concluirTarefa(indice); // Marca a tarefa como concluída
          break;
        default: // Opção inválida
          System.out.println("Opção inválida. Tente novamente.");
          break;
      }
    }
    scanner.close(); // Fecha o scanner
    System.out.println("Programa encerrado.");
  }
}
