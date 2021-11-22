package mirea.lab24;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class TestLab24 {
    private static final String filePath = "src\\mirea\\lab24\\text.txt";

    public static void main(String[] args) {
        System.out.println("Программа по добавлению текста в файл!\n");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("a - добавить\nr - перезаписать\nc - закрыть\n");

            String decision = sc.nextLine();

            boolean appendText;

            if (decision.equals("a")) {
                appendText = true;
            } else if (decision.equals("r")) {
                appendText = false;
            } else if (decision.equals("c")) {
                break;
            } else {
                continue;
            }

            System.out.print("Введите текст: ");

            String text = sc.nextLine();

            try {
                FileWriter fileWriter = new FileWriter(filePath, appendText);
                fileWriter.write(text);
                fileWriter.append('\n');
                fileWriter.flush();

                System.out.println("Вы записали файл");
            } catch (IOException e) {
                System.out.println("Ошибка при открытии файла");
            }
        }

        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));

            for (String line : lines){
                if (line.equals("\n")) continue;

                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
