package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Output extends JFrame {
    JTextField jta = new JTextField(30);
    JButton button = new JButton("Load image");
    JLabel lbl = new JLabel("");

    Output() {
        super();
        setLayout(new BorderLayout());
        setSize(800, 800);
        JPanel jp = new JPanel(new FlowLayout());
        jp.add(new JLabel("Way to image:"));
        jp.add(jta);
        jp.add(button);
        add(jp, BorderLayout.NORTH);
        add(lbl, BorderLayout.CENTER);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ImageIcon icon = new ImageIcon(jta.getText());
                    lbl.setIcon(icon);
                    setSize(800, 800);
                } catch (Exception e1) {
                    lbl.setText(e1.getMessage());
                }
            }
        });
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}//C:\Users\IVC1-5\Desktop\Shtamp.png