public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        if (anoPublicacao >= 0) {
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("Ano de publicação inválido. Definindo como 0.");
            this.anoPublicacao = 0;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao >= 0) {
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("Ano de publicação inválido. O ano não foi alterado.");
        }

    }



}