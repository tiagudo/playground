package strings;

import java.util.Scanner;

public class PraticaString {
    public static void main(String[] args) {

//Tipos primitivos (os 8 que existem): pode comparar com ==, ele compara o conteúdo
        //Para comparar outros tipos "por referência", use equals!
        //Strings comparadas com ==, compara endereço de memória! não use exceto se souber o que está fazendo!
        //Para comparar conteúdo de Strings, use equals OU compareTo.


//        exercicioSplit();

//        exercicioSubstring();

//        exercicioToCase();

//        exercicioIndexOf();

//        exercicioTrimEquals();

        // pratica builder
        //Dentro de um método use StringBuilder
        //StringBuilder builder = new StringBuilder();
//        builder.append("Itens: ");
//        for(int i = 0; i< 10;i++){
//            builder
//                    .append(i)
//                    .append("-");
//        }
//        System.out.println(builder.toString());


    }

    private static void exercicioIndexOf() {

        System.out.println("Digite texto: ");
        String texto = new Scanner(System.in).nextLine();

        if (texto.indexOf(",") == -1) {
            System.out.println(texto.substring(0));
        } else {
            System.out.println(texto.substring(0, texto.indexOf(",")));
        }
    }

    private static void exercicioSplit() {
        System.out.println("Digite texto:");
        String texto = new Scanner(System.in).nextLine();
        String[] resultado = texto.split(" ");

        for (String partes : resultado) {
            System.out.println(partes);
        }
    }

    private static void exercicioSubstring() {
        System.out.println("Digite texto:");
        String texto = new Scanner(System.in).nextLine();

        if (texto.length() < 13) {
            System.out.println(texto);
        } else {
            System.out.println(texto.substring(0, 13));
        }
    }

    private static void exercicioToCase() {
        System.out.println("Digite texto:");
        String[] texto = new Scanner(System.in).nextLine().split(" ");

        boolean flag = false;
        for (String words : texto) {

            if (!flag) {
                System.out.print(words.toUpperCase());
                flag = true;
            } else {
                System.out.print(" " + words);
            }
        }

    }

    private static void exercicioTrimEquals() {

        System.out.println("Entre seu e-mail: ");
        String email = new Scanner(System.in).nextLine().trim().toLowerCase();
        while (email.isBlank()) {
            System.out.println("É necessário informar seu e-mail: ");
            email = new Scanner(System.in).nextLine().trim();
        }

        if (email.equalsIgnoreCase("tiagudo@yahoo.com.br")) {
            System.out.printf("Bem vindo, %s!", email);
        } else {
            System.out.println("Email inválido.");
        }
    }

}
