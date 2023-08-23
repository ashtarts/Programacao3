import java.util.Scanner;

public class segunda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número com mais de 1 digito: ");
        int num = scanner.nextInt();
        int soma = 0;
                    while (num != 0) {
              int digito = num % 10;
            soma += digito;
                        num /= 10;
        }

        System.out.println("A soma dos dígitos é: " + soma); }
}
