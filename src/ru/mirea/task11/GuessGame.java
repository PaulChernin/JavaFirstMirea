package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessGame extends JFrame {
    JTextArea textArea = new JTextArea();
    JButton button = new JButton("Угадать");
    JLabel label = new JLabel("Введите число");

    int number;
    int count;

    GuessGame() {
        super("Guess Game");
        setSize(500, 150);

        setLayout(new GridLayout(2, 2));

        add(textArea);
        add(button);
        add(label);

        startGame();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int guess = Integer.parseInt(textArea.getText());
                count++;
                if (number == guess) {
                    label.setText("Вы победили!");
                    startGame();
                } else if (count == 3) {
                    label.setText("Вы проиграли");
                    startGame();
                } else if (number > guess) {
                    label.setText("Число должно быть больше");
                } else {
                    label.setText("Число должно быть меньше");
                }
            }
        });

        setVisible(true);
    }

    private void startGame() {
        number = (int) (Math.random() * 20);
        System.out.println(number);
        count = 0;
    }

    public static void main(String[] args) {
        new GuessGame();
    }
}
