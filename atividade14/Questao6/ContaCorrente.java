public class ContaCorrente {
    private int numeroConta;
    private double saldo;

    public ContaCorrente(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
    }
}
