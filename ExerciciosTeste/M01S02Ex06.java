import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M01S02Ex06 {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> novaLista= new ArrayList<Integer>();
        for (int i=0;i< (lista.size());i++){
        novaLista.add(3*lista.get(i));
        }
        System.out.println(novaLista);
}
}

