import java.util.Scanner;

public class vintetres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menor = Integer.MAX_VALUE;
        System.out.println("Digite uma sequência de números inteiros (para parar, digite 0):");
        int num = scanner.nextInt();
 while (num != 0) {
        if (num > 0 && num % 2 != 0 && num < menor) {
                menor = num;
            }
     num = scanner.nextInt();
        }

        if (menor != Integer.MAX_VALUE) {
         System.out.println("O menor valor positivo e ímpar digitado é: " + menor);
} else {
            System.out.println("Nenhum valor positivo e ímpar foi digitado.");

    }}
}
