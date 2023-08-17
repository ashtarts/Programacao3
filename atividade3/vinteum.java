import java.util.Scanner;

public class vinteum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        int numeroInteiro = (int) numeroDecimal;

        System.out.println("O número decimal " + numeroDecimal + " convertido para inteiro é: " + numeroInteiro);

        scanner.close();
    }
}
