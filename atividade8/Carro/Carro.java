public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(int incremento) {
        if (incremento >= 0) {
            velocidade += incremento;
        } else {
            System.out.println("Aceleração inválida. O incremento deve ser não negativo.");
        }
    }

    public void desacelerar(int decremento) {
        if (decremento >= 0 && velocidade - decremento >= 0) {
            velocidade -= decremento;
        } else if (decremento >= 0) {
            System.out.println("Desaceleração inválida. A velocidade não pode ficar negativa.");
        } else {
            System.out.println("Desaceleração inválida. O decremento deve ser não negativo.");
        }
    }
    public int getVelocidade() {
        return velocidade;
    }}
