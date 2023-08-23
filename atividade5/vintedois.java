import java.util.Scanner;

public class vintedois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;int cont = 0;

  System.out.println("Digite uma sequência de números inteiros (para parar, digite 0):");
        int numero = scanner.nextInt();
        while (numero != 0) {
            if (numero >= 50 && numero <= 100) {
                soma += numero;
                cont++;
            }  numero = scanner.nextInt();
        }
        if (cont > 0) {
     double med = (double) soma / cont;
          System.out.println("A média dos números entre 50 e 100 é: " + med);
        } else {
   System.out.println("Nenhum número entre 50 e 100 foi digitado.");
        }}
}
