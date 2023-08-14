import java.util.Scanner;

public class terceira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();
        float numeroDecimal = (float) numeroInteiro;

        System.out.println("O número decimal é: " + numeroDecimal);

    }
}
