package mirea.prac10.task2.factories;

import mirea.prac10.task2.FunctionalChair;
import mirea.prac10.task2.MagicChair;
import mirea.prac10.task2.VictorianChair;

public interface AbstractChairFactory {
  VictorianChair createVictorianChair(int age);

  MagicChair creteMagicChair();

  FunctionalChair createFunctionalChair();
}
