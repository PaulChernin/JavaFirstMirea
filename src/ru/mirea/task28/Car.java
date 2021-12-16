package ru.mirea.task28;

public class Car {
    Wheel[] wheels = new Wheel[4];

    Car() {
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    FuelTank fuelTank = new FuelTank() {
        @Override
        void fill() {
            System.out.println("Заливаем бензин👌");
        }
    };

    private class Wheel {
        int size;
        public void spin() {
            System.out.println("уиииии!!!!");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.fuelTank.fill();

        for (int i = 0; i < 4; i++) {
            car.wheels[i].spin();
        }
    }
}