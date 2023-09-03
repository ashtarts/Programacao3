public class Lutador {
    private String nome;
    private int energia;
    private int forca;

    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    public void energia(int valor) {
        energia -= valor;
    }

    public void golpe(Lutador adversario) {
        int dano = this.forca;
        adversario.energia(dano);
        System.out.println(this.nome + " aplicou um golpe de força " + this.forca + " em " + adversario.nome);
    }

    public int getEnergia() {
        return energia;
    }}
