package ru.mirea.task13;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(123);
        list.add(234);
        list.add(80);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
//        System.out.println(list.get(3)); // error

        ArrayList<Integer> list1 = new ArrayList<>(2);
        list1.add(5);
        list1.add(123);
        list1.set(1, 345);

        list.addAll(2, list1);
        System.out.println(list.get(3));
        System.out.println(list.indexOf(345));
        list.remove(3);
        System.out.println(list.get(3));
        System.out.println(list.size());

    }
}
