import java.util.Scanner;

public class vinteum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int t = 0;
    System.out.println("Digite uma sequência de números inteiros (para parar, digite 0):");
    int num = scanner.nextInt();

        while (num != 0) {
            if (Math.abs(num) >= 1000) {
                t++;
            }
   num = scanner.nextInt();
        }
        System.out.println("Quantidade de números com mais de três dígitos: " + t);}
}
