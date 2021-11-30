package mirea.prac10.task3.createdocument;

import mirea.prac10.task3.documents.IDocument;
import mirea.prac10.task3.documents.ImageDocument;

public class CreateImageDocument implements ICreateDocument {
  public IDocument createNew() {
    return new ImageDocument();
  }

  public IDocument open() {
    return new ImageDocument();
  }
}
