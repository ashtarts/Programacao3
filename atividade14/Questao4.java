import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetor = new int[10];
        int indice = 0;

        try {
            while (true) {
                System.out.println("Digite um valor inteiro (ou 0 para encerrar):");
                int valor = s.nextInt();

                if (valor == 0) {
                    break;
                }

                vetor[indice] = valor;
                indice++;

                if (indice >= 10) {
                    throw new ArrayIndexOutOfBoundsException("num máximo de elementos atingido ");
                }
            }

            System.out.println("valores:");
            for (int i = 0; i < indice; i++) {
                System.out.print(vetor[i] + " ");
            }
        } catch (InputMismatchException e) {
            System.out.println(" inválido, digite um valor inteiro.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("num máximo de elementos atingido (10).");
        }
    }
}
