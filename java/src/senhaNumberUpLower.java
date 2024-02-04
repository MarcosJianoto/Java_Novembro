import java.util.Scanner;

public class senhaNumberUpLower {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    //senha contendo letra maiscula, minuscula e numero
    System.out.println("Digite sua senha");
    String senha = sc.nextLine();
    int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    boolean temLetraMinuscula = false;
    boolean temLetraMaiuscula = false;
    boolean temNumero = false;

    for (int i = 0; i < senha.length(); i++) {
      char caractere = senha.charAt(i);
      for (int j = 0; j < array.length; j++) {
        if (Character.isUpperCase(caractere)) {
          temLetraMaiuscula = true;
        }
        if (Character.isLowerCase(caractere)) {
          temLetraMinuscula = true;
        }
        if (Character.isDigit(caractere)) {
          temNumero = true;
        }
      }
    }
    if (
      temLetraMaiuscula == true &&
      temLetraMinuscula == true &&
      temNumero == true
    ) {
      System.out.println("senha completa");
    } else {
      System.out.println("senha incompleta");
    }

    sc.close();
  }
}
