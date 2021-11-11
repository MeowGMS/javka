package mirea.prac8;

public class BoundedWaitList<T> extends WaitList<T>{
    private final int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public void add(T element){
        if (content.size() >= capacity) return;

        content.add(element);
    }

    public int getCapacity() { return capacity;  }
}
