public class ContaPP extends Conta {
    public ContaPP(){
        super();
    }
    private double taxaRendimento = 0.05;

    public double simularOperacao(int meses ){
        double rendimento = 0;
        rendimento = this.getSaldo() +((taxaRendimento * this.getSaldo()) * meses);
        return rendimento;
    }
}
