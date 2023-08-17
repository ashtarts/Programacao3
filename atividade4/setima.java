import java.util.Scanner;

public class setima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        if (Character.isLetter(caractere)) {
            caractere = Character.toLowerCase(caractere);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                System.out.println("O caractere é uma vogal.");
            } else {
                System.out.println("O caractere é uma consoante.");
            }
        } else {
            System.out.println("O caractere digitado não é uma letra.");
        }

        scanner.close();
    }
}
