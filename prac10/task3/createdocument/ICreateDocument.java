package mirea.prac10.task3.createdocument;

import mirea.prac10.task3.documents.IDocument;

public interface ICreateDocument {
  IDocument createNew();

  IDocument open();
}
