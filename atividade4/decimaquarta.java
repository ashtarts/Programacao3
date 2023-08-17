import java.util.Scanner;

public class decimaquarta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 1 a 5: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 1:
                System.out.println("Muito insuficiente");
                break;
            case 2:
                System.out.println("Insuficiente");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Muito bom");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

        scanner.close();
    }
}
