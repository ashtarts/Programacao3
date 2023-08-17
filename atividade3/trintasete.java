import java.util.Scanner;

public class trintasete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        double numeroDecimal = scanner.nextDouble();

        int numeroArredondado = (int) Math.round(numeroDecimal);

        System.out.println("O número arredondado é: " + numeroArredondado);

        scanner.close();
    }
}
