package kramarenko.hw3;
import java.util.*;
import java.util.Scanner;
public class task2 {

        public static void main(String[] args) {
            String reverse = "";

            Scanner ball = new Scanner(System.in);

            String wohoo = ball.nextLine();
            System.out.println("Before trim: \"" + wohoo + "\"");
            System.out.println("After trim: \"" + wohoo.trim() + "\"");

            int length = wohoo.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + wohoo.charAt(i);

            if (wohoo.equals(reverse))
                System.out.println(wohoo+" is a palindrome");
            else
                System.out.println(wohoo+" is not a palindrome");

        }
    }


