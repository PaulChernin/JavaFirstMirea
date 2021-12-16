package ru.mirea.task26;

import java.util.Scanner;

public class GooglePayStrategy implements PayStrategy {
    private static Scanner in = new Scanner(System.in);

    @Override
    public void pay() {
        System.out.println("Аккаунт Google:");
        String account = in.nextLine();
        System.out.println("Пароль:");
        String password = in.nextLine();
        System.out.println("Оплата прошла успешно");
    }
}
