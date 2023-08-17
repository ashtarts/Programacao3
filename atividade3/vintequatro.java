import java.util.Scanner;

public class vintequatro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite o nome do estado: ");
        String estado = scanner.nextLine();

        String mensagem = "Você mora em " + cidade + ", " + estado + ".";
        System.out.println(mensagem);

        scanner.close();
    }
}
