package ru.mirea.task17;

import java.util.Scanner;

public class TestPlanets {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Укажите номер планеты");

        Planet p = Planet.Mercury;

        int n = scanner.nextInt();
        switch (n) {
            case 1:
                p = Planet.Mercury;
                break;
            case 2:
                p = Planet.Venus;
                break;
            case 3:
                p = Planet.Earth;
                break;
            case 4:
                p = Planet.Mars;
                break;
        }

        System.out.println(p.mass);
        System.out.println(p.radius);
        System.out.println(p.getGravity());
    }
}
