import java.util.Scanner;

public class oitava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma sequência de números separados por espaço: ");
        String sequencia = scanner.nextLine();

        String[] numeros = sequencia.split(" ");

        int quantidadeNumeros = numeros.length;

        System.out.println("Foram digitados " + quantidadeNumeros + " números.");

        scanner.close();
    }
}
