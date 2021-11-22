package mirea.prac9.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class LabClassUI extends JFrame {

    private List<Student> students;
    private JLabel studentLabel;

    public LabClassUI(){
        super("Lab Class");

        this.setBounds(400, 100, 600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initStudents();

        Container container  = this.getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));


        JLabel label = new JLabel("Найти студента по имени");

        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        label.setFont(defaultFont());

        JTextField textField = new JTextField();

        textField.setMaximumSize(new Dimension(200, textField.getPreferredSize().height));
        textField.addActionListener(e -> {
            try {
                findStudent(textField.getText());
            } catch (EmptyStringException emptyStringException) {
                studentLabel.setText("Введите имя");
            } catch (StudentNotFoundException studentNotFoundException){
                studentLabel.setText("Студент не найден");
            }
        });

        JButton findStudentButton = new JButton("Найти студента");
        findStudentButton.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        findStudentButton.setFont(defaultFont());
        findStudentButton.addActionListener(e -> {
            try {
                findStudent(textField.getText());
            } catch (EmptyStringException emptyStringException) {
                studentLabel.setText("Введите имя");
            } catch (StudentNotFoundException studentNotFoundException){
                studentLabel.setText("Студент не найден");
            }
        });

        studentLabel = new JLabel();
        studentLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        studentLabel.setFont(defaultFont());


        container.add(label);
        container.add(textField);
        container.add(findStudentButton);
        container.add(studentLabel);
    }

    private Font defaultFont(){
        return new Font("Sans Serif", Font.PLAIN, 20);
    }

    private void initStudents(){
        this.students = LabClassDriver.generateListOfStudents(10);
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private void findStudent(String name) throws EmptyStringException {

        if (name.isEmpty()){
            throw new EmptyStringException(name + " не найден");
        }

        boolean studentsWasFound = false;

        StringBuilder builder = new StringBuilder();
        for (Student s : students){
            if (s.getName().equals(name)){
                builder.append(s.toString());
                builder.append("\n");
                studentsWasFound = true;
            }
        }

        if (!studentsWasFound){
            throw new StudentNotFoundException("Студент не найден");
        }

        studentLabel.setText(builder.toString());
    }

}
