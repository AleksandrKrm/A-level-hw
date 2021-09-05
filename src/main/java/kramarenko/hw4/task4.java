package kramarenko.hw4;
import java.util.Arrays;
public class task4 {

            public static void main(String[] args) {
            int[] initialArray = new int[400];
            fillArray(initialArray);

            int[] copiedArray = Arrays.copyOf(initialArray, initialArray.length);

            System.out.println(Arrays.toString(copiedArray));
            System.out.println(Arrays.toString(replacingNumbersWithZeros(copiedArray)));
        }

        public static int[] fillArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 401);
            }
            return array;
        }

        public static int[] replacingNumbersWithZeros(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    array[i] = 0;
                }
            }
            return array;
        }
    }

