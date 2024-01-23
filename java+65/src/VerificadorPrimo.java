import java.util.Scanner;

public class VerificadorPrimo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Digite um número (ou -1 para sair): ");
      int i = sc.nextInt();

      if (i == -1) {
        System.out.println("Programa encerrado.");
        break; // Encerra o loop
      }

      if (VerificadorPrimo(i)) {
        System.out.println("É primo");
      } else {
        System.out.println("Não é primo");
      }
    }

    sc.close();
  }

  private static boolean VerificadorPrimo(int numero) {
    if (numero <= 1) {
      return false;
    }

    for (int i = 2; i <= Math.sqrt(numero); i++) {
      if (numero % i == 0) {
        return false; // Não é primo
      }
    }

    return true; // É primo
  }
}
