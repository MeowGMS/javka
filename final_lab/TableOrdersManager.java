package mirea.final_lab;

import mirea.final_lab.errors.OrderAlreadyAddedException;

public class TableOrdersManager implements OrdersManager {
  private final int tables = 20;

  private final Order[] orders;

  public TableOrdersManager() {
    this.orders = new Order[tables];
  }

  public void add(Order order, int tableNumber) {
    if (this.orders[tableNumber] != null) {
      throw new OrderAlreadyAddedException("Со столиком или адресатом уже связан заказ");
    }

    this.orders[tableNumber] = order;
  }

  public void addItem(MenuItem item, int tableNumber) {
    Order order = this.getOrder(tableNumber);
    if (order == null) return;

    order.add(item);
  }

  public int freeTableNumber() {
    for (int i = 0; i < tables; i++) {
      Order order = this.getOrder(i);

      if (order == null) {
        return i;
      }
    }

    return -1;
  }

  public int[] freeTableNumbers() {
    int[] freeTables = new int[tables];

    for (int i = 0; i < tables; i++) {
      Order order = this.getOrder(i);

      if (order == null) {
        freeTables[i] = 1;
      }
    }

    return freeTables;
  }

  public Order getOrder(int tableNumber) {
    return this.orders[tableNumber];
  }

  private int tableOfOrder(Order order) {
    for (int i = 0; i < this.tables; i++) {
      if (this.orders[i] == order) return i;
    }

    return -1;
  }

  public void remove(int tableNumber) {
    this.orders[tableNumber] = null;
  }

  public void remove(Order order) {
    int tableOfOrder = this.tableOfOrder(order);
    if (tableOfOrder == -1) return;

    this.orders[tableOfOrder] = null;
  }

  public int removeAll(Order order) {
    int counter = 0;

    for (int i = 0; i < this.tables; i++) {
      if (this.orders[i] == order) {
        this.orders[i] = null;

        counter++;
      }
    }

    return counter;
  }

  public int itemsQuantity(MenuItem item) {
    int quantity = 0;

    for (int i = 0; i < this.tables; i++) {
      Order order = this.getOrder(i);
      if (order == null) continue;

      quantity += order.itemQuantity(item);
    }

    return quantity;
  }

  public int itemsQuantity(String itemName) {
    int quantity = 0;

    for (int i = 0; i < this.tables; i++) {
      Order order = this.getOrder(i);
      if (order == null) continue;

      quantity += order.itemQuantity(itemName);
    }

    return quantity;
  }

  public Order[] getOrders() {
    return this.orders;
  }

  public int ordersCostSummary() {
    int sum = 0;

    for (int i = 0; i < this.tables; i++) {
      Order order = this.getOrder(i);
      if (order == null) continue;

      sum += order.costTotal();
    }

    return sum;
  }

  public int ordersQuantity() {
    return this.getOrders().length;
  }
}
