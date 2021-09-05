package kramarenko.hw5;
import java.util.Arrays;
public class task3 {

        public static void main(String[] args) {
            int[][] bmw = new int[4][2];
            fillMatrix(bmw);
            int[][] copiedArray = changeColumnsAndRows(bmw);
            System.out.println("Source array: " + Arrays.deepToString(bmw));
            System.out.println("Modified array: " + Arrays.deepToString((copiedArray)));
        }

        public static void fillMatrix(int[][] bmw) {
            for (int i = 0; i < bmw.length; i++) {
                for (int j = 0; j < bmw[i].length; j++) {
                    bmw[i][j] = (int) (Math.random()*101);
                }
            }
        }

        public static int[][] changeColumnsAndRows(int[][] bmw) {
            int[][] array = new int[bmw[0].length][bmw.length];
            for (int i = 0; i < bmw.length; i++) {
                for (int j = 0; j < bmw[i].length; j++) {
                    array[j][i] = bmw[i][j];
                }
            }
            return array;
        }
    }

