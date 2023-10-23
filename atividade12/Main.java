

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter", 1954, 5, "JK Rowling");
        DVD dvd = new DVD("Barbie e o castelo de diamante", 1999, 3, 136);
        Revista revista = new Revista("Caras", 2022, 10, "Janeiro");

        System.out.println("Empréstimo de 2 cópias de 'O Senhor dos Anéis'");
        livro.emprestar();
        livro.emprestar();

        System.out.println("Devolução das cópias de 'O Senhor dos Anéis'");
        livro.devolver();
        livro.devolver();

        System.out.println("Empréstimo de 1 cópia de 'Matrix'");
        dvd.emprestar();
        String dataDevolucao = "2023-10-18";
        double multaLivro = livro.calcularMulta(dataDevolucao);
        double multaDVD = dvd.calcularMulta(dataDevolucao);

        System.out.println("Multa para 'O Senhor dos Anéis': $" + multaLivro);
        System.out.println("Multa para 'Matrix': $" + multaDVD);
    }
}
