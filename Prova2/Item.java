import java.util.ArrayList;

class Item {
    public String nome;
    public int codigo;
    public double valor;
    public int quantidadeEmEstoque;
    public boolean disponibilidade;

    public Item(String nome, int codigo, double valor, int quantidadeEmEstoque, boolean disponibilidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.disponibilidade = disponibilidade;
    }
}
