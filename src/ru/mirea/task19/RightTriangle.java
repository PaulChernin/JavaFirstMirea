package ru.mirea.task19;

public class RightTriangle {
    private int a, b, c;

    RightTriangle(int a, int b, int c) throws WrongAnglesException {
        if (!makesRightTriangle(a, b, c)) {
            throw new WrongAnglesException();
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean makesRightTriangle(int a, int b, int c) {
        return (a + b + c == 180) && (a == 90 || b == 90 || c == 90);
    }
}
