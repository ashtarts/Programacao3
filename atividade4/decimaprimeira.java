import java.util.Scanner;

public class decimaprimeira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double aumento;

        if (salario > 1500) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }

        double novoSalario = salario + aumento;

        System.out.println("O aumento é de: R$ " + aumento);
        System.out.println("O novo salário é: R$ " + novoSalario);

        scanner.close();
    }
}
