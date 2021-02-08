package comandos;

import java.util.Scanner;

public class ExemploComandos {
    public static void main(String[] args) {
        System.out.println("Digite nota do aluno entre 0 e 10");
        //int nota = new Scanner(System.in).nextInt();
        Scanner input = new Scanner(System.in);
        int nota = input.nextInt();

        if (nota >= 7) {
            System.out.println("Aprovado");
        }   else {
            System.out.println("Reprovado");
        }
        input.close();
    }

}
