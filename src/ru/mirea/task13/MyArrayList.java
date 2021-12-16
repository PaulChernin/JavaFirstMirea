package ru.mirea.task13;

import java.lang.reflect.Array;

public class MyArrayList<T extends Comparable> {
    MyArrayList() {

    }

    MyArrayList(int capacity) {
        array = new Comparable[capacity];
        this.capacity = capacity;
    }

    public void add(Comparable value) {
        if (size + 1 > capacity) {
            Comparable[] t = new Comparable[size + 1];
            for (int i = 0; i < size; i++) {
                t[i] = array[i];
            }
            array = t;
            capacity = size + 1;
        }

        array[size] = value;


        size++;
    }

    public T get(int i) {
        return (T) array[i];
    }

    public int indexOf(T value) {
        System.out.println(value);
        for (int i = 0; i < size; i++) {
            if (array[i].compareTo(value) == 0) return i;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }

        size--;
    }

    private int size = 0;
    private int capacity = 0;
    private Comparable[] array;
}
