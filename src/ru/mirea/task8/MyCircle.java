package ru.mirea.task8;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class MyCircle extends MyShape {
    MyCircle(Color color, float x, float y) {
        super(color, x, y);
    }

    @Override
    Shape getFXShape() {
        return new Circle(x, y, 40.0f, color);
    }
}
