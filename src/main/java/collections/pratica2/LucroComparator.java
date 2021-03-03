package collections.pratica2;

import java.util.Comparator;

public class LucroComparator implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.calcularLucro().compareTo(o2.calcularLucro());
    }
}
