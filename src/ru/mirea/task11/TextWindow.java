package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TextWindow extends JFrame {
    JMenuBar menuBar = new JMenuBar();
    JMenu colorMenu = new JMenu("color");
    JMenu fontMenu = new JMenu("font");

    JTextArea textArea = new JTextArea();

    TextWindow() {
        super("Text");
        setSize(500, 150);

        setLayout(new GridLayout(2, 2));

        colorMenu.add(new JMenuItem(new AbstractAction("red") {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.RED);
            }
        }));
        colorMenu.add(new JMenuItem(new AbstractAction("green") {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.GREEN);
            }
        }));
        colorMenu.add(new JMenuItem(new AbstractAction("blue") {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(Color.BLUE);
            }
        }));

        fontMenu.add(new JMenuItem(new AbstractAction("Calibri") {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Calibri", Font.PLAIN, 12));
            }
        }));
        fontMenu.add(new JMenuItem(new AbstractAction("SansSerif") {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("SansSerif", Font.PLAIN, 12));
            }
        }));
        fontMenu.add(new JMenuItem(new AbstractAction("Serif") {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setFont(new Font("Serif", Font.PLAIN, 12));
            }
        }));

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        add(menuBar);
        add(textArea);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TextWindow();
    }
}
