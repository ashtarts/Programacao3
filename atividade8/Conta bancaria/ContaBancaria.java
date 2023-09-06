public class ContaBancaria {
    private String nome;
    private String numero;
    private double saldo;

    public ContaBancaria(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }}