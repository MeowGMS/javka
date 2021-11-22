package mirea.lab26;

import java.util.*;

public class TestLab26 {
    public static void main(String[] args) {
        TestLab26.firstTask();

        UpdatedArray<Object> array = new UpdatedArray<>(10);

        TestLab26.secondTask(array);
        TestLab26.thirdTask(array);
        TestLab26.fourthTask(array);
    }

    private static void firstTask() {
        int size = 5;

        Integer[] nums = new Integer[size];

        for (int i = 0; i < size; i++){
            nums[i] = i * i;
        }

        System.out.println("Задание 1");
        System.out.println("Массив чисел: " + Arrays.toString(nums));
        System.out.println("Список чисел: " + UpdatedArray.toList(nums));

        String[] stringArray = new String[size];

        Scanner scanner = new Scanner(System. in);

        for (int i = 0; i < size; i++){
            String inputString = scanner.nextLine();

            stringArray[i] = inputString;
        }

        List<String> stringList = UpdatedArray.toList(stringArray);

        System.out.println("Массив строк: " + Arrays.toString(stringArray));
        System.out.println("Список строк: " + stringList);
    }

    private static void secondTask(UpdatedArray<Object> array) {
        System.out.println("\nЗадание 2");

        array.fill(10);
        array.set(5, new ArrayList<>());
        array.set(8, new ArrayList<>());
        array.set(3, "anime");
        array.set(4, 1);

        System.out.println(array);
    }

    private static void thirdTask(UpdatedArray<Object> array) {
        System.out.println("\nЗадание 3");

        System.out.println("array[2]=" + array.get(2));
    }

    private static void fourthTask(UpdatedArray<Object> array) {
        System.out.println("\nЗадание 4");

        System.out.println(array.first(5));
    }
}

