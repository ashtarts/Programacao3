import java.util.Scanner;

public class trintaoito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int n3 = scanner.nextInt();

        int resultado = (n1 + n2) * n3;

        System.out.println("O resultado da operação é: " + resultado);

        scanner.close();
    }
}
