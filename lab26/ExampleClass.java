package ru.mirea.lab10_11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExampleClass<E,T> {
    ArrayList<T> ex_arr = new ArrayList<>();
    ExampleClass() {

    }
    public ArrayList ex1_method(E arr) {
            ex_arr.add((T)arr);
        return ex_arr;
    }
    public void getList() {
        System.out.println(ex_arr.toString());
    }
    public T getElement(int index) {
        int i = 0;
        while (i<index)
            i++;
        return  ex_arr.get(i);
    }
}
