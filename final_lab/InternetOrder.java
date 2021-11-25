package mirea.final_lab;

public class InternetOrder implements Order {
  private static class ListNode {
    ListNode next;
    ListNode prev;

    Item data;

    ListNode(Item data) {
      this.data = data;
    }
  }

  ListNode tail, head;

  int size = 0;

  InternetOrder() {}

  InternetOrder(Item[] items) {
    for (Item item : items) {
      this.add(item);
    }
  }

  public int getSize() {
    return this.size;
  }

  public boolean add(Item data) {
    ListNode tmp = new ListNode(data);

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

  public boolean remove(String dishName) {
    int index = this.indexByNameReversed(dishName);

    return this.removeByIndex(index);
  }

  public int removeAll(String dishName) {
    ListNode tmp = head;

    int counter = 0;
    int iterator = 0;

    while (iterator < this.getSize()) {
      if (tmp.data.getName().equals(dishName)) {
        tmp = tmp.next;

        this.removeByIndex(iterator);

        counter++;
      } else {
        tmp = tmp.next;
      }

      iterator++;
    }

    return counter;
  }

  public int orderSize() {
    return this.size;
  }

  public Item[] getItems() {}

  public int costTotal() {}

  public int itemQuantity(String itemName) {}

  public String[] itemsNames() {}

  public Item[] sortedItemsByCostDesc() {}

  private boolean removeByIndex(int index) {
    if (index == 0) {
      deleteFirst();
    } else if (index == size) {
      deleteLast();
    } else if (index > 0 && index < size) {
      ListNode tmp = head;

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

  private int indexByName(String itemName) {
    ListNode tmp = head;

    for (int i = 0; i < this.getSize(); i++) {
      if (tmp.data.getName().equals(itemName)) return i;

      tmp = tmp.next;
    }

    return -1;
  }

  private int indexByNameReversed(String itemName) {
    ListNode tmp = head;

    for (int i = this.getSize() - 1; i >= 0; i--) {
      if (tmp.data.getName().equals(itemName)) return i;

      tmp = tmp.next;
    }

    return -1;
  }

  private void deleteFirst() {
    if (head != null) {
      ListNode tmp = head;
      head = tmp.next;
      tmp.prev = null;
      size--;
    }
  }

  private void deleteLast() {
    if (tail != null) {
      ListNode tmp = tail;
      tail = tmp.prev;
      tmp.next = null;
      size--;
    }
  }
}
