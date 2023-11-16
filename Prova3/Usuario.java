

abstract class Usuario {
    protected String nome;
    protected int idade;
    public Usuario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void atividade();
}