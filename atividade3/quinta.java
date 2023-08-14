import java.util.Scanner;

public class quinta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        float numeroDecimal = scanner.nextFloat();

        float quadrado = numeroDecimal * numeroDecimal;

        System.out.println("O quadrado do número é: " + quadrado);

        scanner.close();
    }
}
