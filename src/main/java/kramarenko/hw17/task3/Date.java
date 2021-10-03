package kramarenko.hw17.task3;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.time.LocalDate;
public class Date {
    public static void main(String[] args) {
        List<String> date = new ArrayList<>();
        date.add("01/11/2021");
        date.add("03/06/1991");
        date.add("05/03/1985");
        date.add("10/07/1990");
        date.add("15/04/2020");
      check(date);
              }
              public static void check(List<String> date){
                  DateTimeFormatter timeForm = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                  System.out.println(date.stream()
                          .map(x -> LocalDate.parse(x, timeForm))
                          .anyMatch(y -> y.getYear() == 2021));
              }
    }
