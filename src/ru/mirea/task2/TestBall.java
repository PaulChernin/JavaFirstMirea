package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball);
        ball.setSize(10);
        System.out.println(ball);

        Ball ball1 = new Ball("green", 30, "leather");
        System.out.println(ball1.getMaterial());
    }

}
