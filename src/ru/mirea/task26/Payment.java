package ru.mirea.task26;

import java.util.Scanner;

public class Payment {
    private static Scanner in = new Scanner(System.in);

    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay() {
        payStrategy.pay();
    }

    public static void main(String[] args) {
        Payment payment = new Payment();

        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - Google Pay");
        System.out.println("2 - Карта");
        System.out.println("3 - Наличные");

        int option = in.nextInt();
        switch (option) {
            case 1:
                payment.setPayStrategy(new GooglePayStrategy());
            case 2:
                payment.setPayStrategy(new CardPayStrategy());
            case 3:
                payment.setPayStrategy(new CashPayStrategy());
        }

        payment.pay();
    }
}
