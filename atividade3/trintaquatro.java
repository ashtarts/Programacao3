import java.util.Scanner;

public class trintaquatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número decimal: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número decimal: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número decimal: ");
        double numero3 = scanner.nextDouble();
        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média aritmética dos números é: " + media);

        scanner.close();
    }
}
