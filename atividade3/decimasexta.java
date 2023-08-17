import java.util.Scanner;

public class decimasexta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        if (nome.length() > 5) {
            System.out.println("Seu nome contém mais de 5 caracteres.");
        } else {
            System.out.println("Seu nome contém 5 caracteres ou menos.");
        }

        scanner.close();
    }
}
