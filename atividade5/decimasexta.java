import java.util.Scanner;

public class decimasexta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;  int notas = 0;
        System.out.println("Digite as 5 notas dos alunos:");

        while (notas < 5) {
            System.out.print("Nota do aluno " + (notas + 1) + ": ");
            double nota = scanner.nextDouble();
            if (nota >= 7.0) {
                cont++;
            }

            notas++;
        }
        System.out.println("O número de alunos aprovados é: " + cont);
        scanner.close();
    }
}
