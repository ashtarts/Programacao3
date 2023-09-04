import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paciente[] pacientes = new Paciente[100];
        Medico[] medicos = new Medico[100];
        int totalPacientes = 0; int totalMedicos = 0; boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar paciente");
            System.out.println("2 - Criar médico");
            System.out.println("3 - Mostrar pacientes");
            System.out.println("4 - Mostrar médicos");
            System.out.println("5 - Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    totalPacientes = criarPaciente(scanner, pacientes, totalPacientes);
                    break;
                case 2:
                    totalMedicos = criarMedico(scanner, medicos, totalMedicos);
                    break;
                case 3:
                    mostrarPacientes(pacientes, totalPacientes);
                    break;
                case 4:
                    mostrarMedicos(medicos, totalMedicos);
                    break;
                case 5:
                    System.out.println("saindo do programa.");
                    sair = true;
                    scanner.close();
                    break;
                default:
                    System.out.println("Opçao inválida. Tente novamente.");
            }
        }
    }

    public static int criarPaciente(Scanner scanner, Paciente[] pacientes, int totalPacientes) {
        if (totalPacientes < pacientes.length) {
            System.out.println("informe o código do paciente:");
            int codigo = scanner.nextInt();
            scanner.nextLine();
            System.out.println("informe o nome do paciente:");
            String nome = scanner.nextLine();
            System.out.println("Informe a data de nascimento do paciente:");
            String dataNascimento = scanner.nextLine();
            System.out.println("informe o sxo do paciente:");
            String sexo = scanner.nextLine();
            System.out.println("informe o plano de saúde do paciente:");
            String planoSaude = scanner.nextLine();
            System.out.println("informe a alergia do paciente (ou deixe em branco se não houver):");
            String alergia = scanner.nextLine();
            System.out.println("Informe o tipo sanguíneo do paciente:");
            String tipoSanguineo = scanner.nextLine();

            Paciente paciente = new Paciente(codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo);

            pacientes[totalPacientes] = paciente;
            totalPacientes++;
        } else {
            System.out.println("A capacidade máxima de pacientes foi atingida.");
        }
        return totalPacientes;
    }

    public static int criarMedico(Scanner scanner, Medico[] medicos, int totalMedicos) {
        if (totalMedicos < medicos.length) {
            System.out.println("Informe o código do médico:");
            int codigo = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Informe o nome do médico:");
            String nome = scanner.nextLine();
            System.out.println("Informe o sexo do médico:");
            String sexo = scanner.nextLine();
            System.out.println("Informe a especialidade do médico:");
            String especialidade = scanner.nextLine();
            System.out.println("informe o endereço do médico:");
            System.out.println("Informe a rua:");
            String rua = scanner.nextLine();
            System.out.println("informe o número:");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.println("informe o complemento:");
            String complemento = scanner.nextLine();
            System.out.println("Informe o bairro:");
            String bairro = scanner.nextLine();
            System.out.println("Informe a cidade:");
            String cidade = scanner.nextLine();
            System.out.println("Informe o UF:");
            String uf = scanner.nextLine();
            System.out.println("Informe o CEP:");
            String cep = scanner.nextLine();
            Endereco endereco = new Endereco(rua, numero, complemento, bairro, cidade, uf, cep);
            Medico medico = new Medico(codigo, nome, sexo, especialidade, endereco);
            medicos[totalMedicos] = medico;
            totalMedicos++;
        } else {
            System.out.println("A capacidade máxima de médicos foi atingida.");
        }
        return totalMedicos;
    }

    public static void mostrarPacientes(Paciente[] pacientes, int totalPacientes) {
        if (totalPacientes == 0) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            System.out.println("Lista de Pacientes:");
            for (int i = 0; i < totalPacientes; i++) {
                Paciente paciente = pacientes[i];
                System.out.println("Código: " + paciente.getCodigo());
                System.out.println("Nome: " + paciente.getNome());
                System.out.println("Data de Nascimento: " + paciente.getData());
                System.out.println("Sexo: " + paciente.getSexo());
                System.out.println("Plano de Saúde: " + paciente.getPlano());
                System.out.println("Alergia: " + paciente.getAlergia());
                System.out.println("Tipo Sanguíneo: " + paciente.getSangue());
                System.out.println();
            }
        }
    }

    public static void mostrarMedicos(Medico[] medicos, int totalMedicos) {
        if (totalMedicos == 0) {
            System.out.println("Nenhum médico cadastrado.");
        } else {
            System.out.println("Lista de Médicos:");
            for (int i = 0; i < totalMedicos; i++) {
                Medico medico = medicos[i];
                System.out.println("Código: " + medico.getCodigo());
                System.out.println("Nome: " + medico.getNome());
                System.out.println("Sexo: " + medico.getSexo());
                System.out.println("Especialidade: " + medico.getEspecialidade());
                System.out.println("Endereço: " + medico.getEndereco().getRua() + ", " + medico.getEndereco().getNumero() + ", " + medico.getEndereco().getComplemento());
                System.out.println("Bairro: " + medico.getEndereco().getBairro());
                System.out.println("Cidade: " + medico.getEndereco().getCidade());
                System.out.println("UF: " + medico.getEndereco().getUf());
                System.out.println("CEP: " + medico.getEndereco().getCep());
                System.out.println();
            }
        }
    }
}