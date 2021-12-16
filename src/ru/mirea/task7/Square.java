package ru.mirea.task7;

public class Square extends Rectangle {
    Square() {}

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + width +
                '}';
    }
}
