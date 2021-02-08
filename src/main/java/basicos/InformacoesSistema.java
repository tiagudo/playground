package basicos;


public class InformacoesSistema {

    // atalho psvm
    public static void main(String[] args) {

        // atalho sout
        System.out.println("Processadores disponíveis: ");
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.printf("Processadores disponíveis: %d \n", Runtime.getRuntime().availableProcessors());

        System.out.println("Memoria maxima disponível: ");
        System.out.printf("%d MB \n", Runtime.getRuntime().totalMemory()/1024/1024);

        System.out.println("Memoria maxima disponível: ");
        System.out.printf("%d MB \n", Runtime.getRuntime().maxMemory()/1024/1024);
    }

}
