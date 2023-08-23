public class nona {
    public static void main(String[] args) {
        int num = 1;
        int prod = 1;

        while (num <= 5) {
            prod *= num;
            num++;
        }
        System.out.println("O produto dos números de 1 a 5 é: " + prod);
    }
}
