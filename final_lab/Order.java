package mirea.final_lab;

public interface Order {
  boolean add(Item data);

  boolean remove(String dishName);

  int removeAll(String dishName);

  int orderSize();

  Item[] getItems();

  int costTotal();

  int itemQuantity(String itemName);

  String[] itemsNames();

  Item[] sortedItemsByCostDesc();
}
