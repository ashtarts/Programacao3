    class Aluno extends Usuario implements IOperacoes{
        private String curso;
        private String matricula;
        private double[] notas;
        boolean[] presencas;
        boolean status;

    public Aluno (String nome, int idade, String curso, String matricula){
        super(nome, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.notas = new double[3];
        this.presencas = new boolean[20];
        this.status = true;

    }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public double[] getNotas() {
            return notas;
        }

        public void setNotas(double[] notas) {
            this.notas = notas;
        }

        public boolean[] getPresencas() {
            return presencas;
        }

        public void setPresencas(boolean[] presencas) {
            this.presencas = presencas;
        }


    @Override
    public void atividade() {
        System.out.println("assistindo aula");
    }

    @Override
    public double media() {
        int faltas = 0;

        for (boolean presenca : presencas) {
            if (!presenca) {
                faltas++;
            }
        }

        if (faltas > 5) {
            System.out.println("reprovado por falta");
            return -1;
        }

        int notasPendentes = 0;
        for (double nota : notas) {
            if (nota == 0.0) {
                notasPendentes++;
            }
        }

        if (notasPendentes < 3) {
            System.out.println("aluno com nota pendente");
            return -1;
        }

        double media = (notas[0] + notas[1] + notas[2]) / 3;

        if (media >= 7) {
            System.out.println("aprovado por media");
        } else if (media >= 5) {
            System.out.println("aaprovado");
        } else {
            System.out.println("reprovado");
        }

        return media;
    }

    @Override
    public void presenca() {
        int faltas = 0;
        int presencas = 0;

        for (boolean presenca : this.presencas) {
            if (presenca) {
                presencas++;
            } else {
                faltas++;
            }
        }

        System.out.println("num de faltas: " + faltas);
        System.out.println("num de presencas: " + presencas);
    }
}
