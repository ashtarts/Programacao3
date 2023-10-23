
class Revista extends ItemBiblioteca {
    private String edicao;

    public Revista(String titulo, int anoPublicacao, int numCopias, String edicao) {
        super(titulo, anoPublicacao, numCopias);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }
}
