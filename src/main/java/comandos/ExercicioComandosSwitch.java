package comandos;

import java.util.Scanner;

public class ExercicioComandosSwitch {
    public static void main(String[] args) {
        System.out.println("Digite a calssificação do produto: ");
        Scanner input = new Scanner(System.in);

        int nota = input.nextInt();

        switch (nota) {
            case 0:
            case 1:
                System.out.println("Péssimo");
                break;
            case 2:
                System.out.println("Ruim");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Bom");
                break;
            case 5:
                System.out.println("Ótimo");
                break;
            default:
                System.out.println("Fora do padrão");

        }
    }
}
