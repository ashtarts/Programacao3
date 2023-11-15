import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("digite o primeiro numero:");
            double num = s.nextDouble();

            System.out.println("digite o segundo numero:");
            double num2 = s.nextDouble();

            double result = div(num, num2);
            System.out.println("resultado da divisão: " + result);
        } catch (InputMismatchException e) {
            System.out.println("inválido, digite um numero.");
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero invalido");
        }
    }

    private static double div(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisãao por zero");
        }
        return numero1 / numero2;
    }
}
