package ru.mirea.task23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String str1 = "qwertyuiop[]";
        String str2 = "qwertyuiop[]";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1.hashCode() == str2.hashCode());

        String str3 = "qwertuiop[[";
        System.out.println(str3.hashCode());
        System.out.println(str1.hashCode() == str3.hashCode());

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list1.hashCode());
        System.out.println(list2.hashCode());
        System.out.println(list1.hashCode() == list2.hashCode());
    }
}
