import java.util.Scanner;

public class sexta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();

        int tamanho1 = nome1.length();
        int tamanho2 = nome2.length();

        if (tamanho1 > tamanho2) {
            System.out.println("O nome da primeira pessoa possui mais caracteres.");
        } else if (tamanho2 > tamanho1) {
            System.out.println("O nome da segunda pessoa possui mais caracteres.");
        } else {
            System.out.println("Os nomes têm o mesmo número de caracteres.");
        }

        scanner.close();
    }
}
