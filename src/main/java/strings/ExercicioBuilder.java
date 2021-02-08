package strings;

import java.util.Scanner;

public class ExercicioBuilder {

    /*
    import java.io.IOException;
    import java.nio.file.Path;
    import java.util.Scanner;

        public class ExercicioFuncionarios {

            public static void main(String[] args) throws IOException {

                Scanner sc = new Scanner(Path.of("src/main/resources/pessoas.csv"));

                boolean temNovaLinha = sc.hasNext();//Serve pra saber se há nova linha
                String linha = sc.nextLine(); // Troca e retorna a nova linha
                System.out.println(linha);
            }
    }*/


    public static void main(String[] args) {


//    exercicio 1 pratica StringBuilder

        String texto;
        texto = inputText();

        if (texto.trim().equalsIgnoreCase("sair")) {
            System.out.println("Resultado nulo");
        } else {
            System.out.print(texto.replaceAll(" sair", "."));
        }



    }

    private static String inputText() {

        StringBuilder builder = new StringBuilder();
        String texto;
//        boolean flag = false;
        do {
            System.out.println("Digite um texto: ('Sair' para sair):");

            texto = new Scanner(System.in).nextLine();

            builder.append(texto.trim()).append(" ");

        } while (!texto.equalsIgnoreCase("sair"));

        return builder.toString().trim();
    }


}
