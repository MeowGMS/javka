package mirea.lab25;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey(){
        Scanner sc = new Scanner( System.in );

        System.out.print("Введите ключ: ");

        String key = sc.nextLine();

        boolean keyWasEntered = false;

        while (!keyWasEntered) {
            try {
                printDetails(key);
                keyWasEntered = true;
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                System.out.print("Введите новый ключ: ");
                key = sc.nextLine();
            }
        }
    }

    private void printDetails(String key) throws Exception {
        System.out.println(getDetails(key));
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception("Введите валидный ключ");
        }

        return "data for " + key;
    }
}

