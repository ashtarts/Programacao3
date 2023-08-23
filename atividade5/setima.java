import java.util.Scanner;

public class setima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();
        int invert = 0;

        while (num != 0) {
            int digito = num % 10;
            invert = invert * 10 + digito;
            num /= 10;
        }
        System.out.println("O número invertido é: " + invert);}
}
