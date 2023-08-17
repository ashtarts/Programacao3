import java.util.Scanner;

public class vinteseis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        String concatenado = numeroInteiro + " " + texto;
        System.out.println("Junto seria: " + concatenado);

        scanner.close();
    }
}
