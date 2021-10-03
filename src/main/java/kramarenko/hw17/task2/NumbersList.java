package kramarenko.hw17.task2;
import java.util.ArrayList;
import java.util.List;
import java.util.IntSummaryStatistics;

public class NumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(15);
        numbers.add(9);
        numbers.add(200);
        numbers.add(500);
        statistic(numbers);
    }
    public static void statistic(List<Integer> list) {
        IntSummaryStatistics statistics = list.stream()
                .filter(x -> x >= 0)
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println(statistics);
    }

}
