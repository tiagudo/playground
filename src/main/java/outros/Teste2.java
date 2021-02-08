package outros;

import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {

        String teste = inputText();

        result(teste);

    }

    private static String inputText() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String teste = in.nextLine();
        return teste;
    }

    private static void result(String teste) {
        char[] str = teste.toCharArray();
//        System.out.println(str);

        for (char ch : str
        ) {

            if (Character.isDigit(ch)){
                System.out.print(ch + " - ");
            }
        }
    }
}