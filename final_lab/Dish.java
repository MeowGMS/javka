package mirea.final_lab;

public final class Dish extends MenuItem {
  Dish(String name, String description) {
    super(name, description);
  }

  Dish(double price, String name, String description) {
    super(price, name, description);
  }
}
