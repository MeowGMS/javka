package mirea.prac10.task2;

public class FunctionalChair implements Chair {
  public void sit() {
    System.out.println("Вы сели на функциональный стул");
  }

  public int sum(int a, int b) {
    return a + b;
  }
}
