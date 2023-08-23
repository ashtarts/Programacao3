public class oitava {
    public static void main(String[] args) {
        int num = 1;
        int soma = 0;

        while (num <= 100) {
            soma += num;
            num++;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
