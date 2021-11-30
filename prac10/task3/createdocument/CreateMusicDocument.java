package mirea.prac10.task3.createdocument;

import mirea.prac10.task3.documents.IDocument;
import mirea.prac10.task3.documents.MusicDocument;

public class CreateMusicDocument implements ICreateDocument {
  public IDocument createNew() {
    return new MusicDocument();
  }

  public IDocument open() {
    return new MusicDocument();
  }
}
