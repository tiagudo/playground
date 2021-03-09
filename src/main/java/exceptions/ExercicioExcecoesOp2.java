package exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExercicioExcecoesOp2 {


    public static void main(String[] args) {
        List<String> cidades = Arrays.asList("Porto Alegre"
                , "São Paulo"
                , "Rio de Janeiro"
                , "Curitiba"
                , "Cuiabá"
                , "São Luís");

        int tamanhoDaLista = cidades.size() - 1;


//        int opcao = -1;
        boolean loop = true;
        while (loop) {

            try (Scanner scanner = new Scanner(System.in)) {
                int opcao = -1;
                imprimeLista(cidades, tamanhoDaLista);
                System.out.println("Digite numero da cidade");

                opcao = scanner.nextInt();
                validarEntrada(tamanhoDaLista, opcao);
                System.out.println(cidades.get(opcao));
                    break;
//                loop = false;
            } catch (PosicaoInvalidaException | NoSuchElementException e) {
                System.out.println("Opção inválida.\n");
            }
        }


    }

    private static void imprimeLista(List<String> cidades, int tamanhoDaLista) {
        for (int i = 0; i <= tamanhoDaLista; i++) {
            System.out.printf("%d - %s\n", i, cidades.get(i));
        }
        System.out.println();
    }

    private static void validarEntrada(int tamanhoDaLista, int opcao) throws PosicaoInvalidaException {

        if (opcao < 0 || opcao > tamanhoDaLista) {

            PosicaoInvalidaException e = new PosicaoInvalidaException("Op invalida.");

            throw e;
        }

    }

}
