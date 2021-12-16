package ru.mirea.task27;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        int count = 4;
        City cities[] = new City[count];
        cities[0] = new City("Moscow", "Russia");
        cities[1] = new City("Petersburg", "Russia");
        cities[2] = new City("LA", "USA");
        cities[3] = new City("Washington", "USA");

        Map<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < count; i++) {
            String country = cities[i].country;
            String city = cities[i].name;

            if (map.containsKey(country)) {
                map.get(country).add(city);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(city);
                map.put(country, list);
            }
        }

        Set<String> countries = map.keySet();
        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            ArrayList<String> list = map.get(key);

            System.out.println(key);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(" " + list.get(i));
            }
            System.out.println();
        }
    }
}
