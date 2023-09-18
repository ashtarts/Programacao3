class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String verificarDisponibilidade() {
        if (disponivel) {
            return "O livro '" + titulo + "' está disponível para empréstimo.";
        } else {
            return "O livro '" + titulo + "' não está disponível para empréstimo.";
        }
    }

    public void setDisponibilidade(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}