public class Conta {
    private int Agencia;
    private int conta;
    private double saldo;
    private Cliente cliente;

    public int getAgencia() {
        return Agencia;
    }

    public void setAgencia(int numAgencia) {
        this.Agencia = numAgencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }

    public void saque(double valor){
        this.saldo -= valor;
    }

    public void transferencia(Conta outro, double valor){
        this.saldo -= valor;
        outro.saldo += valor;
    }

    public void exibirSaldo(){
        System.out.println("Nome do usuário: "+ this.getCliente().getNome());
        System.out.println("Saldo: R$"+ this.saldo);
    }

}