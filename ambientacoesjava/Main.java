import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      double galoes = 0.0;
      double litros = 3.7854;
      double conta;

      System.out.print("Insira o número de galões que dejesa converter: ");
      galoes = scanner.nextDouble();

      conta = galoes * litros;

      System.out.println("Resultado: " + conta);

      scanner.close();

      /*
       * Pode ser no main
       * 
       * Crie um projeto que converta galões em litros.O programa
       * funcionará declarando duas variáveis double. Uma conterá o número de
       * galões e a outra o número de litros após a conversão.
       * Um galão é equivalente a 3,7854 litros. Logo, na conversão de galões em
       * litros,
       * o valor do galão é multiplicado por 3,7854.
       * O programa exibe tanto o número de galões quanto o número equivalente em
       * litros.
       * 
       * Tempo: 15 minutos ou vídeo-aulas.
       */


   }

}
