package wrapperclasses;

public class ExercicioWrapperClasses {
    public static void main(String[] args) {

        /*
        Crie uma função que recebe uma classe Character (pressupondo que seja uma letra maiúscula)
        e converta a mesma para minúscula.
         */


        String letraC = converteEmMinuscula('C');
        System.out.println(letraC);
//        System.out.println(Character.toString(99));
//        System.out.println(Character.toChars(97));

        String letraD = converteEmMinuscula(Character.valueOf('D'));
        System.out.println(letraD);
    }

    public static String converteEmMinuscula(Character letra) {
//        int a = (int) letra;
//        a = a + 32;


        // se letra é Character por que letter.- não tem os
        // mesmos metodos de Character.- ??

//        return Character.toString(Character.toLowerCase(letra));//???? Não vale: String.toLowerCase()     // SOL 1
        return String.valueOf((char) ((int)letra + 0x20));                                                  // SOL 2


    }


}
