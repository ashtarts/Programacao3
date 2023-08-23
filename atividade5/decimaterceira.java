import java.util.Scanner;

public class decimaterceira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        int soma = 0;
        while (num != 0) {
            int digito = num % 10;
            int c = digito * digito * digito;
            soma += c;
            num /= 10;
        }
        System.out.println("A soma dos dígitos elevados ao cubo é: " + soma);}
}
