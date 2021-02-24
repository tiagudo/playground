package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemplosCollections {
    public static void main(String[] args) {

        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Kiersten");
        pessoas.add("Zaneta");
        pessoas.add("Frank");
        pessoas.add("Tedi");
        pessoas.add("Bryana");
        pessoas.add("Marigold");
        pessoas.add("Devan");
        pessoas.add("Jerrilyn");
        pessoas.add("Isac");
        pessoas.add("Kathrine");
        pessoas.add("Bryana");

        for (String p: pessoas) {
            System.out.println(p);
        }

        System.out.println();
        Collections.sort(pessoas);

        for (String p: pessoas) {
            System.out.println(p);
        }

        List<String> primeiros = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            primeiros.add(pessoas.get(i));
        }

        System.out.println();

        for (String p: primeiros) {
            System.out.println(p);
        }
    }
}
