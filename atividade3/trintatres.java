import java.util.Scanner;

public class trintatres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double perimetro = 2 * (base + altura);

        System.out.println("O perímetro do retângulo é: " + perimetro);

        scanner.close();
    }
}
