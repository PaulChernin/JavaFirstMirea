package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScoreWindow extends JFrame {
    JButton btnMilanIncrement = new JButton("Milan");
    JButton btnMadridIncrement = new JButton("Madrid");
    JLabel lblResult = new JLabel("Result: 0 X 0");
    JLabel lblLastScorer = new JLabel("Last Scorer: N/A");
    JLabel lblWinner = new JLabel("Winner: DRAW");

    int madridScore = 0;
    int milanScore = 0;
    String lastScorer = "N/A";

    ScoreWindow() {
        super("Score");
        setSize(250, 250);

        setLayout(new GridLayout(3,2));

        add(btnMadridIncrement);
        add(btnMilanIncrement);
        add(lblResult);
        add(lblLastScorer);
        add(lblWinner);

        btnMadridIncrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                lastScorer = "Madrid";
                updateLabels();
            }
        });

        btnMilanIncrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer = "Milan";
                updateLabels();
            }
        });

        setVisible(true);
    }

    private void updateLabels() {
        lblResult.setText("Result: " + madridScore + " X " + milanScore);
        lblLastScorer.setText(lastScorer);

        String winner = (madridScore > milanScore)? "Madrid"
                : (madridScore == milanScore)? "DRAW"
                : "Milan";
        lblWinner.setText(winner);
    }

    public static void main(String[] args) {
        new ScoreWindow();
    }
}
