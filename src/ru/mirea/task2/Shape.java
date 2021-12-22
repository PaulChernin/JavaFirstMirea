package ru.mirea.task2;

public class Shape {
    String type;
    String color;

    Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
