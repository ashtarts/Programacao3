import java.util.Scanner;

public class decimaoitava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = 0;int i = 0;
        System.out.println("Digite uma sequência de números inteiros (para parar, digite 0):");
        int num = scanner.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
        p++;
          } else {
                i++;
            }
            num = scanner.nextInt();
        }
        System.out.println("Quantidade de números pares: " + p);
        System.out.println("Quantidade de números ímpares: " + i);

        scanner.close();
    }
}
