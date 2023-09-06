public class Main {

public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", "12345");
        conta.setSaldo(1000.0);
        System.out.println("Titular da Conta: " + conta.getNome());
        System.out.println("Número da Conta: " + conta.getNumero());
        System.out.println("Saldo da Conta: " + conta.getSaldo());
        }
        }