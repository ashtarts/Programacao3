import java.util.Scanner;

public class terceira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    }
}
