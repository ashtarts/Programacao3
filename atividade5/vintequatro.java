import java.util.Scanner;

public class vintequatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prim = 0;int ult = 0;int p = 0;
  int i = 0;
  System.out.println("Digite uma sequência de números inteiros (para parar, digite 0):");
     int num = scanner.nextInt();

        if (num != 0) {
            prim = num;
            ult = num;
        }




  while (num != 0) {
     if (num % 2 == 0) {
         p++;
 } else {
         i++;
     }  ult = num;
     num = scanner.nextInt();
        }

        if (prim == 0) {
       System.out.println("Nenhum número foi digitado.");
        } else {
   System.out.println("Quantidade de números pares entre " + prim + " e " + ult + ": " + p);
System.out.println("Quantidade de números ímpares entre " + prim + " e " + ult + ": " + i);
        }
    }
}
