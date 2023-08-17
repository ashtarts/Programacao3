import java.util.Scanner;

public class nona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC calculado: " + imc);

        if (imc < 18.5) {
            System.out.println("Categoria: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Categoria: Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Categoria: Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Categoria: Obesa");
        } else {
            System.out.println("Categoria: Muito obesa");
        }

        scanner.close();
    }
}
