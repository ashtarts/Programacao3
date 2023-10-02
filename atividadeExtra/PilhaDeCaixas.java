import java.util.ArrayList;
import java.util.List;

public class PilhaDeCaixas {
    private double altMax;
    private List<Caixa> pilha;

    public PilhaDeCaixas(double altMax) {
        this.altMax = altMax;
        this.pilha = new ArrayList<>();
    }

    public double getAltMax() {
        return altMax;
    }

    public List<Caixa> getPilha() {
        return pilha;
    }
    public boolean empilhar(Caixa caixa) {
        double alturaAtual = calcularAlt();
        if (alturaAtual + caixa.getAltura() <= altMax) {
            if (caixa instanceof CaixaFragil) {
                double pesoAtual = calcularPeso();
                double pesoMax = ((CaixaFragil) caixa).getPesoMax();
                if (pesoAtual + caixa.getPeso() <= pesoMax) {
                    pilha.add(caixa);
                    return true;
                }
            } else {
                pilha.add(caixa);
                return true;
            }
        }
        return false;
    }

    public Caixa desempilhar() {
        if (!pilha.isEmpty()) {
            return pilha.remove(pilha.size() - 1);
        } else {
            System.out.println("a pilha ta vazia. nao tem caixa para tirar da pilha.");
            return null;
        }
    }
    public double calcularAlt() {
        double alturaAtual = 0;
        for (Caixa caixa : pilha) {
            alturaAtual += caixa.getAltura();
        }
        return alturaAtual;
    }

    public double calcularPeso() {
        double pesoAtual = 0;
        for (Caixa caixa : pilha) {
            pesoAtual += caixa.getPeso();
        }
        return pesoAtual;
    }

    public void exibirCont() {
        for (int i = pilha.size() - 1; i >= 0; i--) {
            Caixa caixa = pilha.get(i);
            System.out.println("caixa " + (i + 1) + ":");
            caixa.exibirEt2();
            System.out.println();
        }
        System.out.println("alturq da pilha atual: " + calcularAlt() + " cm");
        System.out.println("peso total atual da pilha: " + calcularPeso() +"kg");
}
}