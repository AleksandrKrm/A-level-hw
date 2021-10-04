package kramarenko.hw17.task4;
import java.util.*;
public class MinValue {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 45, 3, 7, 100 );
        list.stream().reduce(Integer :: min).ifPresent(s -> System.out.println(s));
    }
}