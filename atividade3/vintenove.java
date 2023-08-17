import java.util.Scanner;

public class vintenove {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu endereço de e-mail: ");
        String email = scanner.nextLine();

        String mensagem = "Email: " + email + " foi recebido em nosso sistema. Obrigado!";
        System.out.println(mensagem);

        scanner.close();
    }
}
