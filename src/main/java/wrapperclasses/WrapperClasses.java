// unboxing e autoboxing

// quando for usar collections e Generics
// quando quiser usar métodos
//

//     int[] numeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
//    115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97,
//    111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97,
//    33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115,
//     32, 100, 101, 109, 97, 105, 115, 32, 58, 41};

package wrapperclasses;

public class WrapperClasses<letraC> {

    public static void main(String[] args) {

        exercicio1();

    }

    private static void exercicio1() {
        int[] numeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
                115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97,
                111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97,
                33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115,
                32, 100, 101, 109, 97, 105, 115, 32, 58, 41};

//        solucao1(numeros);

        solucao2(numeros);
    }

    private static void solucao1(int[] numeros) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numeros.length; i++) {
//            sb.append(Character.toString(numeros[i]));
            sb.append(Character.toChars(numeros[i]));
//            sb.append((char)numeros[i]);
        }

        System.out.println(sb.toString());
    }

    private static void solucao2(int[] numeros) {
        for (int numero : numeros) {
            System.out.print((char) numero);
        }
    }


}
