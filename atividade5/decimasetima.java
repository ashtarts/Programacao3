import java.util.Scanner;

public class decimasetima{
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
        if (i == 0) {
            System.out.println("Nenhum número ímpar foi digitado antes do primeiro número 0.");
        } else {
            System.out.println("Quantidade de números pares antes do primeiro ímpar: " + p);
        }}
}
