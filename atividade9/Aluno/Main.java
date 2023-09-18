import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int num = 10;
        Aluno[] alunos = new Aluno[num];

        String[] nomes = {"Alice", "Bob", "Carol",
                "David", "Eva", "Frank",
                "Grace", "Hannah", "Isaac",
                "Jane", "Ana", "Gabriel", "Paula",
                "Edgar", "Williams", "Peter"};



  for (int i = 0; i < num; i++) {
    String nome = nomes[random.nextInt(nomes.length)];
    int matricula = 1000 + i;
    double[] notas = new double[4];
     for (int j = 0; j < 4; j++) {
       notas[j] = random.nextDouble() * 10;
            }

            alunos[i] = new Aluno(nome, matricula, notas);}
        System.out.println("Alunos Aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.foiAprovado()) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Média: " + aluno.calcularMedia());
                System.out.println();
            }
        }



        System.out.println("Alunos Reprovados:");
        for (Aluno aluno : alunos) {
            if (!aluno.foiAprovado()) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Média: " + aluno.calcularMedia());
                System.out.println();
            }
        }
    }
}