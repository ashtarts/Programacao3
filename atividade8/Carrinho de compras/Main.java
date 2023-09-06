public class Main {

public static void main(String[] args) {
    Carrinhodecompras carrinho = new Carrinhodecompras("joao");

        carrinho.adcionar("Produto A", "joao");
        carrinho.adcionar("Produto B", "joao");

        carrinho.adcionar("Produto C", "maria");

        carrinho.remover("Produto A", "joao");

        carrinho.remover("Produto B", "maria");

        String[] itensJoao = carrinho.listar("joao");
    System.out.println("Itens no carrinho de João:");
        for (String item : itensJoao) {
        System.out.println(item);
        }

        String[] itensMaria = carrinho.listar("maria");
        System.out.println("Itens no carrinho de Maria:");
        for (String item : itensMaria) {
        System.out.println(item);
        }
        }
        }