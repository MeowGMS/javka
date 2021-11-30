package mirea.final_lab;

public final class Customer {
  private String firstName;
  private String secondName;

  private int age;

  private Address address;

  public static final Customer MATURE_UNKNOWN_CUSTOMER = new Customer("Firstname", "Surname", 18, Address.EMPTY_ADDRESS);
  public static final Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer("Firstname", "Surname", 16, Address.EMPTY_ADDRESS);

  public Customer(String firstName, String secondName, int age, Address address) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.age = age;
    this.address = address;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getSecondName() {
    return this.secondName;
  }

  public int getAge() {
    return this.age;
  }

  public Address getAddress() {
    return this.address;
  }
}
