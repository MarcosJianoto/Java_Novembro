import java.util.Locale;
import java.util.Scanner;

public class ValidadorCPF {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //array com os digitos ou uma string?
    String CPFString = "10622379941"; //no caso, os 9 primeiros digitos utilizamos pesos
    int[] CPFarray = new int[CPFString.length()];
    int[] CPFarrayPosValid = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int[] CPFarrayPosValid2 = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    for (int i = 0; i < CPFString.length(); i++) {
      CPFarray[i] = Character.getNumericValue(CPFString.charAt(i));
      System.out.println(CPFarray[i]);
    }

    System.out.println("----------------------------------");

    while (true) {
      if (CPFarray.length != 11) {
        System.out.println("Errado, digite novamente");
        CPFString = sc.nextLine();
      }

      int peso9 = 10;

      if (CPFarray.length == 11) {
        for (int i = 0; i <= CPFarray.length - 3; i++) {
          CPFarrayPosValid[i] = CPFarray[i] * peso9;
          System.out.print(" " + CPFarrayPosValid[i] + " ");
          peso9 -= 1;
        }

        int soma = 0;
        for (int i = 0; i < CPFarrayPosValid.length; i++) {
          soma += CPFarrayPosValid[i];
          System.out.println();
          System.out.println(soma);
        }

        System.out.println("Divisão por onze: ");
        int divisaoOnze = soma % 11;
        System.out.println(divisaoOnze);
        //resto = 3;

        System.out.println("Subtrair o resto por 11");
        int subtrairResto = 11 - divisaoOnze;
        //11 - 3 = 8;

        if (subtrairResto >= 10) {
          System.out.println("primeiro digito verificador = 0");
        } else {
          System.out.println("seu 1º digito verificador é: " + subtrairResto);
        }

        int[] CPFarrayDigitoVerificador = new int[] {
          0,
          0,
          0,
          0,
          0,
          0,
          0,
          0,
          0,
          0,
        };

        for (int i = 0; i < CPFarrayDigitoVerificador.length - 1; i++) {
          CPFarrayDigitoVerificador[i] = CPFarray[i];
          System.out.println(CPFarrayDigitoVerificador[i]);
        }
        for (int i = 9; i < CPFarrayDigitoVerificador.length; i++) {
          CPFarrayDigitoVerificador[i] = subtrairResto;
          System.out.println(CPFarrayDigitoVerificador[i]);
        }

        int soma2 = 0;
        int peso10 = 11;
        for (int i = 0; i <= CPFarrayDigitoVerificador.length - 1; i++) {
          CPFarrayPosValid2[i] = CPFarrayDigitoVerificador[i] * peso10;
          System.out.print(" " + CPFarrayPosValid2[i] + " ");
          peso10 -= 1;
          soma2 += CPFarrayPosValid2[i];
        }
        System.out.println(soma2);

        System.out.println("Divisão por onze: ");
        int divisaoOnze2 = soma2 % 11;
        System.out.println(divisaoOnze2);
        //resto = 2;

        System.out.println("Subtrair o resto por 11");
        int subtrairResto2 = 11 - divisaoOnze2;
        System.out.println(subtrairResto2);
        //11 - 3 = 8;

        System.out.println("seu 1º digito verificador é: " + subtrairResto);
        System.out.println("seu 2º digito verificador é: " + subtrairResto2);

        break;
      }

      sc.close();
    }
  }
}
