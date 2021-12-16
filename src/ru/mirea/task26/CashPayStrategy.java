package ru.mirea.task26;

import java.util.Scanner;

public class CashPayStrategy implements PayStrategy {
    private static Scanner in = new Scanner(System.in);

    @Override
    public void pay() {
        System.out.println("Имя:");
        String name = in.nextLine();
        System.out.println("Адрес:");
        String address = in.nextLine();
        System.out.println("Оплата прошла успешно");
    }
}
