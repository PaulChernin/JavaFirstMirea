package ru.mirea.task17;

public enum Planet {
    Mercury(3, 2440),
    Venus(49, 6051),
    Earth(60, 6371),
    Mars(6, 3396);

    public int mass;
    public int radius;

    Planet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
    }

    int getGravity() {
        return (int) (mass * radius * 6.67);
    }
}
