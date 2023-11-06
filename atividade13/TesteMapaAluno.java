import java.util.HashMap;
import java.util.Scanner;

class TesteMapaAluno {

    public static void main(String[] args) {

        HashMap<Integer, Aluno> alunos = new HashMap<>();

        alunos.put(1, new Aluno(1, "fulano", 20, "Engenharia"));
        alunos.put(2, new Aluno(2, "beltrano", 21, "Medicina"));
        alunos.put(3, new Aluno(3, "ciclano", 22, "Direito"));
        alunos.put(4, new Aluno(4, "naosei", 23, "Administração"));
        alunos.put(5, new Aluno(5, "sla", 24, "Psicologia"));

        System.out.println("Digite a matrícula do aluno: ");
        Scanner scanner = new Scanner(System.in);
        int matricula = scanner.nextInt();

        Aluno aluno = alunos.get(matricula);

        if (aluno != null) {
            System.out.println("Aluno encontrado: " + aluno);
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
}
