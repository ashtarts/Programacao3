public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) throws DimensoesInvalidasException {
        if (!validarDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void setLado1(double lado1) throws DimensoesInvalidasException {
        if (!validarDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo");
        }
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) throws DimensoesInvalidasException {
        if (!validarDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo");
        }
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) throws DimensoesInvalidasException {
        if (!validarDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensões inválidas para formar um triângulo");
        }
        this.lado3 = lado3;
    }

    private boolean validarDimensoes(double lado1, double lado2, double lado3) {
        return lado1 > Math.abs(lado2 - lado3) && lado1 < (lado2 + lado3) &&
                lado2 > Math.abs(lado1 - lado3) && lado2 < (lado1 + lado3) &&
                lado3 > Math.abs(lado1 - lado2) && lado3 < (lado1 + lado2);
    }
}
