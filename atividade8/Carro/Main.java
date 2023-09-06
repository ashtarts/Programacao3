public class Main {

public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2021);
    carro.acelerar(50);
        System.out.println("Velocidade Atual: " + carro.getVelocidade());
    carro.desacelerar(30);
        System.out.println("Velocidade Atual: " + carro.getVelocidade());
        }
        }
