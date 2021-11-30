package mirea.prac10.task2;

import mirea.prac10.task2.factories.AbstractChairFactory;
import mirea.prac10.task2.factories.ChairFactory;

import java.util.Scanner;

public class Client {
  private static final AbstractChairFactory factory = new ChairFactory();
  private static Chair chair;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Выберите стул\n0 - Functional\n1 - Magic\n2 - Victorian\n");

    int chairNum = sc.nextInt();

    if (chairNum == 0) {
      chair = factory.createFunctionalChair();
    } else if (chairNum == 1) {
      chair = factory.creteMagicChair();
    } else if (chairNum == 2) {
      chair = factory.createVictorianChair(150);
    }

    sit();

    if (chair instanceof FunctionalChair) {
      System.out.print("Числа для суммы: ");

      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(((FunctionalChair) chair).sum(a, b));
    } else if (chair instanceof MagicChair) {
      ((MagicChair) chair).doMagic();
    } else if (chair instanceof VictorianChair) {
      System.out.println(((VictorianChair) chair).getAge());
    }
  }

  private static void sit() {
    chair.sit();
  }
}
