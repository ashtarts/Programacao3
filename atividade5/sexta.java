import java.util.Scanner;

public class sexta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        int soma = 0;

        while (num != 0) {
            int digito = num % 10;

            if (digito % 2 == 0) {
                soma += digito;
            }
            num /= 10;
        }
        System.out.println("A soma dos dígitos pares é: " + soma);
    }
}
