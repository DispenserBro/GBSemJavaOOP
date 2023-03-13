package Lesson4.gb.list;

import Lesson4.gb.GBList;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class GBArrayList<T> implements GBList<T> {

    private T[] values;

    public GBArrayList() {
        this.values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T t) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = t;

            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int i) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, i);
            int amountAfterIndex = temp.length - i - 1;
            System.arraycopy(temp, i + 1, values, i, amountAfterIndex);
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public T get(int i) {
        return values[i];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int i, T t) {
        values[i] = t;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }
}
