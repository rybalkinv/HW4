package HW4.gb.list;

public class GBNode<T> {
    public T data;
    public GBNode<T> prev;
    public GBNode<T> next;

    public GBNode(T data, GBNode<T> prev, GBNode<T> next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public GBNode(T data) { this(data, null, null); }

    @Override
    public String toString() {
        return data.toString();
    }
}