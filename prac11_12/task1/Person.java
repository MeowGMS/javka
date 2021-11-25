package mirea.prac11_12.task1;

public class Person {
  String firstName;
  String secondName;
  String patronymic;

  Person(String firstName) {
    this.firstName = firstName;
  }

  Person(String firstName, String secondName, String patronymic) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.patronymic = patronymic;
  }

  public String getFullName() {
    StringBuilder sb = new StringBuilder(this.firstName);

    if (this.secondName != null) sb.append(" " + this.secondName);
    if (this.patronymic != null) sb.append(" " + this.patronymic);

    return sb.toString();
  }
}
