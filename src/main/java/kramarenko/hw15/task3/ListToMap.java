package kramarenko.hw15.task3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class ListToMap {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        String firstLine = "text";
        String secondLine = "anything ";
        String thirdLine = "example ";
        String fourthLine = " abcd";
        String fifthLine = "xyz";
        list.add(firstLine);
        list.add(secondLine);
        list.add(thirdLine);
        list.add(fourthLine);
        list.add(fifthLine);
         Map<String, Integer> map = listToMap(list);
        System.out.println(map);
    }

    public static Map<String, Integer> listToMap(List<String> list) {
        if (list == null) {
            return null;
        }
        Map<String, Integer> map = new HashMap<>(list.size());
        for (String string : list) {
            if (string != null) {
                map.put(string, string.length());
            }
        }
        return map;
    }
}

