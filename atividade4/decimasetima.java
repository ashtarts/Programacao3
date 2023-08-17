import java.util.Scanner;

public class decimasetima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 1) {
            System.out.println("Você é um bebê.");
        } else if (idade > 1 && idade <= 12) {
            System.out.println("Você é uma criança.");
        } else if (idade > 12 && idade <= 18) {
            System.out.println("Você é um adolescente.");
        } else {
            System.out.println("Você é um adulto.");
        }

        scanner.close();
    }
}
