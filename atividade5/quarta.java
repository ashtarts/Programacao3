import java.util.Scanner;

public class quarta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            double alt = scanner.nextDouble();

            soma += alt;
        } double Alt = soma / 5;

        System.out.println("A média das alturas é: " + Alt + " metros");

    }
}
