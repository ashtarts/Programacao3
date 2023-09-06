public class Main {

public static void main(String[] args) {
    BancodeDados banco = new BancodeDados("admin", 100);
   banco.adicionarRegistro("chave1", " valort 01", "admin");

        String resultado = banco.consultarRegistro("chave1");
    System.out.println("Registro consultado: " + resultado);
 banco.atualizarRegistro("chave1", "novoValor", "admin");
        banco.excluirRegistro("chave1", "admin");
        }
        }