
class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, int anoPublicacao, int numCopias, String autor) {
        super(titulo, anoPublicacao, numCopias);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
}
