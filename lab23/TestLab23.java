package mirea.lab23;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestLab23 {
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> arrayList = new java.util.ArrayList();
        for (int i = 0; i < 10; i++){
            arrayList.add(random.nextInt(10));
        }

        List<Integer> linkedList = new java.util.ArrayList();

        for (int i = 0; i < 10; i++){
            linkedList.add(random.nextInt(10));
        }

        ArrayList<Integer> newArrayList = new ArrayList<>(2);

        newArrayList.add(0);
        newArrayList.add(1);
        newArrayList.add(2);
        newArrayList.add(3);
        newArrayList.add(4);
        newArrayList.add(5);
        newArrayList.add(15);
        newArrayList.add(10);
        newArrayList.add(11);
        newArrayList.add(15);
        newArrayList.add(10);

        System.out.println("newArrayList: " + newArrayList);
        System.out.println("size: " + newArrayList.size());
        System.out.println("capacity: " + newArrayList.capacity());
        System.out.println("isEmpty: " + newArrayList.isEmpty());
        System.out.println("contains 1: " + newArrayList.contains(1));
        System.out.println("contains 100: " + newArrayList.contains(100));

        Object[] array = newArrayList.toArray();

        System.out.println("convert to array: " + Arrays.toString(array));

        newArrayList.remove(3);

        System.out.println("element at index 3 was deleted: " + newArrayList);

        Integer num = 15;

        newArrayList.remove(num);

        System.out.println("15 was deleted: " + newArrayList);

        System.out.println("index of 10: " + newArrayList.indexOf(10));
        System.out.println("last index of 15: " + newArrayList.lastIndexOf(10));
        System.out.println("index of 124: " + newArrayList.indexOf(124));

        System.out.println("sublist: " + newArrayList.subList(0, 5));

        System.out.println(newArrayList);

        newArrayList.add(1, 17);

        System.out.println("Add to 17 to 1 index: " + newArrayList);

        newArrayList.set(4, 20);

        System.out.println("set 20 to index 4: " + newArrayList);

        List<Integer> someNums = new java.util.ArrayList();

        someNums.add(4);
        someNums.add(7);

        newArrayList.addAll(someNums);
        newArrayList.add(7);

        System.out.println("add 4 7 7: " + newArrayList);

        someNums.add(1);

        newArrayList.removeAll(someNums);

        System.out.println("remove 4 7: " + newArrayList);

        someNums.add(5);
        someNums.add(10);

        newArrayList.retainAll(someNums);

        System.out.println("retain 4 7 1 5 10: " + newArrayList);

        System.out.print("print with foreach: ");

        for (Integer number : newArrayList){
            System.out.print(number + " ");
        }

        System.out.println();

        newArrayList.clear();

        System.out.println("Clear list: " + newArrayList);
    }
}
