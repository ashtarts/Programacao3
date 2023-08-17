import java.util.Scanner;

public class decimaoitava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu estado civil: ");
        String k = scanner.nextLine().toLowerCase();

        switch (k) {
            case "solteiro":
                System.out.println("Você é solteiro.");
                break;
            case "casado":
                System.out.println("Você é casado.");
                break;
            case "divorciado":
                System.out.println("Você é divorciado.");
                break;
            case "viúvo":
                System.out.println("Você é viúvo.");
                break;
            default:
                System.out.println("Estado civil inválido.");
                break;
        }

        scanner.close();
    }
}
