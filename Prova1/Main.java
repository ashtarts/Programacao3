import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Unicap", "999999999", "111 Rua do Príncipe", "Padre");

        for (int i = 0; i < 10; i++) {
            String nomeFunc = "funcionario: " + i;
            int idade = new Random().nextInt(40) + 20;
            double valorHora = 10 + new Random().nextDouble() * 20;

            Trabalhador funcionario = new Trabalhador(nomeFunc, idade, valorHora);

            empresa.contratar(funcionario);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                empresa.trabalhar();
            }
            empresa.trabalhar();
            empresa.trabalhar();
        }

        System.out.println("funcionarios da da empresa:");
        for (Trabalhador funcionario : empresa.getFuncionarios()) {
            if (funcionario != null) {
                System.out.println(funcionario.getNome() + " - pagamento é: " + funcionario.calcularPagamento());
            }
        }

        double pagamentoTotal = empresa.calcularPagamento();
        System.out.println("pagamento total feito pela empresa: " + pagamentoTotal);
    }
}
