package ru.mirea.task27;

import java.util.*;

public class Names {
    private static Map<String, String> names = new HashMap(){{
        put("Андронов", "Кирилл");
        put("Анисимов", "Максим");
        put("Блинов", "Александр");
        put("Вакуленко", "Александра");
        put("Горбась", "Евгений");
        put("Дергачев", "Андрей");
        put("Евланов", "Никита");
        put("Лянной", "Андрей");
        put("Попов", "Максим");
        put("Романес", "Александр");
    }};

    public static void main(String[] args) {
        removeDuplicates();

        print();
    }

    private static void print() {
        Set<String> keys = names.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = names.get(key);

            System.out.println(key + " " + value);
        }
    }

    private static void removeDuplicates() {
        Set<String> added = new HashSet<>();
        Map<String, String> t = new HashMap<>();

        Set<String> keys = names.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = names.get(key);

            if (!added.contains(value)) {
                t.put(key, value);
                added.add(value);
            }
        }

        names = t;
    }
}
