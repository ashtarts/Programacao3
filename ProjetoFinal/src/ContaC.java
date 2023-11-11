public class ContaC extends  Conta{
    private double taxaManutencao;

    public ContaC() {
        super();
    }

    public double simularOperacao(int meses){
        double manutencao;
        manutencao = this.getSaldo() - (meses * taxaManutencao);
        return  manutencao;
    }
}