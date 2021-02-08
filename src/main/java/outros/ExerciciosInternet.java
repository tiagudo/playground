package outros;

public class ExerciciosInternet {
    public static void main(String[] args) {
//            countTrue ([true, false, false, true, false]);

        System.out.println(countTrue(new boolean[]{true, false, false, true, false}));

    }

    private static int countTrue(boolean[] array) {
        int count;
        count = 0;
        for (boolean item : array ){
            if (item) count++;
        }
        return count;
    }
}
