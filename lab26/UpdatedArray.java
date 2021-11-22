package mirea.lab26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UpdatedArray<T> {
    private int size;

    private Object[] data;

    public UpdatedArray(int capacity) {
        this.size = capacity;

        data = new Object[this.size];
    }

    public void set(int index, T element){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        data[index] = element;
    }

    public T get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

        return (T) data[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public void fill(int max){
        Random random = new Random();

        for (int i = 0; i < size; i++){
            data[i] = random.nextInt(max);
        }
    }

    public List<T> first(int size) {
        List<T> res = new ArrayList<>();

        for (int i = 0; i < size; i++){
            res.add((T) data[i]);
        }

        return res;
    }

    public static <T> List<T> toList(T[] array){
        List<T> list = new ArrayList<>();

        for (T elem : array){
            list.add(elem);
        }

        return list;
    }
}
