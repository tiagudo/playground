package collections.pratica2;

import java.util.Collections;
import java.util.LinkedList;

public class ExercicioOrdenacao3 {
    final private static int NUMERO_DE_ITEMS_NA_LISTA = 5;


    public static void main(String[] args) {

        var produtos = new LinkedList<Produto>();

        Produto produto1 = new Produto("Creme Dental 90g",
                2.49F,
                2.99F);
        Produto produto2 = new Produto("Sabonete em Barra Corporal 90g",
                2.99F,
                3.30F);
        Produto produto3 = new Produto("Protetor Solar 30 FPS 200ml",
                37.39F,
                39.12F);
        Produto produto4 = new Produto("Fralda P Confort - 50 Unidades",
                44.90F,
                44.90F);
        Produto produto5 = new Produto("Condicionador 200ml",
                15.04F,
                18.90F);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);

//        for (Produto produto : produtos) {
//            System.out.println(produto.getNome());
//        }

        Collections.sort(produtos);

        System.out.println("Lista por Descrição");

        imprimeLista(produtos);

        System.out.println("Lista por Valor de Aquisição");

        Collections.sort(produtos, new CustoDeAquisicaoComparator());

        imprimeLista(produtos);

        System.out.println("Lista por Lucro");

        Collections.sort(produtos, new LucroComparator());

        imprimeLista(produtos);


    }

    private static void imprimeLista(LinkedList<Produto> produtos) {
        System.out.println();
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
        System.out.println();
    }
}
