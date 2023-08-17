import java.util.Scanner;

public class trintadois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double pi = Math.PI;
        double perimetro = 2 * pi * raio;

        System.out.println("O perímetro da circunferência é: " + perimetro);

        scanner.close();
    }
}
