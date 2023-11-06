
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        CadastroAluno cadastroAluno = new CadastroAluno();

        cadastroAluno.adicionarAluno(new Aluno(1, "Fulano", 20, "Engenharia"));
        cadastroAluno.adicionarAluno(new Aluno(2, "Beltrano", 21, "Medicina"));
        cadastroAluno.adicionarAluno(new Aluno(3, "Ciclano", 22, "Direito"));
        cadastroAluno.adicionarAluno(new Aluno(4, "Demetrio", 23, "Administração"));
        cadastroAluno.adicionarAluno(new Aluno(5, "Efigênia", 24, "Psicologia"));

        cadastroAluno.imprimirAlunos();

        System.out.println("Digite a matrícula do aluno: ");
        Scanner scanner = new Scanner(System.in);
        int matricula = scanner.nextInt();

        Aluno aluno = cadastroAluno.pesquisarAlunoPorMatricula(matricula);

        if (aluno != null) {
            System.out.println("Aluno encontrado: " + aluno);
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
}