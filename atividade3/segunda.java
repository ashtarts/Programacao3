import java.util.Scanner;

public class segunda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em texto: ");
        String idadeTexto = scanner.nextLine();

        int idade = Integer.parseInt(idadeTexto);

        System.out.println("Sua idade em número inteiro é: " + idade);

        scanner.close();
    }
}
