import java.util.Scanner;

public class vinte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número decimal: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número decimal: ");
        double numero2 = scanner.nextDouble();
        double resto = numero1 % numero2;

        System.out.println("O resto da divisão é: " + resto);

        scanner.close();
    }
}
