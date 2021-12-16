package ru.mirea.task20;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateInput {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите год, месяц, число, часы и минуты");
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        int hour = in.nextInt();
        int minute = in.nextInt();

        Date date = new Date(year, month, day, hour, minute);
        Calendar calendar = new GregorianCalendar(year, month, day, hour, minute);
    }
}
