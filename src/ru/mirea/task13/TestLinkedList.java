package ru.mirea.task13;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(345);
        list.addFirst(24);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeLast();
        System.out.println(list.getLast());
        list.set(0, 577);
        System.out.println(list.get(0));
    }
}
