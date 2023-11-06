import java.util.ArrayList;
import java.util.List;

public class TesteCirculo {

    public static void main(String[] args) {

        List<Circulo> circulos = new ArrayList<>();

        circulos.add(new Circulo(10));
        circulos.add(new Circulo(5));
        circulos.add(new Circulo(2));
        circulos.add(new Circulo(1));
        circulos.add(new Circulo(0.5));

        for (Circulo circulo : circulos) {
            System.out.println("Área do círculo: " + circulo.calcularArea());
        }
    }
}