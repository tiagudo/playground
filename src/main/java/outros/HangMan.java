package outros;

import java.io.IOException;
import java.util.Scanner;

public class HangMan {
    public static void main(String[] args) throws IOException {

        int mistakeCount = 0;
        final int MAX_MISTAKES = 7;
        clearScreen();
        System.out.println("- - - - - FORCA - - - - -");

        String secretWord = enterSecretWord();

        String answer = initializeAnswer(secretWord);

        while (mistakeCount < MAX_MISTAKES) {

            clearScreen();
            printHangMan(mistakeCount);
            System.out.println(answer);
            char letter = inputGuess();

            if (!verifyLetterInSecret(secretWord, letter)) {
                System.out.println("Errou");
                mistakeCount++;

            } else {
                System.out.println("Acertou!");
                answer = insertLetterInAnswer(answer, secretWord, letter);
                System.out.println(answer);
                if (answer.equalsIgnoreCase(secretWord)) {
                    System.out.println("Você GANHOU!");
                    printGameOver();
                    return;
                }
            }
        }

        clearScreen();

        printHangMan(mistakeCount);

        System.out.println("Você PERDEU!");
        System.out.printf("A palavra era: %s\n\n", secretWord);

        printGameOver();
    }

    private static void printGameOver() {
        System.out.println("\u001b[7m ***** GAME OVER ***** \u001b[m");
    }

    private static void clearScreen() {
        final String ANSI_CLS = "\u001b[2J";
        final String ANSI_HOME = "\u001b[H";
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
    }

    private static String enterSecretWord() {
        System.out.println("Digite palavra secreta: ");
        return new Scanner(System.in).nextLine().toUpperCase();
    }

    private static String initializeAnswer(String secret) {

        StringBuilder sb1 = new StringBuilder();
        char character;

        for (int position = 0; position < secret.length(); position++) {

            character = secret.toUpperCase().charAt(position);

            if (character == '-') sb1.append("-");
            else sb1.append("_");

        }
        return sb1.toString();
    }

    private static char inputGuess() {
        String guess = "";
        do {
            System.out.println("Digite uma letra: ");
            guess = new Scanner(System.in).nextLine().toUpperCase();
        } while (guess.isBlank());

        return guess.charAt(0);

    }

    private static boolean verifyLetterInSecret(String secret, char letra) {
        boolean isInSecretWord = false;
        char letterSecret;

        for (int position = 0; position < secret.length(); position++) {
            letterSecret = secret.toUpperCase().charAt(position);
            if (letra == letterSecret) {
                isInSecretWord = true;
                break;
            }
        }
        return isInSecretWord;
    }

    private static String insertLetterInAnswer(String answer, String secret, char letterGuess) {
        StringBuilder sb = new StringBuilder();
        char letterSecret, letterAnswer;

        for (int position = 0; position < secret.length(); position++) {

            letterSecret = secret.charAt(position);
            letterAnswer = answer.charAt(position);

            if (letterSecret == letterAnswer) sb.append(letterAnswer);

            else if (letterSecret == letterGuess) sb.append(letterGuess);

            else sb.append(answer.charAt(position));

        }
        return sb.toString();
    }

    private static void printHangMan(int erros) {

        switch (erros) {

            case 0:
                System.out.println("\t__________");
                System.out.println("\t  |     |");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t----------");
                break;

            case 1:
                System.out.println("\t__________");
                System.out.println("\t  |     |");
                System.out.println("\t  |     0");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t----------");
                break;
            case 2:
                System.out.println("\t__________");
                System.out.println("\t  |     |");
                System.out.println("\t  |     0");
                System.out.println("\t  |     |");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t----------");
                break;

            case 3:
                System.out.println("\t__________");
                System.out.println("\t  |     |");
                System.out.println("\t  |     0");
                System.out.println("\t  |    /|");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t----------");
                break;

            case 4:
                System.out.println("\t__________");
                System.out.println("\t  |     |");
                System.out.println("\t  |     0");
                System.out.println("\t  |    /|\\");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t----------");
                break;

            case 5:
                System.out.println("\t__________");
                System.out.println("\t  |     |");
                System.out.println("\t  |     0");
                System.out.println("\t  |    /|\\");
                System.out.println("\t  |     0");
                System.out.println("\t  |");
                System.out.println("\t  |");
                System.out.println("\t----------");
                break;

            case 6:
                System.out.println("\t__________");
                System.out.println("\t  |     |");
                System.out.println("\t  |     0");
                System.out.println("\t  |    /|\\");
                System.out.println("\t  |     0");
                System.out.println("\t  |   _/");
                System.out.println("\t  |");
                System.out.println("\t----------");
                break;

            case 7:
                System.out.println("\t__________");
                System.out.println("\t  |     |");
                System.out.println("\t  |     0");
                System.out.println("\t  |    /|\\");
                System.out.println("\t  |     0");
                System.out.println("\t  |   _/ \\_");
                System.out.println("\t  |");
                System.out.println("\t----------");
                break;

        }
    }
}

