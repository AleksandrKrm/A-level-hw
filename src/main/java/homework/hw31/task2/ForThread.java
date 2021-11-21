package homework.hw31.task2;

import java.util.ArrayList;
import java.util.List;

public class ForThread extends Thread{
    @Override
    public void run() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(5);
        integerList.add(7);
        integerList.add(11);

        System.out.println(integerList.size());
    }
}
