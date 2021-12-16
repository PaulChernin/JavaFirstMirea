package ru.mirea.task1;

import java.util.Arrays;

public class lab1 {
    private static void sum(int[] array) {
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        System.out.println(s);

        s = 0;
        int i = 0;
        while (i < array.length) {
            s += array[i];
            i++;
        }
        System.out.println(s);

        s = 0;
        i = 0;
        do {
            s += array[i];
            i++;
        } while (i < array.length);
        System.out.println(s);
    }

    private static void printArgs(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    private static void harmonics(int n) {
        System.out.println(1);
        for (int i = 2; i <= n; i++) {
            System.out.println("1/" + i);
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void randomSort() {
        int n = 10;
        int max = 1000;

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * max);
        }
        printArray(array);

        Arrays.sort(array);
        printArray(array);
    }

    public static void fact(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
       sum(array);

//        printArgs(args);
    //    harmonics(10);
//        randomSort();
        // fact(5);
    }
}
