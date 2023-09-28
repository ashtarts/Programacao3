import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Funcionario funcionario1 = new Diretor(
                "Diretor1",
                random.nextInt(1000) + 100,
                (random.nextDouble() * 5000) + 4000,
                "Manhã",
                "Segunda-feira"
        );

        Funcionario funcionario2 = new Coordenador(
                "Coordenador1",
                random.nextInt(1000) + 1100,
                (random.nextDouble() * 4000) + 3000, 
                "Tarde"
        );

        Funcionario funcionario3 = new Secretario(
                "Secretario1",
                random.nextInt(1000) + 2100,
                (random.nextDouble() * 3000) + 2000,
                "Noite"
        );

        Funcionario funcionario4 = new Professor(
                "Professor1",
                random.nextInt(1000) + 3100,
                (random.nextDouble() * 2500) + 2000,
                "Manhã",
                "Matemática"
        );

        funcionario1.HorariosDisponiveis();
        funcionario2.HorarioTrabalho();
        funcionario3.InformacoesFuncionario();
        ((Diretor) funcionario1).CriarDescontos();
        ((Coordenador) funcionario2).AuxiliarProfessores();
        ((Secretario) funcionario3).ReceberEncomenda();
        ((Professor) funcionario4).Lecionar();
    }
}