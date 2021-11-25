package mirea.final_lab;

public final class Drink implements Item {
  private static final double DEFAULT_PRICE = 0;

  private double cost;

  private String name;
  private String description;

  Drink(String name, String description) {
    this.cost = DEFAULT_PRICE;
    this.name = name;
    this.description = description;
  }

  Drink(double price, String name, String description) {
    this.cost = price;
    this.name = name;
    this.description = description;
  }

  public double getCost() {
    return this.cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
