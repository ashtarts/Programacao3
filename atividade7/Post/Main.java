public class Main {
    public static void main(String[] args) {
        String ultimoPost = "Último post no Facebook!";
        String linkSitePreferido = "https://www.meusitefavorito.com";
        Post post = new Post(ultimoPost, linkSitePreferido);

        for (int i = 0; i < 3; i++) {
            post.curtir();
        }

        System.out.println("Número de Curtidas: " + post.getCurtidas());

        for (int i = 0; i < 2; i++) {
            post.compartilhar();
        }

        System.out.println("Número de Compartilhamentos: " + post.getCompartilhamentos());
    }
}