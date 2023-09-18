import java.util.Random;

public class Empresa {
    private String nome;
    private String cnpj;
    private Trabalhador[] trabalhadores;
    private String endereco;
    private int numFunc;
    private String ceo;

    public Empresa(String nome, String cnpj, String endereco, String ceo) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.ceo = ceo;
        this.numFunc = 0;
        this.trabalhadores = new Trabalhador[20];
    }

    public void contratar(Trabalhador trabalhador) {
        if (numFunc < 20) {
            trabalhadores[numFunc] = trabalhador;
            numFunc++;
        } else {
            System.out.println("A empresa está com capacidade máxima de funcionários.");
        }
    }

    public void trabalhar() {
        for (int i = 0; i < numFunc; i++) {
            trabalhadores[i].trabalhar();
        }
    }

    public Trabalhador[] getFuncionarios() {
        return trabalhadores;
    }

    public double calcularPagamento() {
        double pagamentoTotal = 0;
        for (int i = 0; i < numFunc; i++) {
            pagamentoTotal += trabalhadores[i].calcularPagamento();
        }
        return pagamentoTotal;
    }
}
