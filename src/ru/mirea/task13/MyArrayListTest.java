package ru.mirea.task13;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyArrayListTest {
    @Test
    void get() {
        MyArrayList<Integer> list = new MyArrayList<>();

        int i0 = 123, i1 = 234, i2 = 80;
        list.add(i0);
        list.add(i1);
        list.add(i2);

        Assert.assertEquals((Object) i0, list.get(0));
        Assert.assertEquals((Object) i1, list.get(1));
        Assert.assertEquals((Object) i2, list.get(2));
    }

    @Test
    void indexOf() {
        MyArrayList<Integer> list = new MyArrayList<>();

        int i0 = 123, i1 = 234, i2 = 80;
        list.add(i0);
        list.add(i1);
        list.add(i2);

        Assert.assertEquals(0, list.indexOf(123));
        Assert.assertEquals(1, list.indexOf(234));
        Assert.assertEquals(2, list.indexOf(80));
    }

    @Test
    void size() {
        MyArrayList<Integer> list = new MyArrayList<>();

        int i0 = 123, i1 = 234, i2 = 80;
        Assert.assertEquals(0, list.size());
        list.add(i0);
        Assert.assertEquals(1, list.size());
        list.add(i1);
        Assert.assertEquals(2, list.size());
        list.add(i2);
        Assert.assertEquals(3, list.size());
    }

    @Test
    void remove() {
        MyArrayList<Integer> list = new MyArrayList<>();

        int i0 = 123, i1 = 234, i2 = 80;
        list.add(i0);
        list.add(i1);
        list.add(i2);

        list.remove(1);
        Assert.assertEquals((Object) i0, list.get(0));
        Assert.assertEquals((Object) i2, list.get(1));
    }
}