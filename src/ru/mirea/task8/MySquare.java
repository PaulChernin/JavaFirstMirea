package ru.mirea.task8;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class MySquare extends MyShape {
    MySquare(Color color, float x, float y) {
        super(color, x, y);
    }

    @Override
    Shape getFXShape() {
        Rectangle rect = new Rectangle(x, y, 80.0f, 80.0f);
        rect.setFill(color);
        return rect;
    }
}
