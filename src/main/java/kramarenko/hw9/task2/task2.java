package kramarenko.hw9.task2;

public class task2 {
    private static final int NUMBER = 2;
    private static final int POW = 5;


    static Pow exponentiation = (x, y) -> {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            @@ -11,6 +15,6 @@
        };

        public static void main(String[] args) {
            System.out.println(exponentiation.pow(2, 5));
            System.out.println(exponentiation.pow(NUMBER, POW));
        }
    }
}

