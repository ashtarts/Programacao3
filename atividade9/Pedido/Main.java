import java.util.Random;



public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numPedidos = 5;

        Pedido[] pedidos = new Pedido[numPedidos];

        for (int i = 0; i < numPedidos; i++) {
            int numeroPedido = random.nextInt(1000) + 1;

            int numItens = random.nextInt(5) + 1;
            Item[] itensPedido = new Item[numItens];
            for (int j = 0; j < numItens; j++) {
                String nomeProduto = "Produto" + (j + 1);
                double precoProduto = random.nextDouble() * 200 + 50;
                int quantidade = random.nextInt(3) + 1;

                itensPedido[j] = new Item(nomeProduto, precoProduto, quantidade);
            }
            pedidos[i] = new Pedido(numeroPedido, itensPedido);
        }System.out.println("pedidos c valor total superior a R$ 500:");
        for (Pedido pedido : pedidos) {
            if (pedido.getTotalPedido() > 500) {
                System.out.println("numero do Pedido: " + pedido.getNumero());
            }
        }
    }
}