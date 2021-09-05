package kramarenko.hw10;
import java.util.Arrays;
public class Sorting {

        public static void main(String[] args) {
            int[] numbers1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int[] numbers2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
            System.out.println("Mассив numbers1 :" + System.lineSeparator() + Arrays.toString(numbers1));
            System.out.println("Массив numbers1 отсортированый по убыванию? - " + isBiggerThenPast(numbers1));
            System.out.println("Mассива numbers2 :" + System.lineSeparator() + Arrays.toString(numbers2));
            System.out.println("Массив numbers2 отсортированый по убыванию? - " + isBiggerThenPast(numbers2));
        }

        public static boolean isBiggerThenPast(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    return true;
                }
            }
            return false;
        }

    }

