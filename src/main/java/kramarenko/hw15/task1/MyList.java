package kramarenko.hw15.task1;
import java.util.List;

public class MyList<E> {

    private MyNode<E> head;
    private MyNode<E> tail;

    public static class MyNode<E> {
        private MyNode<E> next;
        private MyNode<E> prev;
        private final E value;
        public MyNode(E value) {
            this.value = value;
        }
    }

    public void add(E value) {
        MyNode<E> myNode = new MyNode<>(value);
        if (head == null) {
            head = myNode;
        } else {
            MyNode<E> next = head.next;
            if (next == null) {
                myNode.prev = head;
                head.next = myNode;
                } else {
                while ( next.next != null ) {
                    next = next.next;
                }
                next.next = myNode;
                myNode.prev = next;
            }
        }
        tail = myNode;
    }

    public E getFromLast(E value) {
        if (tail == null) {
            return null; // if 0 elements
        } else if (tail == head) {
            return tail.value; // if more elements
        }

        MyNode<E> previous = tail.prev;
        if (previous.value.equals(value)) {
            return previous.value;
        } else {
            while (previous.value != null) {
                if (previous.value.equals(value)) {
                    return previous.value;
                }
                previous = previous.prev;
            }
        }
        return null;
    }
}
