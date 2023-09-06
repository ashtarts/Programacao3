
public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);

  System.out.println("Título: " + livro.getTitulo());
                 System.out.println("Autor: " + livro.getAutor());
     System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());

        livro.setAnoPublicacao(-1);
        System.out.println("Ano de Publicação (após tentativa inválida): " + livro.getAnoPublicacao());
    }
}





