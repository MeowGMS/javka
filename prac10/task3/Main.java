package mirea.prac10.task3;

import mirea.prac10.task3.ui.ApplicationUI;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    ApplicationUI application = new ApplicationUI();

    application.setPreferredSize(new Dimension(1024, 768));
    application.pack();
    application.setLocationRelativeTo(null);
    application.setVisible(true);
  }
}
