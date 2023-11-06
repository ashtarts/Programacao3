import java.util.ArrayList;

class CadastroAluno {

    private ArrayList<Aluno> alunos;

    public CadastroAluno() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void imprimirAlunos() {
        for (Aluno aluno : this.alunos) {
            System.out.println(aluno);
        }
    }
    public Aluno pesquisarAlunoPorMatricula(int matricula) {

        for (Aluno aluno : this.alunos) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }

        return null;
    }
}