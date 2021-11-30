package mirea.final_lab;

public interface Order {
  boolean add(MenuItem data);

  String[] itemsNames();

  int itemQuantity(String itemName);

  int itemQuantity(MenuItem item);

  MenuItem[] getItems();

  boolean remove(String itemName);

  boolean remove(MenuItem item);

  int removeAll(String itemName);

  int removeAll(MenuItem item);

  MenuItem[] sortedItemsByCostDesc();

  int costTotal();

  Customer getCustomer();

  void setCustomer(Customer customer);
}
