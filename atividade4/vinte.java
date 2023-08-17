import java.util.Scanner;

public class vinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        int idade = 0;
        boolean idadeValida = false;

        while (!idadeValida) {
            try {
                System.out.print("Digite a sua idade: ");
                idade = Integer.parseInt(scanner.nextLine());
                idadeValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Idade inválida. Digite um valor inteiro.");
            }
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        scanner.close();
    }
}
