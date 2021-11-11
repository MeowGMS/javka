package mirea.prac8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<T> implements IWaitList<T> {
    protected ConcurrentLinkedQueue<T> content;

    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    public WaitList(Collection<T> c){
        content = new ConcurrentLinkedQueue<>();

        content.addAll(c);
    }

    @Override
    public void add(T element) {
        content.add(element);
    }

    @Override
    public T remove() {
        return content.remove();
    }

    @Override
    public boolean contains(T element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<T> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return content.toString();
    }
}
