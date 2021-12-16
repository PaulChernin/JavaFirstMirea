package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BorderWindow extends JFrame {
    JLabel north = new JLabel("North");
    JLabel west = new JLabel("West");
    JLabel center = new JLabel("Center");
    JLabel east = new JLabel("East");
    JLabel south = new JLabel("South");

    BorderWindow() {
        super("Border");
        setSize(500, 150);

        setLayout(new BorderLayout());

        north.addMouseListener(new MyMouseListener("north", this));
        west.addMouseListener(new MyMouseListener("west", this));
        center.addMouseListener(new MyMouseListener("center", this));
        east.addMouseListener(new MyMouseListener("east", this));
        south.addMouseListener(new MyMouseListener("south", this));

        add(north, BorderLayout.NORTH);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);
        add(east, BorderLayout.EAST);
        add(south, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderWindow();
    }
}
