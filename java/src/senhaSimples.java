import java.util.Scanner;

public class senhaSimples {

  public static void main(String[] args) throws Exception {
    //solicitar que o usuário digite uma senha;
    //a senha terá letra e numero;
    Scanner sc = new Scanner(System.in);

    String senha = sc.nextLine();
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    boolean temNumero = false;
    boolean temLetra = false;
    for (int i = 0; i < senha.length(); i++) {
      char caractere = senha.charAt(i);
      for (int j = 0; j < array.length; j++) {
        if (caractere - '0' == array[j]) {
          temNumero = true;
          break;
        }
      }

      if (Character.isLetter(caractere)) {
        temLetra = true;
        break;
      }
    }

    if (temLetra == true && temNumero == true) {
      System.out.println("Senha concluida");
    } else {
      System.out.println("senha incorreta");
    }

    sc.close();
  }
}
