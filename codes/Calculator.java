import java.util.Scanner;
import java.util.Locale;
import java.lang.Math;
public class Main {
  // Inicio do codigo de graus
  public static double degree(double num, double sqr) {
    double res = num;
    for (int x = 1; x < sqr; x++) {
      res *= num;
    }
    return res;
  }
  // Fim do codigo
  public static void main(String[] args)  {
  // Definindo a zona de codigo
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    double summary;
    String num1, act, num2 = "0";
    String line = "=================================================================";
    String ajuda_text = "============================MENU=AJUDA============================\n" +
               "Syntax comum: \"num1 ação num2\"\n" +
                 "Ao escrever, pressione Enter\n" +
               "Lista de ações: 1: + \"mais dois números\"\n" +
               "             2: - \"Subtraindo dois números\"\n" +
               "             3: * \"Mutiplicando dois números\"\n" +
               "             4: / \"Dividindo dois números\"\n" +
               "             5: ^ \"substitutos em grau\"\n" +
               "             6: sqrt \"mostra a raiz quadrada de um num1\"\n" +
               line +
               "\nLista de comandos: 1: Ajuda \"Chamando o menu de ajuda\"\n" +
               "              2: exit \"Feja o programa\"\n" +
               line + "\n";
  // Definindo o fim
  // ======================================
    System.out.println(line + "\nCalculadora Console");
    System.out.println("Digite ajuda para sobre mais \"ajuda\" Pressione enter\n" + line);
    scan_zone:
    while (true) {
      System.out.print("Command: ");
      num1 = scan.next();
      switch (num1) {
        case "exit":
          System.out.println(line);
          System.exit(0);
          break;
        case "ajuda":
          System.out.print(help_text);
          continue scan_zone;
        default:
          try {
            Integer.parseInt(num1);
          }
          catch (NumberFormatException e) {
            System.out.println("Error: 13 (Errado Command). Para ver uma lista de comandos escreva \"ajuda\"\n" + line);
            continue;
          }
      }
      act = scan.next();
      if (act.equals("sqrt")) {
        System.out.println("Resultado: " + Math.sqrt(Double.parseDouble(num1)) + "\n" + line);
        continue;
      }
      num2 = scan.next();
      try {
        Double.parseDouble(num2);
      }
      catch (NumberFormatException e) {
        System.out.println("Error: 14 (Errado num2)\n" + line);
        continue;
      }
  // SCANER ZONE END
  // ======================================
  // CHECK ZONE START
      switch (act) {
        case "^":
        summary = degree(Double.parseDouble(num1), Double.parseDouble(num2));
        break;
        case "+":
        summary = Double.parseDouble(num1) + Double.parseDouble(num2);
        break; 
        case "-":
        summary = Double.parseDouble(num1) - Double.parseDouble(num2);
        break; 
        case "*":
        summary = Double.parseDouble(num1) * Double.parseDouble(num2);
        break; 
        case "/":
        summary = Double.parseDouble(num1) / Double.parseDouble(num2);
        break;
        case ">":
        if (Double.parseDouble(num1) > Double.parseDouble(num2)) System.out.println("Resultado: Sim\n" + line);
        else System.out.println("Resultado: Não\n" + line);
        continue;
        case "<":
        if (Double.parseDouble(num1) < Double.parseDouble(num2)) System.out.println("Resultado: Sim\n" + line);
        else System.out.println("Resultado: Não\n" + line);
        continue;
        default:
          System.out.println("Ação errada. Escrever \"ajuda\" para mais\n" + line);
          continue;
      }
      
      System.out.println("Resultado: " + summary + "\n" + line);
    }
  }
}
