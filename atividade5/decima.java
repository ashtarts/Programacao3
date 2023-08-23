public class decima {
    public static void main(String[] args) {
        int num = 9;
        int mult = 1;

        while (mult <= 10) {
            int resultado = num * mult;
            System.out.println(num + " x " + mult + " = " + resultado);
            mult++;
        }
    }
}
