package ru.mirea.task22;

public class VictorianFactory implements ChairFactory {

    @Override
    public Chair createChair() {
        return new Chair() {
            @Override
            public void use() {
                System.out.println("using victorian chair");
            }
        };
    }
}
