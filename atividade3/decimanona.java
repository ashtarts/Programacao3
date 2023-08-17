import java.util.Scanner;

public class decimanona {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da sua cidade: ");
        String cidade = scanner.nextLine();

        char letra = 'S';

        if (cidade.length() > 0 && cidade.charAt(0) == letra) {
            System.out.println("O nome da cidade começa com a letra " + letra);
        } else {
            System.out.println("O nome da cidade não começa com a letra " + letra);
        }

        scanner.close();
    }
}
