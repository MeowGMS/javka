package mirea.final_lab;

public class MenuItem {
  private final double cost;

  private final String name;
  private final String description;

  MenuItem(String name, String description) {
    this.cost = 0;
    this.name = name;
    this.description = description;
  }

  MenuItem(double price, String name, String description) {
    this.cost = price;
    this.name = name;
    this.description = description;
  }

  public double getCost() {
    return this.cost;
  }

  public String getDescription() {
    return this.description;
  }

  public String getName() {
    return this.name;
  }
}
