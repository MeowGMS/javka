package mirea.final_lab;

public class InternetOrdersManager implements OrdersManager {
  private static class QueueNode {
    QueueNode next;
    QueueNode prev;

    Order value;

    QueueNode(Order value) {
      this.value = value;
    }
  }

  QueueNode head;
  QueueNode tail;

  int size = 0;

  public int itemsQuantity(MenuItem item) {
    int quantity = 0;

    QueueNode tmp = head;

    for (int i = 0; i < size; i++) {
      tmp = tmp.next;

      quantity += tmp.value.itemQuantity(item);
    }

    return quantity;
  }

  public int itemsQuantity(String itemName) {
    int quantity = 0;

    QueueNode tmp = head;

    for (int i = 0; i < size; i++) {
      tmp = tmp.next;

      quantity += tmp.value.itemQuantity(itemName);
    }

    return quantity;
  }

  public Order[] getOrders() {
    Order[] orders = new Order[size];

    QueueNode tmp = head;

    for (int i = 0; i < size; i++) {
      tmp = tmp.next;

      orders[i] = tmp.value;
    }

    return orders;
  }

  public int ordersCostSummary() {
    int sum = 0;

    QueueNode tmp = head;

    for (int i = 0; i < size; i++) {
      tmp = tmp.next;

      sum += tmp.value.costTotal();
    }

    return sum;
  }

  public int ordersQuantity() {
    return this.getOrders().length;
  }

  public boolean add(Order order) {
    QueueNode tmp = new QueueNode(order);

    if (tail == null) {
      tail = tmp;
      head = tmp;
    } else {
      tail.next = tmp;
      tmp.prev = tail;

      tail = tmp;
    }

    size++;

    return true;
  }

  public boolean remove(Order order) {
    int index = this.indexByNameReversed(order);

    return this.removeByIndex(index);
  }

  private boolean removeByIndex(int index) {
    if (index == 0) {
      deleteFirst();
    } else if (index == size) {
      deleteLast();
    } else if (index > 0 && index < size) {
      QueueNode tmp = head;

      for (int i = 0; i < index; i++) {
        tmp = tmp.next;
      }

      tmp.next.prev = tmp.prev;
      tmp.prev.next = tmp.next;

      size--;
    } else {
      return false;
    }

    return true;
  }

  private int indexByNameReversed(Order order) {
    QueueNode tmp = head;

    for (int i = this.size - 1; i >= 0; i--) {
      if (tmp.value.equals(order)) return i;

      tmp = tmp.next;
    }

    return -1;
  }

  private void deleteFirst() {
    if (head != null) {
      QueueNode tmp = head;

      head = tmp.next;
      tmp.prev = null;

      size--;
    }
  }

  private void deleteLast() {
    if (tail != null) {
      QueueNode tmp = tail;

      tail = tmp.prev;
      tmp.next = null;

      size--;
    }
  }
}
