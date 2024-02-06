import java.util.Scanner;

public class converterDecimao_para_Binario {

  public static void main(String[] args) throws Exception {
    //solicitar que o usuário digite uma senha;
    //a senha terá letra e numero;
    Scanner sc = new Scanner(System.in);

    int x = 13;
    int decimalXbinario, decimalYbinario;
    int temp = 0;

    for (int i = 0; i < 13; i++) {
      decimalXbinario = x % 2;

      temp = x / 2;
    }
    System.out.println(temp);

    sc.close();
  }
}
