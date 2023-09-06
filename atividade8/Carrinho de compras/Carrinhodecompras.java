public class Carrinhodecompras {
    private String usuario;
    private String[] itens;
    private int quantidadeItens;

    public Carrinhodecompras(String usuario) {
        this.usuario = usuario;
        this.itens = new String[100];
        this.quantidadeItens = 0;
    }

    public void adcionar(String item, String nomeUsuario) {
        if (nomeUsuario.equals(usuario)) {
            if (quantidadeItens < itens.length) {
                itens[quantidadeItens] = item;
                quantidadeItens++;
            } else {
                System.out.println("Carrinho de compras está cheio. Não é possível adicionar mais itens.");
            }
        } else {
            System.out.println("Você não tem permissão para adicionar itens ao carrinho de outro usuário.");
        }
    }

    public void remover(String item, String nomeUsuario) {
        if (nomeUsuario.equals(usuario)) {
            for (int i = 0; i < quantidadeItens; i++) {
                if (itens[i] != null && itens[i].equals(item)) {
                    for (int j = i; j < quantidadeItens - 1; j++) {
                        itens[j] = itens[j + 1];
                    }
                    itens[quantidadeItens - 1] = null;
                    quantidadeItens--;
                    return;
                }
            }
            System.out.println("Item não encontrado no carrinho.");
        } else {
            System.out.println("Você não tem permissão para remover itens do carrinho de outro usuário.");
        }
    }

    public String[] listar(String nomeUsuario) {
        if (nomeUsuario.equals(usuario)) {
            String[] lista = new String[quantidadeItens];
            for (int i = 0; i < quantidadeItens; i++) {
                lista[i] = itens[i];
            }
            return lista;
        } else {
            System.out.println("Você não tem permissão para listar os itens do carrinho de outro usuário.");
            return new String[0];
        }
    }
    }