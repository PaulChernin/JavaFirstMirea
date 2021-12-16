package ru.mirea.task26;

import java.util.Scanner;

public class CardPayStrategy implements PayStrategy {
    private static Scanner in = new Scanner(System.in);

    @Override
    public void pay() {
        System.out.println("Номер карты:");
        String card = in.nextLine();
        System.out.println("Три цифры на обороте:");
        String cvv = in.nextLine();
        System.out.println("Оплата прошла успешно");
    }
}
