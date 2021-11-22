package mirea.prac6;

import java.util.*;

public class TestPrac6 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int id = random.nextInt(100);

            int rangeMin = 1, rangeMax = 5;
            double gpa = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
            gpa = (double) ((int) (gpa * 10)) / 10;
            students.add(new Student(id, "Студент" + i, gpa));
        }

        System.out.println("Задание 1");
        System.out.println("Shuffled list:");

        printList(students);

        Sorting.insertionSort(students);

        System.out.println("Sorted list:");

        printList(students);

        Comparator<Student> comparator = Comparator.comparingDouble(Student::getAverageBall);

        Collections.shuffle(students);

        System.out.println("\nЗадание 2");
        System.out.println("Shuffled list:");

        printList(students);

        Sorting.quickSort(students, 0, students.size() - 1, comparator);

        System.out.println("Sorted list:");

        printList(students);

        List<Student> students2 = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            int id = random.nextInt(100);

            int rangeMin = 1, rangeMax = 5;
            double gpa = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
            gpa = (double) ((int) (gpa * 10)) / 10;
            students2.add(new Student(id, "Student" + i, gpa));
        }

        System.out.println("Задание 3");
        System.out.println("Shuffled first list:");

        printList(students);

        System.out.println("Shuffled second list:");

        printList(students2);
        students.addAll(students2);

        System.out.println("Merged list:");

        List<Student> res = Sorting.mergeSort(students);

        printList(res);
    }

    private static <T> void printList(List<T> list){
        for (T data : list){
            System.out.println(data);
        }
    }
}
