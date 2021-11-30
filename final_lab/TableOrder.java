package mirea.final_lab;

public class TableOrder implements Order {
  int size = 20;

  private Customer customer;

  MenuItem[] items;

  TableOrder(MenuItem[] items) {
    this.items = new MenuItem[20];

    for (MenuItem item : items) {
      this.add(item);
    }
  }

  public String[] itemsNames() {
    String[] names = new String[this.items.length];

    for (int i = 0; i < this.items.length; i++) {
      names[i] = this.items[i].getName();
    }

    return names;
  }

  public int itemsQuantity() {
    int quantity = 0;

    for (int i = 0; i < this.items.length; i++) {
      quantity++;
    }

    return quantity;
  }

  public int itemQuantity(String itemName) {
    int quantity = 0;

    for (MenuItem item : this.items) {
      if (item.getName().equals(itemName)) {
        quantity++;
      }
    }

    return quantity;
  }

  public int itemQuantity(MenuItem item) {
    int quantity = 0;

    for (MenuItem forItem : this.items) {
      if (item.getName().equals(forItem.getName())) {
        quantity++;
      }
    }

    return quantity;
  }

  public MenuItem[] getItems() {
    return this.items;
  }

  public boolean add(MenuItem item) {
    for (int i = 0; i < this.size; i++) {
       if (this.items[i] == null) {
         this.items[i] = item;

         return true;
       }
    }

    return false;
  }

  public boolean remove(String itemName) {
    for (int i = 0; i < this.size; i++) {
      if (this.items[i].getName().equals(itemName)) {
        this.items[i] = null;

        return true;
      }
    }

    return false;
  }

  public boolean remove(MenuItem item) {
    for (int i = 0; i < this.size; i++) {
      if (this.items[i].equals(item)) {
        this.items[i] = null;

        return true;
      }
    }

    return false;
  }

  public int removeAll(String itemName) {
    int counter = 0;

    for (int i = 0; i < this.size; i++) {
      if (this.items[i].getName().equals(itemName)) {
        this.items[i] = null;

        counter++;
      }
    }

    return counter;
  }

  public int removeAll(MenuItem item) {
    int counter = 0;

    for (int i = 0; i < this.size; i++) {
      if (this.items[i].equals(item)) {
        this.items[i] = null;

        counter++;
      }
    }

    return counter;
  }

  public MenuItem[] sortedItemsByCostDesc() {
    return this.bubbleSort(this.items);
  }

  public int costTotal() {
    int quantity = 0;

    for (MenuItem item : this.items) {
      quantity += item.getCost();
    }

    return quantity;
  }

  public Customer getCustomer() {
    return this.customer;
  }

  public void setCustomer(Customer customer) {}

  private MenuItem[] bubbleSort(MenuItem[] array) {
    boolean swapped = true;

    MenuItem[] arrToReturn = new MenuItem[this.items.length];

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
}
