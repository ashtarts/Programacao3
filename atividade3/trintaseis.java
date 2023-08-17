import java.util.Scanner;

public class trintaseis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double valorEmReais = scanner.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        double valorEmDolares = valorEmReais / cotacaoDolar;

        System.out.println("O valor em dólares é: " + valorEmDolares);

        scanner.close();
    }
}
