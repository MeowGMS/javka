package ru.mirea.lab10_11;
import java.util.HashMap;
import java.util.HashSet;

import java.io.*;

import static ru.mirea.lab10_11.Solution.newHashMap;
import static ru.mirea.lab10_11.Solution.newHashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("-----------------1-------------------");
        System.out.println();
        int ex1_1[] = {1, 2, 3, 4, 5};
        String ex1_2[] = {"One", "Two", "Three", "Four", "Five"};
        ExampleClass ex1_list = new ExampleClass();
        for (int i = 0; i < 5; i++) {
            ex1_list.ex1_method(ex1_1[i]);
        }
        ex1_list.getList();
        System.out.println();

        ex1_list = new ExampleClass();
        for (int i = 0; i < 5; i++) {
            ex1_list.ex1_method(ex1_2[i]);
        }
        ex1_list.getList();

        System.out.println();
        System.out.println("-----------------2-------------------");
        System.out.println();

        ex1_list = new ExampleClass();
        ex1_list.ex1_method(1);
        ex1_list.ex1_method("Two");
        ex1_list.ex1_method(3.0);
        ex1_list.getList();

        System.out.println();
        System.out.println("-----------------3-------------------");
        System.out.println();

        System.out.println(ex1_list.getElement(1));

        System.out.println();
        System.out.println("-----------------4-------------------");
        System.out.println();

        ex1_list = new ExampleClass();
        String way = "C:\\Users\\pasha\\OneDrive\\Desktop\\Files\\Study\\Java\\IdeaProjects\\lab10_11\\src\\ru\\mirea\\lab10_11\\ex4.txt";
        BufferedReader in = new BufferedReader(new FileReader(way));
        String line = in.readLine();
        int i = 0;
        while(i != 5) {
            ex1_list.ex1_method(line);
            line = in.readLine();
            i++;
        }
        in.close();
        ex1_list.getList();

        System.out.println();
        System.out.println("-------------5 (11 lab)---------------");
        System.out.println();

        Solution ex5 = new Solution();
        HashSet<String> ex5_1 = newHashSet(ex5.newArrayList());
        System.out.println(ex5_1);
        HashMap<String, String> ex5_2 = newHashMap(ex5.newArrayList(), new String[]{"2", "2", "2", "2", "5", "2"});
        System.out.println(ex5_2);
    }
}
