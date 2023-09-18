import java.util.Random;

public class Trabalhador {
    private String nome;
    private int idade;
    private double valor;
    private int horas;
    private boolean ferias;

    public Trabalhador(String nome, int idade, double valor) {
        this.nome = nome;
        this.idade = idade;
        this.valor = valor;
        this.horas = 0;
        this.ferias = false;
    }

    public void trabalhar() {
        if (!ferias) {
            Random random = new Random();
            int horasI = random.nextInt(9) + 1;
            horas += horasI;
        }
    }

    public void ferias() {
        ferias = !ferias;
    }

    public int getHoras() {
        return horas;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public double calcularPagamento() {
        return horas * valor;
    }
}
