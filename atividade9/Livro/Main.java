import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numLivros = 5;
        Livro[] livros = new Livro[numLivros];

        String[] titulos = {"Terra do Pecado", "Star Wars", "Harry Potter", "Memórias póstumas de Brás Cubas", "O Hobbit"};
        String[] autores = {"José Saramago", "George Lucas", "JK Rowling", "Machado de Assis", "J. R. R. Tolkien"};
 for (int i = 0; i < numLivros; i++) {
     String titulo = titulos[i];
     String autor = autores[i];
      boolean disponivel = random.nextBoolean();

            livros[i] = new Livro(titulo, autor, disponivel);
        }
        for (Livro livro : livros) {
            System.out.println(livro.verificarDisponibilidade());
        }
    }
}