package ru.mirea.task8;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public abstract class MyShape {
    protected Color color;
    protected float x;
    protected float y;

    MyShape(Color color, float x, float y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    abstract Shape getFXShape();
}
