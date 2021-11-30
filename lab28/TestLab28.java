package mirea.lab28;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class TestLab28 {
  public static void main(String[] args) {
//    TestLab28.task1();
//    TestLab28.task2();
//    TestLab28.task3();
//    TestLab28.task4();
//    TestLab28.task5();
//    TestLab28.task6();
//    TestLab28.task7();
  }

  private static void task1() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите строку: "); // a + b - c * d / e < f > g >= h <= i == j
    String strToRegexp = scanner.nextLine();

    System.out.print("Введите regexp: "); // ((?<=[<=|>=|==|\\+|\\*|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\-|<|>|/|=]))
    String regexpStr = scanner.nextLine();

    System.out.println("Результат: " + Arrays.toString(strToRegexp.split(regexpStr)));
  }

  private static void task2() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите строку: ");
    String strToCheck = scanner.nextLine();

    Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
    Matcher m1 = p1.matcher(strToCheck);

    System.out.println("Результат: " + m1.matches());
  }

  private static void task3() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите цену: ");
    String strToCheck = scanner.nextLine();

    String regex = "(\\d+)\\.(\\d{2}+) (EUR|RUB|USD)";

    Pattern p1 = Pattern.compile(regex);
    Matcher m1 = p1.matcher(strToCheck);

    while (m1.find()) {
      System.out.println("Price: " + m1.group());
    }
  }

  private static void task4() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите выржание: ");
    String strToCheck = scanner.nextLine();

    String regex = "[0-9]+[ ]*[+]";

    Pattern p1 = Pattern.compile(regex);
    Matcher m1 = p1.matcher(strToCheck);

    System.out.println("Результат: " + m1.find());
  }

  private static void task5() {
    System.out.println(checkDate("21/02/1233"));
    System.out.println(checkDate("30/04/9000"));
    System.out.println(checkDate("12/02/2131"));
    System.out.println(checkDate("3/02/2001"));
    System.out.println(checkDate("30-04-2003"));
    System.out.println(checkDate("1/1/1899"));
  }

  private static boolean checkDate(final String dateAsString) {
    Pattern p = Pattern.compile("^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$");
    Matcher m = p.matcher(dateAsString);

    return m.matches();
  }

  private static void task6() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите почту: ");
    String strToCheck = scanner.nextLine();

    Pattern p = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
    Matcher m = p.matcher(strToCheck);

    System.out.println("Результат: " + m.find());
  }

  private static void task7() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите пароль: ");
    String strToCheck = scanner.nextLine();

    Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[\\w]{8,}$");
    Matcher m = p.matcher(strToCheck);

    System.out.println("Результат: " + m.find());
  }
}
