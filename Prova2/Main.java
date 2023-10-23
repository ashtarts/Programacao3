public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Item 1", 1, 10.0, 20, true);
        Item item2 = new Item("Item 2", 2, 15.0, 15, true);

        Cliente cliente1 = new Cliente("Cliente 1", 30, "1234567890", "Endereço 1", false);
        ClienteEspecial cliente2 = new ClienteEspecial("Cliente 2", 25, "9876543210", "Endereço 2", true);
        cliente2.pontos = 50;

        cliente1.adicionar(item1);
        cliente1.adicionar(item2);

        cliente2.adicionar(item1);
        cliente2.adicionar(item2);

        double totalCliente1 = cliente1.finalizarCompra();
        double totalCliente2 = cliente2.finalizarCompra();

        System.out.println("Total da compra para Cliente 1: " + totalCliente1);
        System.out.println("Total da compra para Cliente 2: " + totalCliente2);
        System.out.println("Pontos do Cliente 2 após a compra: " + cliente2.pontos);

        Funcionario funcionario = new Funcionario("Funcionário 1", 35, "5555555555", "Endereço 3", true, "Vendas", 1, 3000.0);

        funcionario.renovarEstoque(item1, 10);
        funcionario.bloquearItem(item2, false);

        System.out.println("Quantidade em estoque do Item 1 após renovação: " + item1.quantidadeEmEstoque);
        System.out.println("Disponibilidade do Item 2 após bloqueio: " + item2.disponibilidade);
    }
}
