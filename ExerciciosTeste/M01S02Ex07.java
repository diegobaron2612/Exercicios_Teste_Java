import java.util.Arrays;
import java.util.List;

public class M01S02Ex07 {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");
        int tamanhoArr = 0;
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(String.format("O nome %d - é %s", i, nomes.get(i)));
        }
        for (String nome : nomes) {
            System.out.println("o nome é: " + nome);
        }
        while (tamanhoArr < nomes.size()) {
            System.out.println("O nome com while é:" + nomes.get(tamanhoArr));
            tamanhoArr++;
        }

    }
}
