import java.util.ArrayList;
import java.util.List;

public class Caixa {
    private String id;
    private String conteudo;
    private double peso;
    private double altura;

    public Caixa(String id, String conteudo, double peso, double altura) {
        this.id = id;
        this.conteudo = conteudo;
        setPeso(peso);
        setAltura(altura);
    }
    public String getId() {
        return id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("o peso tem q ser maior q 0");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("a altura tem q  ser maior q zero");
        }
    }
    public void exibirEt2() {
        System.out.println("id: " + id);
        System.out.println("conteudo: " + conteudo);
        System.out.println("peso em kilo: " + peso);
        System.out.println("altura em cm): " + altura);
    }
}

