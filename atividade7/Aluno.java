public class Aluno {
    private String nome;
    private String cpf;
    private double[] notas;

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.notas = new double[4];
    }

    public void media() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("Média do aluno: " + media);
    }

    public void setNota(int unidade, double nota) {
        if (unidade >= 1 && unidade <= 4) {
            notas[unidade - 1] = nota;
        } else {
            System.out.println("Unidade de nota inválida.");
        }
    }}