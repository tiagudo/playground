package collections.pratica2;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PraticaFileReader {
    public static void main(String[] args) throws IOException {
/*        long lines = 1;
        BufferedReader reader = new BufferedReader
                (new FileReader("src/main/resources/listaProdutos.txt"));
        while (reader.readLine() != null) {
//            System.out.println(lines + reader.toString());
            System.out.println(lines);
            lines ++;
        }

        System.out.println(lines);*/
        String[] nomes1 = {"Tiago", "Mariana", "Julia", "Pedro", "Luisa", "Frida"};

        String nomes2 = "Tiago, Mariana, Julia, Pedro, Luisa, Frida";
        String[] nomes3 = nomes2.split(",", 2);

//        System.out.println(Arrays.toString(nomes3));

        List<String> nameList = Arrays.asList(nomes3);
        System.out.println(nameList.toString());


//        System.out.println(nomes.length());
//        for (int i = 6; i > 0; i--) {

//            for (String ret: nomes3) {
//                System.out.println(ret.trim());
//            }
//
//            System.out.println();
//        }

    }
}
