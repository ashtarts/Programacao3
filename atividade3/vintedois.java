import java.util.Scanner;

public class vintedois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        String numeroString = scanner.nextLine();

        int numeroInteiro = Integer.parseInt(numeroString);

        int resultado = numeroInteiro + 10;

        String resultadoString = Integer.toString(resultado);

        System.out.println("O número somado com 10 é: " + resultadoString);

        scanner.close();
    }
}
