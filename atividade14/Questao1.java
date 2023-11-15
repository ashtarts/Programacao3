import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("digite o nome:");
        String nome = s.nextLine();

        System.out.println("aigite a posiçao:");
        try {
            int pos = Integer.parseInt(s.nextLine());
            char letra = obterLetra(nome, pos);
            System.out.println("letra na posiçao " + pos + ": " + letra);
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("posiçao invalida");
        }
    }

    private static char obterLetra(String nome, int posicao) {
        return nome.charAt(posicao);
    }
}


