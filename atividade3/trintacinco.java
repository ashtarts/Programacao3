import java.util.Scanner;

public class trintacinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idadeAnos = scanner.nextInt();

        int meses = idadeAnos * 12;
        int dias = idadeAnos * 365;

        System.out.println("Você viveu aproximadamente " + meses + " meses e " + dias + " dias.");

        scanner.close();
    }
}
