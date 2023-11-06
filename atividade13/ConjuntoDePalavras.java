import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoDePalavras {

    private Set<String> palavras;

    public ConjuntoDePalavras(String palavras) {
        this.palavras = new HashSet<>(Arrays.asList(palavras.split(",")));
    }

    public boolean contemTodas(String palavras) {
        for (String palavra : palavras.split(",")) {
            if (!this.palavras.contains(palavra)) {
                return false;
            }
        }

        return true;
    }
}