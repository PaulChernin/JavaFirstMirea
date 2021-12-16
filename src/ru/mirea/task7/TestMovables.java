package ru.mirea.task7;

public class TestMovables {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(5, 5, 2, 1);
        System.out.println(point);
        point.moveRight();
        point.moveRight();
        point.moveDown();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(-2, 0, 3, 3, 6);
        System.out.println(circle);
        circle.moveLeft();
        circle.moveUp();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(0, 0, 5, 4, 1, 1);
        System.out.println(rectangle);
        rectangle.moveRight();
        rectangle.moveUp();
        System.out.println(rectangle);

    }
}
