package ru.mirea.task2;

public class Ball {
    private String color;
    private double size;
    private String material;

    public Ball() {
        color = "red";
        size = 20.0;
        material = "rubber";
    }

    public Ball(String color, double size, String material) {
        this.color = color;
        this.size = size;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return color + " ball of " +
                material +
                ", size " + size;
    }
}
