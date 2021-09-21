package kramarenko.hw15.task2;

import java.util.Comparator;
import java.util.Set;

public class Box{
    private int value;

    public Box(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void fillingBox(Set<Box> box) {
        box.add(new Box(3));
        box.add(new Box(1));
        box.add(new Box(0));
        box.add(new Box(2));
        box.add(new Box(5));
    }

    static class BoxComparator implements Comparator<Box> {
        public int compare(Box n1, Box n2) {
            if (n1.value == 0 || n2.value == 0) {
                if (n1.value == 0) {
                    return -1;
                } else return 1;
            }
            return Integer.compare(n2.value, n1.value);
        }
     }
    }