package kramarenko.hw17.task1;
import java.util.stream.Stream;
import java.util.Arrays;
public class Sort {
public static void main(String[] args) {
    String[] text = {"Hello World", "How are you", "Barcelona"};
    sortArray(text);
}
    public static void sortArray(String[] text){
    Arrays.stream(text).sorted().forEach(x -> System.out.println(x));
    }
}

