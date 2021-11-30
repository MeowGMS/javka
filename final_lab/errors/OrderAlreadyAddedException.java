package mirea.final_lab.errors;

public class OrderAlreadyAddedException extends RuntimeException {
  public OrderAlreadyAddedException(String message) {
    super(message);
  }
}
