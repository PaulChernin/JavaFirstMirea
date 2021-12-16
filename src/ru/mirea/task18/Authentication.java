package ru.mirea.task18;

import java.util.HashMap;
import java.util.Scanner;

public class Authentication {
    private static Scanner in = new Scanner(System.in);

    private static HashMap<String, Integer> customers = new HashMap(){{
        put("J", 12);
        put("I", 78);
        put("S", 5);
    }};

    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите ИНН: ");
        int inn = in.nextInt();

        try {
            checkData(name, inn);
            System.out.println("Успешно");
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    private static void checkData(String name, int inn) throws Exception {
        if (customers.get(name) != inn) throw new Exception();
    }
}
