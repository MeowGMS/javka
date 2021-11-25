package mirea.prac13_14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestPrac1314 {
  public static void main(String[] args) throws ParseException {
//    TestPrac1314.task1();
//    TestPrac1314.task2();
//    TestPrac1314.task4();
//    TestPrac1314.task5();
  }

  private static void task1() {
    System.out.println("Фамилия: Молчанов");
    System.out.println("Имя: Никита");
    System.out.println("Дата и время получения задания: Tue Nov 23 17:21:39 MSK 2021");

    Date date = new Date();

    System.out.println("Время сдачи задания: " + date.toString());
  }

  private static void task2() throws ParseException {
    System.out.print("Введите дату: "); // 23/11/2021

    Scanner scanner = new Scanner(System.in);

    String strDate = scanner.nextLine();

    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
    Date curDate = new Date();

    System.out.println("Текущая дата " + (curDate.after(date) ? "позже" : "раньше") + " введенной");
  }

  private static void task4() throws ParseException {
    System.out.print("Введите дату: "); // 12:12 23/11/2021

    Scanner scanner = new Scanner(System.in);

    String strDate = scanner.nextLine();

    Date date = new SimpleDateFormat("HH:mm dd/MM/yyyy").parse(strDate);

    Calendar calendar = new GregorianCalendar();
    calendar.setTime(date);

    System.out.println("Date: " + date);
    System.out.println("Calendar: " + calendar.getWeeksInWeekYear());
  }

  private static void task5() {
    // INSERT TESTS //

    ArrayList<Integer> arrList = new ArrayList(10000);

    Date arrayInsertStart = new Date();

    for (int i = 0; i < 10000; i++) {
      arrList.add(i * i);
    }

    Date arrayInsertEnd = new Date();

    System.out.println("ArrayList set time " + (arrayInsertEnd.getTime() - arrayInsertStart.getTime()) + " ms");

    LinkedList<Integer> linkedList = new LinkedList();

    Date linkedInsertStart = new Date();

    for (int i = 0; i < 10000; i++) {
      linkedList.add(i * i);
    }

    Date linkedInsertEnd = new Date();

    System.out.println("LinkedList set time " + (linkedInsertEnd.getTime() - linkedInsertStart.getTime()) + " ms");

    // SEARCH TESTS //

    Date arrFindStart = new Date();

    Integer result1 = arrList.stream()
      .filter(elem -> elem == 622521)
      .findAny()
      .orElse(null);

    Date arrFindEnd = new Date();

    System.out.println("ArrayList search time " + (arrFindEnd.getTime() - arrFindStart.getTime()) + " ms");

    Date listFindStart = new Date();

    Integer result2 = linkedList.stream()
      .filter(elem -> elem == 622521)
      .findAny()
      .orElse(null);

    Date listFindEnd = new Date();

    System.out.println("LinkedList search time " + (listFindEnd.getTime() - listFindStart.getTime()) + " ms");

    // DELETE TESTS //

    Date arrayDeleteStart = new Date();

    for (int i = 0; i < arrList.size(); i += 0) {
      arrList.remove(i);
    }

    Date arrayDeleteEnd = new Date();

    System.out.println("ArrayList delete time " + (arrayDeleteEnd.getTime() - arrayDeleteStart.getTime()) + " ms");

    Date linkedDeleteStart = new Date();

    while (linkedList.size() > 0) {
      linkedList.remove();
    }

    Date linkedDeleteEnd = new Date();

    System.out.println("LinkedList delete time " + (linkedDeleteEnd.getTime() - linkedDeleteStart.getTime()) + " ms");
  }

}
