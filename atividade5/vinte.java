import java.util.Scanner;

public class vinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0; int cont = 0;
        System.out.println("Digite uma sequência de números inteiros (para parar, digite 0):");
        int num = scanner.nextInt();
        while (num != 0) {
            if (num % 3 == 0) {
                soma += num;
                cont++;
            }

            num = scanner.nextInt();
        }
        if (cont > 0) {
            double med = (double) soma / cont;
            System.out.println("A média dos números divisíveis por 3 é: " + med);
        } else {
            System.out.println("Nenhum número divisível por 3 foi digitado.");
        }
    }
}
