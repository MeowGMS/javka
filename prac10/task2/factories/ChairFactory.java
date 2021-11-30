package mirea.prac10.task2.factories;

import mirea.prac10.task2.FunctionalChair;
import mirea.prac10.task2.MagicChair;
import mirea.prac10.task2.VictorianChair;

public class ChairFactory implements AbstractChairFactory {
  public VictorianChair createVictorianChair(int age) {
    return new VictorianChair(age);
  }

  public MagicChair creteMagicChair() {
    return new MagicChair();
  }

  public FunctionalChair createFunctionalChair() {
    return new FunctionalChair();
  }
}
