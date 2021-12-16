package ru.mirea.task19;

public class Test {
    public static void main(String[] args) {
        try {
            RightTriangle triangle = new RightTriangle(89, 31, 60);
        } catch (WrongAnglesException e) {
            e.printStackTrace();
        }
    }
}