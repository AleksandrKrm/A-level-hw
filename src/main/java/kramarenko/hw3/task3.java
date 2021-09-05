package kramarenko.hw3;
import java.util.Scanner;
public class task3 {

        public static void main(String[] args) {
            Scanner ball = new Scanner(System.in);
            String w1 = ball.nextLine();

            int count = 1;

            for (int i = 0; i < w1.length() - 1; i++)
            {
                if ((w1.charAt(i) == ' ') && (w1.charAt(i + 1) != ' '))
                {
                    count++;
                }
            }
            System.out.println("Количество слов в строке : " + count);
        }
    }

