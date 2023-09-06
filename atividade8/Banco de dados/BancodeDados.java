public class BancodeDados {
    private String usuarioAcesso;
    private Registro[] registros;
    private int max;
    private int tamanho;

    public BancodeDados(String usuarioAcesso, int max) {
        this.usuarioAcesso = usuarioAcesso;
        this.max = max;
        this.registros = new Registro[max];
        this.tamanho = 0;
    }

    public String consultarRegistro(String chave) {
        for (int i = 0; i < tamanho; i++) {
            if (registros[i].getChave().equals(chave)) {
                return registros[i].getValor();
            }
        }
        return "Registro não encontrado.";
    }

    public void adicionarRegistro(String chave, String valor, String nomeUsuario) {
        if (nomeUsuario.equals(usuarioAcesso)) {
            if (tamanho < max) {
                Registro novoRegistro = new Registro(chave, valor);
                registros[tamanho] = novoRegistro;
                tamanho++;
                System.out.println("Registro adicionado com sucesso.");
            } else {
                System.out.println("Limite máximo de registros atingido.");
            }
        } else {
            System.out.println("Acesso negado. Você não tem permissão para adicionar registros.");
        }
    }

    public void atualizarRegistro(String chave, String novoValor, String nomeUsuario) {
        if (nomeUsuario.equals(usuarioAcesso)) {
            for (int i = 0; i < tamanho; i++) {
                if (registros[i].getChave().equals(chave)) {
                    registros[i].setValor(novoValor);
                    System.out.println("Registro atualizado com sucesso.");
                    return;
                }
            }
            System.out.println("Registro não encontrado.");
        } else {
            System.out.println("Acesso negado. Você não tem permissão para atualizar registros.");
        }
    }

    public void excluirRegistro(String chave, String nomeUsuario) {
        if (nomeUsuario.equals(usuarioAcesso)) {
            for (int i = 0; i < tamanho; i++) {
                if (registros[i].getChave().equals(chave)) {
                    for (int j = i; j < tamanho - 1; j++) {
                        registros[j] = registros[j + 1];
                    }
                    registros[tamanho - 1] = null;
                    tamanho--;
                    System.out.println("Registro excluído com sucesso.");
                    return;

                }
    }



            System.out.println("Registro não encontrado.");
        } else {
            System.out.println("Acesso negado. Você não tem permissão para excluir registros.");
        }
    }}