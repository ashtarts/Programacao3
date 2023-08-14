import java.util.Scanner;

public class setima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");
        String primeironome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String segundonome = scanner.nextLine();

        String nomeC = primeironome + " " + segundonome;

        System.out.println("Seu nome completo é: " + nomeC);

        scanner.close();
    }
}
