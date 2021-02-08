package comandos;

import java.util.Scanner;

public class ExemploComandosIteracao {
    public static void main(String[] args) {
        // laços infinitos
        // while (true) {}
        // for (;;) {}

        // praticaLacos();

        // ---------- exercicio 1 - SOMA 1 a 1000 ----------

        somaCem();

        // ---------- exercicio 2 - MULTIPLOS 3 ----------

//        multiplos3();

        // ---------- exercicio 4 - FATORIAIS ----------

//        fatorial();

        // ---------- exercicio 3 - MENOR Nº da LISTA ----------
        // 3. Encontre o menor número da lista a seguir: 88, 7, 0, -1, 45, 3, 92, -9, 300000001,12, 23567 utilizando for ou while .

//        ordemArray();

    }

    private static void praticaLacos() {
        int count = 0;

        System.out.println("LOOP FOR");
        for (count = 150; count <= 300; count++) {
            System.out.print(count + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        System.out.println("LOOP WHILE");
        count = 150;
        while (count <= 300) {
            System.out.print(count + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
            //System.out.println();
            count++;

        }

        System.out.println();

        System.out.println("LOOP DO WHILE");
        count = 150;

        do {
            System.out.print(count + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
            count++;
        } while (count <= 300);
    }

    private static void somaCem() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {

            sum = sum + i;
            System.out.println(sum + " ");

        }
    }

    private static void multiplos3() {
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void ordemArray() {

        int[] lista = new int[] {7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567};

        //System.out.println(lista[2]);

//        int min = lista[0];
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
            if (min > lista[i]) {
                min = lista[i];
            }
        }
        System.out.println();
        System.out.println("Menor valor da lista: " + min + ".");
    }

    private static void fatorial() {
        Scanner in = new Scanner(System.in);

        System.out.println("Entre um número: ");

        int n = in.nextInt();

        System.out.println("Com FOR");
        System.out.printf(">> %d!: \n", n);
        long fatFor = 1;
        for (int countFor = 1; countFor <= n; countFor++) {

            fatFor = fatFor * countFor;

            System.out.print(fatFor);

            if (countFor < n) {
                System.out.print(" - ");
            }
        }

        System.out.println();
        System.out.println();


        System.out.println("Com WHILE");
        System.out.printf(">> %d!: \n", n);

        int countWhile = 1;
        long fatWhile = 1;
        while (countWhile <= n) {
            fatWhile = fatWhile * countWhile;
            System.out.print(fatWhile);

            if (countWhile < n) {
                System.out.print(" - ");
            }

            countWhile++;

        }

        in.close();
    }
}
