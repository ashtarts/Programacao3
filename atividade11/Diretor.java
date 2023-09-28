public class Diretor extends Funcionario {
    private String segTurno;

    public Diretor(String nome, int inscricao, double salario, String turno, String segTurno) {
        super(nome, inscricao, salario, turno);
        this.segTurno = segTurno;
    }

    public void CriarDescontos() {
    }

    public void EncomendarFardas() {
    }

    public void GerenciarProfessores() {
    }

    @Override
    public void FuncaoDesempenhar() {
    }
}

