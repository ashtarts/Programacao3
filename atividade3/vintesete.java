import java.util.Scanner;

public class vintesete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite o símbolo de moeda: ");
        String simboloMoeda = scanner.nextLine();

        String mensagem = "Produto: " + nomeProduto + "  Preço: " + simboloMoeda + precoProduto;
        System.out.println(mensagem);

        scanner.close();
    }
}
