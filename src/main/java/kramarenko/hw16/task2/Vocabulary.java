package kramarenko.hw16.task2;

import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class Vocabulary {
    public static void main(String[] args) {
        String anything = " Any text, , , !!  ";
        text(anything);
    }

    public static void text(String anything) {
        String[] string =
                anything.replaceAll("[^ -+=.^:!,a-zA-Zа-яA-ЯёЁ]", " ")
                .split(" +");
        Map<String, Integer> treeMap = new TreeMap<>();
        for (String value : string) {
            Integer count = treeMap.get(value);
            if (count == null) {
                count = 0;
            }
            treeMap.put(value, ++count);
        }
        treeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
