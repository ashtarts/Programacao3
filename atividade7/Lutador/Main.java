import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lutador ryu = new Lutador("Ryu", 100, 10);

        Lutador bison = new Lutador("Bison", 100, 12);

        for (int i = 0; i < 3; i++) {
            ryu.golpe(bison);
        }

        System.out.println("Energia de Bison: " + bison.getEnergia());

        for (int i = 0; i < 8; i++) {
            bison.golpe(ryu);
        }

        System.out.println("Energia de Ryu: " + ryu.getEnergia());

    }
}