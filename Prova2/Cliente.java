import java.util.ArrayList;

class Cliente {
    public String nome;
    public int idade;
    public String cpf;
    public String endereco;
    public boolean bomCliente;
    public ArrayList<Item> carrinhoDeCompras = new ArrayList<>();

    public Cliente(String nome, int idade, String cpf, String endereco, boolean bomCliente) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bomCliente = bomCliente;
    }

    public void adicionar(Item item) {
        carrinhoDeCompras.add(item);
    }

    public void cancelar(int codigo) {
        carrinhoDeCompras.removeIf(item -> item.codigo == codigo);
    }

    public double finalizarCompra() {
        double total = 0;
        for (Item item : carrinhoDeCompras) {
            total += item.valor;
            item.quantidadeEmEstoque--;
        }
        carrinhoDeCompras.clear();
        return total;
    }
}

