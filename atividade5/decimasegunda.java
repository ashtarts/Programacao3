import java.util.Scanner;

public class decimasegunda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int cont = 0;
        System.out.println("Digite uma sequência de números inteiros (para parar, digite -1):");
        int num = scanner.nextInt();
                      while (num != -1) {soma += num;
            cont++;

            num = scanner.nextInt();
        }
        if (cont > 0) {
            double media = (double) soma / cont;
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("nenhum número foi digitado.");
        }

        scanner.close();
    }
}
