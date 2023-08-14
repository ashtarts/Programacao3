import java.util.Scanner;

public class nona {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de um animal: ");
        String animal = scanner.nextLine();

        System.out.println("O animal é " + animal);

        scanner.close();
    }
}
