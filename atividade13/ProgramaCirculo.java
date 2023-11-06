import java.util.ArrayList;
import java.util.List;

public class ProgramaCirculo {

    public static void main(String[] args) {
        List<Circulo> circulos = new ArrayList<>();

        circulos.add(new Circulo(10));
        circulos.add(new Circulo(20));
        circulos.add(new Circulo(30));
        circulos.add(new Circulo(40));
        circulos.add(new Circulo(50));

        for (Circulo circulo : circulos) {
            System.out.println("Área do círculo = " + circulo.getArea());
        }
    }
}