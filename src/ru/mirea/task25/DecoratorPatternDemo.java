package ru.mirea.task25;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        rect.draw();

        Shape redRect = new ShapeDecorator(new Rectangle());
        redRect.draw();

        Shape redCircle = new ShapeDecorator(new Circle());
        redCircle.draw();
    }
}
