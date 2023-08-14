import java.util.Scanner;

public class sexta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = java.time.Year.now().getValue();

        int idade = anoAtual - anoNascimento;

        System.out.println("Você tem: " + idade);
    }
}
