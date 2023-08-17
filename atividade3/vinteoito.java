import java.util.Scanner;

public class vinteoito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        int dobro = numeroInteiro * 2;

        String mensagem = "Número: " + numeroInteiro + "  Dobro: " + dobro;
        System.out.println(mensagem);

        scanner.close();
    }
}
