import java.util.Scanner;

public class decimasegunda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é divisível por 3 e por 5 ao mesmo tempo.");
        } else {
            System.out.println("O número não é divisível por 3 e por 5 ao mesmo tempo.");
        }

        scanner.close();
    }
}
