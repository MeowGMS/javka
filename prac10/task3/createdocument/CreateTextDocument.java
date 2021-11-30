package mirea.prac10.task3.createdocument;

import mirea.prac10.task3.documents.IDocument;
import mirea.prac10.task3.documents.TextDocument;

public class CreateTextDocument implements ICreateDocument {
  public IDocument createNew() {
    return new TextDocument();
  }

  public IDocument open() {
    return new TextDocument();
  }
}
