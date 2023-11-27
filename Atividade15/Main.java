public class Main {
    public static void main(String[] args) {
        ModoVenda vendaLojaFisica = new VendaLojaFisica();
        NotificacaoVenda notificacaoEmail = new NotificacaoEmail();

        RegistroVenda registroVenda = new RegistroVenda(vendaLojaFisica, notificacaoEmail);

        registroVenda.registrarVenda("produtoA", "clienteA", 2);
    }
}
