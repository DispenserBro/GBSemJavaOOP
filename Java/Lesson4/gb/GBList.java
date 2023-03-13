package Lesson4.gb;

public interface GBList<T> extends Iterable<T> {
    boolean add(T t);
    void remove(int i);
    T get(int i);
    int size();
    void update(int i, T t);
}
