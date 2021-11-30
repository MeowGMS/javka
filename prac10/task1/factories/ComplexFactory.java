package mirea.prac10.task1.factories;

import mirea.prac10.task1.ComplexNumber;

public interface ComplexFactory {
  ComplexNumber createComplex();

  ComplexNumber createComplex(int real, int image);
}
