
import java.util.ArrayList;

class Funcionario extends ClienteEspecial {
    public String setor;
    public int id;
    public double salario;

    public Funcionario(String nome, int idade, String cpf, String endereco, boolean bomCliente, String setor, int id, double salario) {
        super(nome, idade, cpf, endereco, bomCliente);
        this.setor = setor;
        this.id = id;
        this.salario = salario;
    }

    public void renovarEstoque(Item item, int quantidade) {
        item.quantidadeEmEstoque += quantidade;
    }

    public void bloquearItem(Item item, boolean disponivel) {
        item.disponibilidade = disponivel;
    }
}
