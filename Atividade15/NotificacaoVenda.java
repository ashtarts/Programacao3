public interface NotificacaoVenda {
    void enviarConfirmacao(String produto, String cliente, int quantidade);
    void enviarRecibo();
}
