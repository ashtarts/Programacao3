public class Post {
    private String texto;
    private String link;
    private int curtidas;
    private int compartilhamentos;

    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
        this.curtidas = 0;
        this.compartilhamentos = 0;
    }

    public void curtir() {
        curtidas++;
    }
    public void compartilhar() {
        compartilhamentos++;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getCompartilhamentos() {
        return compartilhamentos;
    }}
