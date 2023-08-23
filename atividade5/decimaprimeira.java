import java.util.Scanner;

public class decimaprimeira {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;
        System.out.println("Digite uma sequência de números inteiros. Digite 0 para encerrar.");

  while (true) {
       System.out.print("Digite um número (ou 0 para encerrar): ");
        int numero = scanner.nextInt();
         if (numero == 0) {
                break;
            }
            if (numero < min) {
                min = numero;
           }
      if (numero > max) {
               max= numero;
            }}



        if (min == Integer.MAX_VALUE || max == Integer.MIN_VALUE) {
            System.out.println("Nenhum número válido foi digitado.");
        } else {
            System.out.println("O menor número digitado foi: " + min);
            System.out.println("O maior número digitado foi: " + max);
        }
    }
}
