import java.util.ArrayList;

class ClienteEspecial extends Cliente {
    public int pontos;
    public double saldoDeCompras;

    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente) {
        super(nome, idade, cpf, endereco, bomCliente);
    }

    @Override
    public double finalizarCompra() {
        double total = 0;
        for (Item item : carrinhoDeCompras) {
            total += item.valor;
            item.quantidadeEmEstoque--;
        }
        carrinhoDeCompras.clear();

        double desconto = total * 0.05;
        saldoDeCompras += desconto;

        if (saldoDeCompras >= 100) {
            pontos += 5;
            saldoDeCompras -= 100;
        }

        return total - desconto;
    }

    public double finalizarCompra(int pontos) {
        double total = 0;
        for (Item item : carrinhoDeCompras) {
            total += item.valor;
            item.quantidadeEmEstoque--;
        }
        carrinhoDeCompras.clear();

        if (pontos > 0) {
            this.pontos -= pontos;
            return 0;
        }

        return total;
    }
}
