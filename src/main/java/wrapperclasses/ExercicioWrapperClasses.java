package wrapperclasses;

import javax.print.attribute.IntegerSyntax;

import static java.lang.Integer.*;

public class ExercicioWrapperClasses {
    public static void main(String[] args) {
//        char c = 'C';
//        System.out.println(Integer.valueOf(c));
        /*
        Crie uma função que recebe uma classe Character (pressupondo que seja uma letra maiúscula)
        e converta a mesma para minúscula.
         */

        String letraC = converteEmMinuscula('C');
        System.out.println(letraC);

        String letraD = converteEmMinuscula(Character.valueOf('D'));
        System.out.println(letraD);
    }

    public static String converteEmMinuscula(Character letra) {



//        System.out.println(valueOfLetter);
//        int a = (int) letra;
//        a = a + 32;
//        Character.valueOf(letra);

        // se letra é Character por que letter.- não tem os
        // mesmos metodos de Character.- ??

        Integer valueOfUpperCase = Integer.valueOf(letra);
        Integer valueOfLowerCase = valueOfUpperCase + 32;
        String s = Character.toString(valueOfLowerCase);
//
//        return Character.toString(Character.toLowerCase(letra));//???? Não vale: String.toLowerCase()     // SOL 1
//        return String.valueOf((char) ((int)letra + 0x20));                                                // SOL 2
        return s;                                                                                           // SOL 3







    }


}
