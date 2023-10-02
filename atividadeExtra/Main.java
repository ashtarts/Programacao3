import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        PilhaDeCaixas pilha = new PilhaDeCaixas(100);

        for (int i = 0; i < 5; i++) {
            String identificador = "caixa" + (i + 1);
            String conteudo = "conteudo da Caixa " + (i + 1);
            double peso = random.nextDouble() * 30;
            double altura = random.nextDouble() * 20;

            if (random.nextBoolean()) {
                double pesoMax = random.nextDouble() * 30;
                CaixaFragil caixaFragil = new CaixaFragil(identificador, conteudo, peso, altura, pesoMax);
                boolean empilhou = pilha.empilhar(caixaFragil);
                if (empilhou) {
                    System.out.println("caixa fragil agora esta na pilha " + identificador);
                } else {
                    System.out.println("Nnao deu pra tirar a caiarx fragil da pilha " + identificador);
                }
            } else {
                Caixa caixaComum = new Caixa(identificador, conteudo, peso, altura);
                boolean empilhou = pilha.empilhar(caixaComum);
                if (empilhou) {
                    System.out.println("agora a caixa ta na pilha: " + identificador);
                } else {
                    System.out.println("nao deu pra tirar a caixa da pilha: " + identificador);
                }
            }
        }

        pilha.exibirCont();

        while (!pilha.getPilha().isEmpty()) {
            Caixa caixaDesempilhada = pilha.desempilhar();
            if (caixaDesempilhada != null) {
                System.out.println("caixa fora da pilha: " + caixaDesempilhada.getId());
            }
        }

        pilha.exibirCont();
    }
}