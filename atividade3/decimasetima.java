import java.util.Scanner;

public class decimasetima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite seu estado civil ('sair' para encerrar): ");
            String estadoCivil = scanner.nextLine();

            switch (estadoCivil.toLowerCase()) {
                case "casado":
                    System.out.println("Você é casado(a).");
                    break;
                case "solteiro":
                    System.out.println("Você é solteiro(a).");
                    break;
                case "divorciado":
                    System.out.println("Você é divorciado(a).");
                    break;
                case "viuvo":
                    System.out.println("Você é viúvo(a).");
                    break;
                case "sair":
                    continuar = false;
                    break;
                default:
                    System.out.println("Estado civil não reconhecido.");
            }
        }

        scanner.close();
    }
}
