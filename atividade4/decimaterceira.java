import java.util.Scanner;

public class decimaterceira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana (por extenso): ");
        String diaSemana = scanner.nextLine().toLowerCase();

        if (diaSemana.equals("segunda-feira") || diaSemana.equals("terça-feira") ||
                diaSemana.equals("quarta-feira") || diaSemana.equals("quinta-feira") ||
                diaSemana.equals("sexta-feira")) {
            System.out.println("É um dia útil.");
        } else if (diaSemana.equals("sábado") || diaSemana.equals("domingo")) {
            System.out.println("É um fim de semana.");
        } else {
            System.out.println("Dia da semana inválido.");
        }

        scanner.close();
    }
}
