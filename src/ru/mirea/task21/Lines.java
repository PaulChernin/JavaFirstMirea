package ru.mirea.task21;

import java.util.ArrayList;
import java.util.List;

public class Lines {
    public static List<String> lines = new ArrayList<>(){{
        add("Сокольническая");
        add("Солнцевская");
        add("Кольцевая");
        add("Филевская");
        add("Калининская");
    }};

    public static void printList(boolean even) {
        int i = even? 0 : 1;
        for (; i < lines.size(); i += 2) {
            System.out.println(lines.get(i));
        }
    }

    public static void main(String[] args) {
        printList(true);
    }

}
