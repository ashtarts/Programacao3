import java.util.Scanner;

public class decimanona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = 0;int t = 0; int c = 0;
        System.out.println("dgite uma sequência de números inteiros (para parar, digite 0):");
        int num = scanner.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                d++;
            }
            if (num % 3 == 0) {
                t++;
            }
            if (num % 5 == 0) {
                c++;
            }

            num = scanner.nextInt();
        }
        System.out.println("Qquantidade de números divisíveis por 2: " + d);
        System.out.println("Quantidade de números divisíveis por 3: " + t);
        System.out.println("quantidade de números divisíveis por 5: " + c);
    }
}
