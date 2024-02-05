import java.util.Scanner;

public class jogoAdivinhacao {

  public static void main(String[] args) throws Exception {
    //solicitar que o usuário digite uma senha;
    //a senha terá letra e numero;
    Scanner sc = new Scanner(System.in);

    //gerei um numero aleatório de 1 a 100;
    double numberRandom = Math.random() * 100;
    int numberRandomInt = (int) numberRandom + 1;
    System.out.println(numberRandomInt);

    System.out.println("Tente adivinhar o numero escolhido pelo computador: ");
    int numberFind = sc.nextInt();

    while (true) {
      if (numberFind == numberRandomInt) {
        System.out.println(
          "Você descobriu o numero escolhido, que era: " + numberRandomInt
        );
        break;
      }

      if (numberFind != numberRandomInt) {
        if (numberFind > numberRandomInt) {
          System.out.println("o numero é maior, digite novamente");
        }
      }

      sc.close();
    }
  }
}
