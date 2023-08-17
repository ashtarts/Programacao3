import java.util.Scanner;

public class primeira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("O número é positivo.");
        } else if (num < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é igual a zero.");
        }

        scanner.close();
    }
}
