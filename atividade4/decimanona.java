import java.util.Scanner;

public class decimanona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double resultado;

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = (double) numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
