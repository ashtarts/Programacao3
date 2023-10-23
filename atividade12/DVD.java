class DVD extends ItemBiblioteca {
    private int duracao;

    public DVD(String titulo, int anoPublicacao, int numCopias, int duracao) {
        super(titulo, anoPublicacao, numCopias);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }
}
