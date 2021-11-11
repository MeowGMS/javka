package mirea.lab22;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumGUI extends JFrame {
    private final Random random = new Random();
    private final String infoPattern = "Your number: %s %s";
    private final String attemptPattern = "Attempts: %s";

    private int attempts = 0;

    private JLabel infoLabelNumber;
    private JLabel attemptsLabel;
    private JLabel advertLabel = new JLabel();

    int numberToGuess = random.nextInt(20);

    public GuessNumGUI() {
        super("Guess Number Game");

        this.setBounds(400, 100, 600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container mainContainer = this.getContentPane();

        mainContainer.setLayout(new BoxLayout(mainContainer, BoxLayout.PAGE_AXIS));

        JLabel ruleMessage = new JLabel("Input number in range from 0 to 20");

        ruleMessage.setFont(new Font("Sans Serif", Font.PLAIN, 30));
        ruleMessage.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JTextField numberTextArea = new JTextField();

        numberTextArea.setMaximumSize(new Dimension(200,numberTextArea.getPreferredSize().height));

        JButton guessButton = new JButton("Guess");

        guessButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        guessButton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberTextArea.getText());
                    if (number >= 0 && number <= 20) {
                        updateGame(number);
                    }
                    else{
                        showMessage("Input correct number!");
                    }

                }
                catch (Exception exception){
                    showMessage("Input correct number!");
                }
            }
        });

        infoLabelNumber = new JLabel();
        infoLabelNumber.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        infoLabelNumber.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        attemptsLabel = new JLabel();
        attemptsLabel.setFont(new Font("Sans Serif", Font.PLAIN, 20));
        attemptsLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        advertLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        advertLabel.setBorder(new EmptyBorder(50,0,10,0));

        mainContainer.add(ruleMessage);
        mainContainer.add(numberTextArea);
        mainContainer.add(guessButton);
        mainContainer.add(infoLabelNumber);
        mainContainer.add(attemptsLabel);
        mainContainer.add(advertLabel);

        System.out.println(numberToGuess);
    }

    private void updateGame(int number){
        if (number == numberToGuess){
            showMessage("You win! The number is " + numberToGuess);
            clearGame();

            return;
        } else if (number > numberToGuess) {
            infoLabelNumber.setText(String.format(infoPattern, number, "is higher"));
        } else if (number < numberToGuess){
            infoLabelNumber.setText(String.format(infoPattern, number, "is less"));
        }

        attempts++;

        attemptsLabel.setText(String.format(attemptPattern,  attempts));

        if (attempts >= 3){
            showMessage("You lose! The number is " + numberToGuess);
            clearGame();
        }

    }

    private void clearGame(){
        numberToGuess = random.nextInt(20);
        attempts = 0;
        infoLabelNumber.setText("");
        attemptsLabel.setText("");

        System.out.println(numberToGuess);
    }

    private void showMessage(String text){
        JOptionPane.showMessageDialog(null, text,"Attention", JOptionPane.PLAIN_MESSAGE);
    }
}
