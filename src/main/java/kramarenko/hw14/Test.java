package kramarenko.hw14;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Util<T> implements Multiplier<T> {
    T value;


    public void printHashCode(T e) {
        System.out.println("HashCode: " + e.hashCode());
    }

    public void save(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public T[] doubleValueIn(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (Integer) array[i] * (Integer) array[i];
        }
        return (T[]) array;
    }

    public void sum(Object one, Object two) { // should work only with numbers
        System.out.println((Double) one + (Double) two);
    }

    public double sumOfArray(List<Object> list) {
        double s = 0.0;
        for (Object n : list) {
            s +=(Double) n;
        }
        return s;
    }

    public void addNumbers(List<Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }


}

interface Multiplier  <T>{
    T[] doubleValueIn(T[] array);
}

public class Test {
    public static void main(String[] args) {
        Util<String> util = new Util<>();
        util.printHashCode("Test");
        util.save("Value");
        System.out.println(util.get());
        Number[] arr = {1, 2, 3, 4, 0, 5, 6, 7};
        System.out.println(Arrays.toString(util.doubleValueIn(arr)));
        System.out.println(util.sumOfArray(Arrays.asList(arr)));
        List<Integer> list = new ArrayList<>();
        util.addNumbers(list);
        System.out.println(Arrays.toString(list.toArray()));
        util.sum(3, 5);
    }
}