import java.util.ArrayList;
import java.util.List;

public class CaixaFragil extends Caixa {
    private double pesoMax;

    public CaixaFragil(String id, String conteudo, double peso, double altura, double pesoMax) {
        super(id, conteudo, peso, altura);
    }
    public double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(double pesoMax) {
        this.pesoMax = 22;
    }

    public void exibirEtiqueta() {
        super.exibirEt2();
        System.out.println("peso maxsuportado: " + pesoMax);
    }
}
