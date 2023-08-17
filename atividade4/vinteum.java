import java.util.Scanner;

public class vinteum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um valor em metros: ");
            double metros = Double.parseDouble(scanner.nextLine());

            double centimetros = metros * 100;
            double milimetros = metros * 1000;
            double quilometros = metros / 1000;

            System.out.println("Valor em centímetros: " + centimetros);
            System.out.println("Valor em milímetros: " + milimetros);
            System.out.println("Valor em quilômetros: " + quilometros);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Certifique-se de inserir um número.");
        }

        scanner.close();
    }
}
