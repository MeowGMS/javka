package mirea.final_lab;

import java.util.HashMap;

public class OrderManager {
  public HashMap<String, Order> orders;

  public void addOrder(String address, Order order) {
    this.orders.put(address, order);
  }

  public Order getOrder(String address) {
    return this.orders.get(address);
  }

  public void deleteOrder(String address) {
    this.orders.remove(address);
  }

  public boolean addItemToOrder(String address, Item item) {
    Order order = this.getOrder(address);
    if (order == null) return false;

    return order.add(item);
  }
}
