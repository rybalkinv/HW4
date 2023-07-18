package HW4.gb;

public interface GBList<T> extends Iterable<T> {
    GBList<T> add(T t);
    GBList<T> add(int i, T t);
    void remove(int i);
    T get(int i);
    int size();
    void update(int i, T t);
}