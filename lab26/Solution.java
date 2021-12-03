package ru.mirea.lab10_11;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    public <T> String[] newArrayList() {
        String list[] = {"One", "Two", "Three", "Four", "Five", "Five"};
        return list;
    }

    public static <T> HashSet<T> newHashSet(T[] arr){
        if(arr == null)
            throw new IllegalArgumentException("Null array!");
        HashSet<T> hash = new HashSet<>(arr.length);
        for (T element : arr) {
            hash.add(element);
        }
        return hash;
    }

    public static <K, V> HashMap<K, V> newHashMap(K[] arr, V[] vArr){
        if(arr == null || vArr == null)
            throw new IllegalArgumentException("Null array!");
        if(vArr.length < arr.length)
            throw new IllegalArgumentException("Array of values less than array of keys");
        HashMap<K, V> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], vArr[i]);
        }
        return map;
    }
}
