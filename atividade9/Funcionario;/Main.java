import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int numFuncionarios = 10;
        Funcionario[] funcionarios = new Funcionario[numFuncionarios];
        Random random = new Random();

        String[] nomes = {"Alice", "Bob", "Carol",
                "David", "Eva", "Frank",
                "Grace", "Hannah", "Isaac",
                "Jane", "Ana", "Gabriel", "Paula",
                "Edgar", "Williams", "Peter"};

        for (int i = 0; i < numFuncionarios; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            double salarioAnual = random.nextDouble() * 60000 + 20000;
            int idade = random.nextInt(40) + 18;

            funcionarios[i] = new Funcionario(nome, salarioAnual, idade);
        }

        print(funcionarios);
    }

    public static void print(Funcionario[] funcionarios) {
        System.out.println("funcioanrio com salário maior que R$ 50.000 e idade menor 30:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSalarioAnual() > 50000 && funcionario.getIdade() < 30) {
                System.out.println("nome: " + funcionario.getNome());
                System.out.println("saklario anual: R$ " + funcionario.getSalarioAnual());
                System.out.println("idade: " + funcionario.getIdade());
                System.out.println();
            }
        }
    }
}
