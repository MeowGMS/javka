package mirea.prac10.task2;

public class VictorianChair implements Chair {
  private final int age;

  public void sit() {
    System.out.println("Вы сели на викторианский стул");
  }

  public VictorianChair(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}
