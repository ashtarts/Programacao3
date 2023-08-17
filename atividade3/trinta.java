import java.util.Scanner;

public class trinta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int diferenca = numero1 - numero2;
        int produto = numero1 * numero2;
        int quociente = numero1 / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Diferença: " + diferenca);
        System.out.println("Produto: " + produto);
        System.out.println("Quociente: " + quociente);

        scanner.close();
    }
}
