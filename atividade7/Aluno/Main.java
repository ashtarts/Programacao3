public class Main {

public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "123.456.789-01");
        aluno.setNota(1, 7.5);
        aluno.setNota(2, 8.0);
        aluno.setNota(3, 9.5);
        aluno.setNota(4, 7.0);
        aluno.media();
        aluno.setNota(2, 8.5);
        aluno.media();
        }
}