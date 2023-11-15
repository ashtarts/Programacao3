import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("digite a idade da pessoa " + (i + 1) + ":");
            try {
                int idade = scanner.nextInt();
                idades.add(idade);
            } catch (InputMismatchException e) {
                System.out.println("invalido, digite um número inteiro");
                scanner.nextLine();
                i--;
            }
        }

        System.out.println("digite a posição da idade a ser removida");
        try {
            int posicao = scanner.nextInt();
            idades.remove(posicao);
            System.out.println("idade removida com sucesso.");
        } catch (IndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("posição invalida.");
        }
    }
}
