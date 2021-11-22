package mirea.prac9.task1;

import java.util.Scanner;

public class Task9Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ИНН: ");
        String inn = sc.next();

        if (inn.length() != 10){
            throw new INNRuntimeException("Неверный ИНН");
        }

        System.out.println("next");
    }
}
