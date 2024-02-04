import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class geradorDeSenha {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    //gerador de senhas;
    //gerador com as senhas que eu mais uso;
    //24091997marcos; 24091997; MarcosAJDS1@; LudPBA1@; OlhaOGas@2024;

    //Gerador de senha e armazenador
    String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    String[] letrasMinusculas = new String[26];
    char letra = 'a';
    String[] letrasMaiusculas = new String[26];
    char letraMaiscula = 'A';
    String[] caracteresEspeciais = { //aqui tem os caracteres especiais
      "!",
      "\"",
      "#",
      "$",
      "%",
      "&",
      "\'",
      "(",
      ")",
      "*",
      "+",
      ",",
      "-",
      ".",
      "/",
      "@",
      "?",
    };

    for (int i = 0; i < 26; i++) {
      letrasMaiusculas[i] = String.valueOf(letra);
      letra++;
      letrasMinusculas[i] = String.valueOf(letraMaiscula);
      letraMaiscula++;
    }
    //foi inserido nas 4 arrays: numeros/letras maiusculas/minusculas e caracteresEspeciais
    //Senha terá 12 caracteres..

    List<String> totalCaracteres = new ArrayList<>();
    totalCaracteres.addAll(Arrays.asList(numeros));
    totalCaracteres.addAll(Arrays.asList(letrasMinusculas));
    totalCaracteres.addAll(Arrays.asList(letrasMaiusculas));
    totalCaracteres.addAll(Arrays.asList(caracteresEspeciais));

    String[] senhaGerada = new String[12];
    for (int i = 0; i < 12; i++) {
      double mathRandom = Math.random() * totalCaracteres.size() + 1;
      int mathRandomInt = (int) mathRandom;

      if (mathRandomInt >= 0) {
        String caracterSelecionado = totalCaracteres.get(mathRandomInt);
        senhaGerada[i] = caracterSelecionado;
      }
    }

    System.out.println();
    System.out.println("Senha criada: ");

    for (int i = 0; i < senhaGerada.length; i++) {
      System.out.print(senhaGerada[i]);
    }
    System.out.println();

    sc.close();
  }
}
