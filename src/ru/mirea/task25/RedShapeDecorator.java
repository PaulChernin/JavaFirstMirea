package ru.mirea.task25;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setRedBorder();
        super.draw();
    }

    private void setRedBorder() {
        System.out.println("border color is red");
    }
}
