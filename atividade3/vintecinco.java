import java.util.Scanner;

public class vintecinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        String mensagem = "Bem-vindo ao nosso programa, nascido em " + anoNascimento + "!";
        System.out.println(mensagem);

        scanner.close();
    }
}
