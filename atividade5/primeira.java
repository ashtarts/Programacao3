import java.util.Scanner;

public class primeira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprov = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();

            if (nota >= 7.0) {
                aprov++;
            }
        }

        System.out.println("A lista de aprovados:" + aprov);
    }
}
