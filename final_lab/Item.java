package mirea.final_lab;

public interface Item {
  double getCost();

  String getName();
  String getDescription();

  void setCost(double cost);
  void setName(String name);
  void setDescription(String description);
}
