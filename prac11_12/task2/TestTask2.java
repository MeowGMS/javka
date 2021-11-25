package mirea.prac11_12.task2;

public class TestTask2 {
  public static void main(String[] args) {
    Address address1 = new Address("Russia, Voronezh obl, Voronezh, Generala Zhukova, 23, 1, 101", ", ");
    Address address2 = new Address("Russia, Moscow, -, Verndaskogo, 78, B, 1", ", ");
    Address address3 = new Address("Russia:Voronezh obl:Voronezh:Generala Zhukova:23:1:101", ":");
    Address address4 = new Address("Russia;Moscow;-;Verndaskogo;78;B;1", ";");
  }
}
