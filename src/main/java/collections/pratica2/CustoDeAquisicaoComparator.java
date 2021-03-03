package collections.pratica2;

import java.util.Comparator;

public class CustoDeAquisicaoComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getCustoAquisicao().compareTo(o2.getCustoAquisicao());
    }
}
