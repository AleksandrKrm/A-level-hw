package kramarenko.hw16.task3;

import java.util.Iterator;

class IteratorForArray
{
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };

        Iterator<Integer> iterator = new Iterator<Integer>()
        {
            private int i = 0;

            @Override
            public boolean hasNext() {
                return arr.length > i;
            }

            @Override
            public Integer next() {
                return Integer.valueOf(arr[i++]);
            }
        };

        iterator.forEachRemaining(System.out::println);
    }
}