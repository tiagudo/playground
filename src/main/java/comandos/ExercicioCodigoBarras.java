package comandos;

import java.util.Scanner;

public class ExercicioCodigoBarras {
    public static void main(String[] args) {

        String codeIn = inputBarCode();

        System.out.printf("O código digitado foi: %s", codeIn);

        int[] barCode = ingestBarCode(codeIn);

        validateBarCode(barCode);

    }

    private static String inputBarCode() {
        Scanner in = new Scanner(System.in);
        String codigoIn = "";

        while (codigoIn.length() != 22) {
            System.out.println("Digite o código de barras com 22 digitos: ");
            codigoIn = in.nextLine();
        }

        in.close();
        return codigoIn;
    }

    private static int[] ingestBarCode(String codeIn) {

        int[] barCode = new int[codeIn.length()];

        for (int i = 0; i < codeIn.length(); i++) {

            char dig = codeIn.charAt(i);

            barCode[i] = Character.getNumericValue(dig);

        }

        return barCode;
    }

    private static void validateBarCode(int[] code) {
//        int[] codigo = new int[]{0, 0, 0, 0, 0, 0, 0, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 1, 7};
        int[] codigo = code;

        if (codigo.length != 22) {

            System.out.println("Codigo tamanho inválido.");

            return;
        }

        int sum1 = 0;

        for (int i = 0; i < codigo.length - 2; i++) {

            sum1 += codigo[i];

            if (sum1 > 99) {
                sum1 -= 100;
            }

        }

        System.out.println(sum1);

        if (codigo[20] == sum1 / 10 && codigo[21] == sum1 % 10) {
            System.out.println("Codigo é valido.");
        } else System.out.println("Codgo inválido");
    }


}
