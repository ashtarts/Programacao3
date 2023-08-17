import java.util.Scanner;

public class decimasexta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número decimal: ");
            double numeroDecimal = scanner.nextDouble();

            long numeroArredondado = Math.round(numeroDecimal);

            System.out.println("Número arredondado: " + numeroArredondado);
        } catch (Exception e) {
            System.out.println("Entrada inválida. Certifique-se de inserir um número decimal.");
        }

        scanner.close();
    }
}
