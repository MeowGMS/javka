package mirea.prac10.task1;

import mirea.prac10.task1.factories.ComplexFactory;
import mirea.prac10.task1.factories.ConcreteFactory;

public class TestPrac10Task1 {
  public static void main(String[] args) {
    ComplexFactory complexFactory = new ConcreteFactory();

    ComplexNumber complex1 = complexFactory.createComplex();

    System.out.println(complex1);

    ComplexNumber complex2 = complexFactory.createComplex(5, 3);

    System.out.println(complex2);
  }
}
