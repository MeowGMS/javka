package mirea.prac10.task1.factories;

import mirea.prac10.task1.ComplexNumber;

public class ConcreteFactory implements ComplexFactory {
  public ComplexNumber createComplex() {
    return new ComplexNumber();
  }

  public ComplexNumber createComplex(int real, int image) {
    return new ComplexNumber(real, image);
  }
}
