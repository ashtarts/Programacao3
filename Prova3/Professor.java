import  java.util.Random;

class Professor extends Usuario implements IOperacoes{
    private String curso;
    private String matricula;
    Aluno[] turma;


    public Professor (String nome, int idade, String curso, String mstricula){
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.turma = new Aluno[10];
    }


    public String getCurso() { return curso;}

    public void setCurso(String curso) {

        this.curso = curso;
    }

    public String getMatricula() {

        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno[] getTurma() {
        return turma;
    }

    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }

    @Override
    public void atividade() {
        System.out.println("ta dando aula para:");
        for (Aluno aluno : turma) {
            System.out.println(aluno.nome);
        }
    }

    @Override
    public double media() {
        double somaMedia = 0;
        int alunosComNotaPendente = 0;

        for (Aluno aluno : turma) {
            double mediaAluno = aluno.media();
            if (mediaAluno == -1) {
                alunosComNotaPendente++;
            } else {
                somaMedia +=mediaAluno;
            }
        }

        if (alunosComNotaPendente > 0) {
            throw new RuntimeException("turma não finalizada, alunos com nota pendente.");
        }

        return somaMedia/turma.length;
    }

    @Override
    public void presenca(){
    Random random=new Random()    ;
        for (Aluno aluno : turma) {
            double numeroRandom =random.nextDouble();

            if (numeroRandom >= 0.8) {
                aluno.getPresencas()[random.nextInt(20)] = false;
            } else {
                aluno.getPresencas()[random.nextInt(20)] = true;
            }
        }
    }
}
