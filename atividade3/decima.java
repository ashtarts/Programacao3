import java.util.Scanner;

public class decima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        String nomeInvertido = sobrenome + ", " + nome;
        System.out.println("Seu nome completo invertido é: " + nomeInvertido);
        scanner.close();
    }
}
