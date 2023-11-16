class Coordenador extends Professor {
    private String horariodeatendimento;

    public Coordenador(String nome, int idade, String curso, String matricula, String horariodeatendimento) {
        super(nome, idade, curso, matricula);
        this.horariodeatendimento = horariodeatendimento;
    }
    public String getHorariodeatendimento() {
        return horariodeatendimento;
    }

    public void setHorariodeatendimento(String horariodeatendimento) {
        this.horariodeatendimento = horariodeatendimento;
    }


    public void solicitacaoAluno(Aluno aluno) {
        if (aluno.isStatus()) {
            aluno.setStatus(false);
        } else {
            aluno.setStatus(true);
        }
    }

    public void removerTurma(Aluno aluno, Professor professor) {
        boolean alunoPresente = false;

        for (Aluno a : professor.getTurma()) {
            if (a == aluno) {
                alunoPresente = true;
                break;
            }
        }

        if (alunoPresente) {
        } else {
            throw new RuntimeException("O aluno não está presente na turma.");
        }
    }
}