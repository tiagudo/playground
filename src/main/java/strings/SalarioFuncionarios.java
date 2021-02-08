

package strings;


import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class SalarioFuncionarios {
    public static void main(String[] args) throws IOException {

        funcionarios();

    }

    private static void funcionarios() throws IOException {
        Scanner sc = new Scanner(Path.of("src/main/resources/pessoas.csv"));
        StringBuilder sb1 = new StringBuilder();
        String[] info;

        float val = 0.0F;

        int count = 0;

        while (sc.hasNext()) {
            if (count == 0) {
                sc.nextLine();
                count++;
            }
            info = sc.nextLine().split(",");

            StringBuilder sbName = new StringBuilder();
            for (int i = 1; i < 5; i++) {

                switch (i) {
                    case 1:
                    case 2:
                        sbName
                                .append(info[i])
                                .append(' ');
                        break;
                    case 3:
                    case 4:
                        val += Float.parseFloat(info[i]);
                        break;
                }

            }

            sb1
                    .append(String.format("%23s", sbName.toString()))
                    .append(" -->  ")
                    .append(String.format("$ %10.2f", val))
                    .append("\n");

            count++;
        }
        System.out.println(sb1.toString());
        sc.close();
    }
}
