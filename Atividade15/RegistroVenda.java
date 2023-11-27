public class RegistroVenda {
    private ModoVenda modoVenda;
    private NotificacaoVenda notificacaoVenda;

    public RegistroVenda(ModoVenda modoVenda, NotificacaoVenda notificacaoVenda) {
        this.modoVenda = modoVenda;
        this.notificacaoVenda = notificacaoVenda;
    }

    public void registrarVenda(String produto, String cliente, int quantidade) {
        modoVenda.efetuarVenda(produto, cliente, quantidade);
        notificacaoVenda.enviarConfirmacao(produto, cliente, quantidade);
    }
}
