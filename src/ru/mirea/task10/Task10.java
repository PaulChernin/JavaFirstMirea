package ru.mirea.task10;

import java.util.Scanner;

public class Task10 {
    static Scanner in = new Scanner(System.in);

    static void task12() {
        int x = in.nextInt();
        if (x == 0) {
            return;
        }

        if (x % 2 == 1) {
            System.out.println(x);
        }

        task12();
    }

    private static void task13() {
        int x = in.nextInt();
        if (x == 0) {
            return;
        }

        System.out.println(x);

        int y = in.nextInt();
        if (y == 0) {
            return;
        }

        task13();
    }

    private static void task14(int x, int i) {
        int n = 0;
        int y = x;
        while (y > 0) {
            y /= 10;
            n++;
        }

        int p = 1;
        for (int j = 0; j < n - i - 1; j++) {
            p *= 10;
        }

        int d = (x / p) % 10;
        System.out.println(d);

        if (i < n - 1) task14(x, ++i);
    }

    public static void main(String[] args) {
//        task12();
//        task13();
        task14(67403, 0);
    }
}
