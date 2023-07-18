package HW4.gb.list;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {
    private GBNode<T> current;

    public LinkedListIterator(GBNode<T> current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T res = current.data;
        current = current.next;
        return res;
    }
}