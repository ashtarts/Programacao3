
import java.util.HashSet;
import java.util.Scanner;

public class Hashset {

    public static void main(String[] args) {

        HashSet<String> cpf = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o CPF: ");
            String CPF = scanner.nextLine();

            cpf.add(CPF);
        }

        System.out.println("Conteúdo do conjunto:");
        for (String CPF : cpf) {
            System.out.println(CPF);
        }
    }
}