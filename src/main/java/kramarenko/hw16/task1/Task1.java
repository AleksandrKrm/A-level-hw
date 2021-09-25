package kramarenko.hw16.task1;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arraysList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.print("ArrayList method ");
        add(arraysList);

        System.out.print("Get method from ArrayList ");
        get(arraysList);

        System.out.print("LinkedList method ");
        add(linkedList);

        System.out.print("Get method from LinkedList ");
        get(linkedList);
    }

    static void add(List<Integer> addTime) {
        long timeStart = System.currentTimeMillis();
        for (int a = 0; a < 1000000; a++) {
            addTime.add(a);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time is : " + (endTime - timeStart) + "ms");
    }

    static void get(List<Integer> time) {
        long startTime = System.currentTimeMillis();
        for (Integer ignored : time) {
            int b = new Random().nextInt(100000);
            time.get(b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Result is - : " + (endTime - startTime) + "ms");
    }
}