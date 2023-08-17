import java.util.Scanner;

public class decimaprimeira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        int tamanho = input.length();

        System.out.println("O tamanho da string é: " + tamanho);

        scanner.close();
    }
}
