package collections.pratica2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ExercicioOrdenacao {
    public static void main(String[] args) throws IOException {
        final int NUMERO_DE_ITEMS_NA_LISTA = 5;
        ArrayList<Produto> produtos = new ArrayList<>();

        Scanner sc = new Scanner(Path.of("src/main/resources/listaProdutos.txt"));


        sc.nextLine();
        int count = 1;
        Strinh descricao = sc.
        while (sc.hasNext()) {
            produtos.add(new Produto(sc.next().))
        }

//        cria produtos

//        for (int i = 0; i < NUMERO_DE_ITEMS_NA_LISTA; i++) {
//
//        }

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

//        imprimir lista ordenada por nome

        ordenaPorNome(produto1, produto2, produto3, produto4, produto5);

//        imprime lista ordenada por custoAquisição

        ordenaPorCustoAquisicao(produto1, produto2, produto3, produto4, produto5);

//        imprime lista ordenada por lucro

        ordenadaPorLucro(produto1, produto2, produto3, produto4, produto5);


    }

    private static void ordenadaPorLucro(Produto produto1, Produto produto2, Produto produto3, Produto produto4, Produto produto5) {
        System.out.println("\n===== ORDENADA POR LUCRO =====\n");

        ArrayList<Float> lucro = new ArrayList<>();
        lucro.add(produto1.calcularLucro());
        lucro.add(produto2.calcularLucro());
        lucro.add(produto3.calcularLucro());
        lucro.add(produto4.calcularLucro());
        lucro.add(produto5.calcularLucro());

        Collections.sort(lucro);

        for (Float l : lucro) {
            System.out.printf("R$ %6.2f\n", l);;
        }
    }

    private static void ordenaPorCustoAquisicao(Produto produto1, Produto produto2, Produto produto3, Produto produto4, Produto produto5) {
        System.out.println("\n===== ORDENADA POR CUSTO DE AQUISIÇÃO =====\n");

        List<Float> custoPorProduto = new ArrayList<>();
        custoPorProduto.add(produto1.getCustoAquisicao());
        custoPorProduto.add(produto2.getCustoAquisicao());
        custoPorProduto.add(produto3.getCustoAquisicao());
        custoPorProduto.add(produto4.getCustoAquisicao());
        custoPorProduto.add(produto5.getCustoAquisicao());

        Collections.sort(custoPorProduto);
        for (Float custo : custoPorProduto) {
            System.out.printf("R$ %6.2f\n", custo);
        }
    }

    private static void ordenaPorNome(Produto produto1, Produto produto2, Produto produto3, Produto produto4, Produto produto5) {

        System.out.println("===== ORDENADA POR NOME =====");

        Set<String> produtos = new TreeSet<>();
        produtos.add(produto1.getNome());
        produtos.add(produto2.getNome());
        produtos.add(produto3.getNome());
        produtos.add(produto4.getNome());
        produtos.add(produto5.getNome());

//        ja é um TreeSet - não precisa ordenar

        for (String nome : produtos) {
            System.out.println(nome);
        }
    }
}
