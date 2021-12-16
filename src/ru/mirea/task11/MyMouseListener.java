package ru.mirea.task11;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    private final JFrame frame;
    String area;

    MyMouseListener(String area, JFrame frame) {
        this.area = area;
        this.frame = frame;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(area);
        JDialog dialog = new JDialog(frame, "Welcome");
        dialog.setSize(150, 50);

        JLabel label = new JLabel("Welcome to " + area);
        dialog.add(label);

        dialog.setVisible(true);
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
