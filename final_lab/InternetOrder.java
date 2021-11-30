package mirea.final_lab;

public class InternetOrder implements Order {
  private static class ListNode {
    ListNode next;
    ListNode prev;

    MenuItem value;

    ListNode(MenuItem value) {
      this.value = value;
    }
  }

  private Customer customer;

  ListNode head;
  ListNode tail;

  int size = 0;

  InternetOrder(Customer customer, MenuItem[] items) {
    this.customer = customer;

    for (MenuItem item : items) {
      this.add(item);
    }
  }

  private MenuItem[] bubbleSort(MenuItem[] array) {
    boolean swapped = true;

    MenuItem[] arrToReturn = new MenuItem[this.getSize()];

    int j = 0;

    MenuItem tmp;

    while (swapped) {
      swapped = false;

      j++;

      for (int i = 0; i < array.length - j; i++) {
        if (array[i].getCost() > array[i + 1].getCost()) {
          tmp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = tmp;
          swapped = true;
        }
      }
    }

    return arrToReturn;
  }

  public int getSize() {
    return this.size;
  }

  public boolean add(MenuItem data) {
    if (data.getCost() < 0) {
      throw new IllegalArgumentException("Стоимость напитка или блюда не должна быть меньше 0");
    }

    if (data.getName().equals("") || data.getDescription().equals("")) {
      throw new IllegalArgumentException("Имя или описание не должно быть пустым");
    }

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

  public boolean remove(MenuItem item) {
    int index = this.indexByNameReversed(item.getName());

    return this.removeByIndex(index);
  }

  public int removeAll(String dishName) {
    ListNode tmp = head;

    int counter = 0;
    int iterator = 0;

    while (iterator < this.getSize()) {
      if (tmp.value.getName().equals(dishName)) {
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

  public int removeAll(MenuItem item) {
    ListNode tmp = head;

    int counter = 0;
    int iterator = 0;

    while (iterator < this.getSize()) {
      if (tmp.value.equals(item)) {
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

  public MenuItem[] getItems() {
    MenuItem[] items = new MenuItem[this.getSize()];

    ListNode tmp = head;

    for (int i = 0; i < this.getSize(); i++) {
      tmp = tmp.next;

      items[i] = tmp.value;
    }

    return items;
  }

  public int costTotal() {
    ListNode tmp = head;

    int totalCost = 0;

    for (int i = 0; i < this.getSize(); i++) {
      tmp = tmp.next;

      totalCost += tmp.value.getCost();
    }

    return totalCost;
  }

  public int itemQuantity(String itemName) {
    int quantity = 0;

    ListNode tmp = head;

    for (int i = 0; i < this.getSize(); i++) {
      tmp = tmp.next;

      if (tmp.value.getName().equals(itemName)) {
        quantity++;
      }
    }

    return quantity;
  }

  public int itemQuantity(MenuItem item) {
    int quantity = 0;

    ListNode tmp = head;

    for (int i = 0; i < this.getSize(); i++) {
      tmp = tmp.next;

      if (tmp.value.equals(item)) {
        quantity++;
      }
    }

    return quantity;
  }

  public String[] itemsNames() {
    String[] names = new String[this.size];

    ListNode tmp = head;

    for (int i = 0; i < this.getSize(); i++) {
      tmp = tmp.next;

      names[i] = tmp.value.getName();
    }

    return names;
  }

  public MenuItem[] sortedItemsByCostDesc() {
    return this.bubbleSort(this.getItems());
  }

  public Customer getCustomer() {
    return this.customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

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
      if (tmp.value.getName().equals(itemName)) return i;

      tmp = tmp.next;
    }

    return -1;
  }

  private int indexByNameReversed(String itemName) {
    ListNode tmp = head;

    for (int i = this.getSize() - 1; i >= 0; i--) {
      if (tmp.value.getName().equals(itemName)) return i;

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
