package kramarenko.hw1;
import java.util.*;
import java.text.*;

public class task1 {

    public static void main(String[] args) {
        String firstName = "Aleksandr";
        String studentLastname = "Kramarenko";
        Date curDateTime = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd '-' hh:mm:ss a zzz");
        System.out.println("Student name: " + firstName +
                "\nStudent lastname: " + studentLastname +
                //"\nCurrent date and time: " + curDateTime);
                "\nCurrent date and time: " + formatForDateNow.format(curDateTime));

        Scanner keyInput = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = keyInput.nextInt();
        String reverseNumb = "";
        for(int i = String.valueOf(number).length() - 1; i >= 0; i--) {
            reverseNumb = reverseNumb + String.valueOf(number).substring(i,i+1);
        }
        System.out.println("Reverse number: " + reverseNumb);
        keyInput.close();
    }
}